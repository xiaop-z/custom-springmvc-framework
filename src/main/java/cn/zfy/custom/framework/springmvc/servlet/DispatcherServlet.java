package cn.zfy.custom.framework.springmvc.servlet;

import cn.zfy.custom.framework.springmvc.adapter.HandlerAdapter;
import cn.zfy.custom.framework.springmvc.adapter.HttpRequestHandlerAdapter;
import cn.zfy.custom.framework.springmvc.adapter.SimpleControllerHandlerAdapter;
import cn.zfy.custom.framework.springmvc.exception.URLNotFoundException;
import cn.zfy.custom.framework.springmvc.mapping.BeanNameUrlHandlerMapping;
import cn.zfy.custom.framework.springmvc.mapping.SimpleUrlHandlerMapping;
import cn.zfy.custom.framework.springmvc.mapping.iface.HandlerMapping;
import cn.zfy.custom.framework.springmvc.utils.CollectionUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @Classname DispatcherServlet
 * @Description springmvc 统一处理所有servlet请求
 * @Created by zfy
 */
public class DispatcherServlet extends AbstractServlet {

    private final List<HandlerAdapter> handlerAdapterList = new ArrayList<>();

    private final List<HandlerMapping> handlerMappingList = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        this.handlerAdapterList.addAll(Arrays.asList(
                new HttpRequestHandlerAdapter(),
                new SimpleControllerHandlerAdapter()
        ));
        this.handlerMappingList.addAll(Arrays.asList(
                new BeanNameUrlHandlerMapping(),
                new SimpleUrlHandlerMapping()
        ));
    }

    @Override
    protected void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws Exception {

        //根据请求找到对应的处理类(要求处理类和servlet没有任何关系)
        Object handler = this.getHandler(req);
        //调用处理类的方法处理请求
        HandlerAdapter handlerAdapter = this.getHandlerAdapter(handler);
        if (null == handlerAdapter) throw new URLNotFoundException("404 未知路径");
        handlerAdapter.handleRequest(handler, req, resp);
        //将处理结果相应给客户端
    }

    private HandlerAdapter getHandlerAdapter(Object handler) {
        if (CollectionUtils.isEmpty(this.handlerAdapterList)) return null;
        Optional<HandlerAdapter> optionalHandlerAdapter = this.handlerAdapterList.stream().filter(handlerAdapter -> handlerAdapter.supports(handler)).findFirst();
        return optionalHandlerAdapter.orElseGet(null);
    }

    private Object getHandler(HttpServletRequest req) {
        if (CollectionUtils.isEmpty(this.handlerMappingList)) return null;
        for (HandlerMapping handlerMapping : handlerMappingList) {
            Object handler = handlerMapping.getHandler(req);
            if (null != handler) return handler;
        }
        return null;
    }
}
