package cn.zfy.custom.framework.springmvc.utils;

import java.util.Collection;

/**
 * @Classname CollectionUtils
 * @Description
 * @Date 2021/12/23 16:33
 * @Created by zfy
 */
public class CollectionUtils {


    private CollectionUtils() {
    }

    public static <T> boolean isEmpty(Collection<T> collection) {
        return null == collection || collection.isEmpty();
    }
}
