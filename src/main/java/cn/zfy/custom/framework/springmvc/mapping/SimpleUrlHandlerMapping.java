package cn.zfy.custom.framework.springmvc.mapping;

import cn.zfy.custom.framework.springmvc.mapping.iface.HandlerMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Classname SimpleUrlHandlerMapping
 * @Description
 * @Date 2021/12/24 9:57
 * @Created by zfy
 */
public class SimpleUrlHandlerMapping implements HandlerMapping {
    @Override
    public Object getHandler(HttpServletRequest request) {
        return null;
    }
}
