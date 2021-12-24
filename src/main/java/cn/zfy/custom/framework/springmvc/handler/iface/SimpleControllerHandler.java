package cn.zfy.custom.framework.springmvc.handler.iface;

import cn.zfy.custom.framework.springmvc.model.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Classname SimpleControllerHandler
 * @Description
 * @Date 2021/12/23 15:16
 * @Created by zfy
 */
public interface SimpleControllerHandler {


    /**
     * 处理完请求之后通过返回值封装的处理结果和视图进行二次处理
     *
     * @param request
     * @param response
     * @return
     */
    ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException;


}
