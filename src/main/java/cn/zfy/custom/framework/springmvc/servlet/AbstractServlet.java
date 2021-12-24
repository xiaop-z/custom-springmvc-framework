package cn.zfy.custom.framework.springmvc.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Classname AbstractServlet
 * @Description
 * @Date 2021/12/23 14:52
 * @Created by zfy
 */
public abstract class AbstractServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //做请求分发
        try {
            this.doDispatch(req, resp);
        } catch (Exception e) {
        }
    }

    protected abstract void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws Exception;

}
