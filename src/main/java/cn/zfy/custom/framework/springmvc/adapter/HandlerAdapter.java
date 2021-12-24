package cn.zfy.custom.framework.springmvc.adapter;

import cn.zfy.custom.framework.springmvc.model.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Classname HandlerAdapter
 * @Description 处理器适配器接口
 * @Date 2021/12/23 16:11
 * @Created by zfy
 */
public interface HandlerAdapter {

    boolean supports(Object handler);

    ModelAndView handleRequest(Object handler, HttpServletRequest request, HttpServletResponse response) throws Exception;


}
