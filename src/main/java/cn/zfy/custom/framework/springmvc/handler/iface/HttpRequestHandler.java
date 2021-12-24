package cn.zfy.custom.framework.springmvc.handler.iface;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Classname HttpRequestHandler
 * @Description 制定一种处理类的编写规范
 * @Date 2021/12/23 15:15
 * @Created by zfy
 */
public interface HttpRequestHandler {

    void handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException;

}
