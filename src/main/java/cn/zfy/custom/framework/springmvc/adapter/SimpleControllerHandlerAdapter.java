package cn.zfy.custom.framework.springmvc.adapter;

import cn.zfy.custom.framework.springmvc.handler.iface.SimpleControllerHandler;
import cn.zfy.custom.framework.springmvc.model.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Classname SimpleControllerHandlerAdapter
 * @Description
 * @Date 2021/12/23 16:16
 * @Created by zfy
 */
public class SimpleControllerHandlerAdapter implements HandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return handler instanceof SimpleControllerHandler;
    }

    @Override
    public ModelAndView handleRequest(Object handler, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return ((SimpleControllerHandler) handler).handleRequest(request, response);
    }
}
