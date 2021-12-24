package cn.zfy.custom.framework.springmvc.handler;

import cn.zfy.custom.framework.springmvc.handler.iface.SimpleControllerHandler;
import cn.zfy.custom.framework.springmvc.model.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Classname SaveUserHandler
 * @Description
 * @Date 2021/12/23 15:22
 * @Created by zfy
 */
public class SaveUserHandler implements SimpleControllerHandler {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println(request.getContentType());
        response.setContentType("text/plain;charset=utf-8");
        response.getWriter().write("添加成功!!!!");
        return null;
    }
}
