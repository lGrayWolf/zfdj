package com.wolf.zfdj.util;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;

/**
 * 转型操作工具类
 */
public final class CastUtil {

    /**
     * 转为String类型（提供默认值）
     * @param object
     * @param defaultValue
     * @return
     */
    public static String castString(Object object,String defaultValue){
        return object != null ? String.valueOf(object):defaultValue;
    }

    /**
     * 转为String类型
     * @param object
     * @return
     */
    public static String castString(Object object){
        return CastUtil.castString(object,"");
    }

    /**
     * 转为double型（默认值为0）
     * @param object
     * @return
     */
    public static double castDouble(Object object){
        return castDouble(object,0);
    }
    /**
     * 转为double型（提供默认值）
     * @param object
     * @param defaultValue
     * @return
     */
    public static double castDouble(Object object,double defaultValue){
        double value = defaultValue;
        if (object != null){
            String strValue = castString(object);
            if (isNotEmpty(strValue)){
                try {
                    value = Double.parseDouble(strValue);
                }catch(NumberFormatException e){
                   value = defaultValue;
                }
            }
        }
        return value;
    }
    /**
     * 转为dlong型（默认值为0）
     * @param object
     * @return
     */
    public static double castLong(Object object){
        return castDouble(object,0);
    }
    /**
     * 转为long型（提供默认值）
     * @param object
     * @param defaultValue
     * @return
     */
    public static double castLong(Object object,long defaultValue){
        long value = defaultValue;
        if (object != null){
            String strValue = castString(object);
            if (isNotEmpty(strValue)){
                try {
                    value = Long.parseLong(strValue);
                }catch(NumberFormatException e){
                    value = defaultValue;
                }
            }
        }
        return value;
    }
    /**
     * 转为int型（默认值为0）
     * @param object
     * @return
     */
    public static int castInt(Object object){
        return castInt(object,0);
    }
    /**
     * 转为int型（提供默认值）
     * @param object
     * @param defaultValue
     * @return
     */
    public static int castInt(Object object,int defaultValue){
        int value = defaultValue;
        if (object != null){
            String strValue = castString(object);
            if (isNotEmpty(strValue)){
                try {
                    value = Integer.parseInt(strValue);
                }catch(NumberFormatException e){
                    value = defaultValue;
                }
            }
        }
        return value;
    }

    /**
     *转换为boolean(提供默认值)
     * @param object
     * @param defaultValue
     * @return
     */
    public static boolean castBoolean(Object object,boolean defaultValue){
        boolean value = defaultValue;
        if (object != null){
            value = Boolean.parseBoolean(castString(object));
        }
        return value;
    }

    /**
     * 转换为boolean(默认为false)
     * @param object
     * @return
     */
    public  static boolean castBoolean(Object object){
        return CastUtil.castBoolean(object,false);
    }
}
