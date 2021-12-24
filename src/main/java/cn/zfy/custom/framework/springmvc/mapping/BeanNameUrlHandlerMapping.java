package cn.zfy.custom.framework.springmvc.mapping;

import cn.zfy.custom.framework.springmvc.handler.QueryUserHandler;
import cn.zfy.custom.framework.springmvc.handler.SaveUserHandler;
import cn.zfy.custom.framework.springmvc.mapping.iface.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Classname BeanNameUrlHandlerMapping
 * @Description 通过xml中的bean标签进行映射关系的维护
 * @Date 2021/12/24 9:54
 * @Created by zfy
 */
public class BeanNameUrlHandlerMapping implements HandlerMapping {

    private Map<String, Object> urlHandlers = new HashMap<>();

    public BeanNameUrlHandlerMapping() {
        urlHandlers.put("/queryUser", new QueryUserHandler());
        urlHandlers.put("/saveUser", new SaveUserHandler());
    }

    @Override
    public Object getHandler(HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        return urlHandlers.get(requestURI);
    }
}
