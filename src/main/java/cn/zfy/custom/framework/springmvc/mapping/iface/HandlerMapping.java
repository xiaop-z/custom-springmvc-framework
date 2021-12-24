package cn.zfy.custom.framework.springmvc.mapping.iface;

import javax.servlet.http.HttpServletRequest;

/**
 * @Classname HandlerMapping
 * @Description 接口是对外提供查找处理的功能的 接口的实现类需要维护处理器和请求的关系
 * @Date 2021/12/23 16:39
 * @Created by zfy
 */
public interface HandlerMapping {

    Object getHandler(HttpServletRequest request);
}
