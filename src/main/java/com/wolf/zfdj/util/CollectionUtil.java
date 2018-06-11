package com.wolf.zfdj.util;

import org.apache.commons.collections4.MapUtils;

import java.util.Collection;
import java.util.Map;

public final class CollectionUtil {
    /**
     * 判断collection是否为空
     * @param collection
     * @return
     */
    public static boolean isEmpty(Collection<?> collection){
        return CollectionUtil.isEmpty(collection);
    }
    /**
     * 判断collection是否不为空
     * @param collection
     * @return
     */
    public static boolean isNotEmpty(Collection<?> collection){
        return !isEmpty(collection);
    }

    /**
     * 判断Map是否为空
     * @param map
     * @return
     */
    public static boolean isMapEmpty(Map<?,?> map){
        return MapUtils.isEmpty(map);
    }

    /**
     * 判断Map是否不为空
     * @param map
     * @return
     */
    public static boolean isMapNotEmpty(Map<?,?> map){
        return !isMapEmpty(map);
    }

}
