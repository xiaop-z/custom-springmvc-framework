package cn.zfy.custom.framework.springmvc.adapter;

import cn.zfy.custom.framework.springmvc.handler.iface.HttpRequestHandler;
import cn.zfy.custom.framework.springmvc.model.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Classname HttpRequestHandlerAdapter
 * @Description 适配并执行httpRequestHandler处理器
 * @Date 2021/12/23 16:12
 * @Created by zfy
 */
public class HttpRequestHandlerAdapter implements HandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return handler instanceof HttpRequestHandler;
    }

    @Override
    public ModelAndView handleRequest(Object handler, HttpServletRequest request, HttpServletResponse response) throws Exception {
        ((HttpRequestHandler) handler).handleRequest(request, response);
        return null;
    }
}
