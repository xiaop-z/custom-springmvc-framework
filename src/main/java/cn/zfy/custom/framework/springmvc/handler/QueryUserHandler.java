package cn.zfy.custom.framework.springmvc.handler;

import cn.zfy.custom.framework.springmvc.handler.iface.HttpRequestHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Classname QueryUserHandler
 * @Description
 * @Date 2021/12/23 15:19
 * @Created by zfy
 */
public class QueryUserHandler implements HttpRequestHandler {


    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        response.setContentType("text/plain;charset=utf-8");
        response.getWriter().write(String.format("id:%s,name:%s", id, name));
    }
}
