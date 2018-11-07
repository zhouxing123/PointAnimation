package com.yihui.pointanimation;

/**
 * 功能详细描述
 *
 * @author: zhouxing
 * @version: [1.0, 2018/11/7]
 * @see: [相关类/方法]
 * @describe: [产品/模块版本]
 */
public class NumUtil {
    public static String NumberFormat(float f,int m){
        return String.format("%."+m+"f",f);
    }

    public static float NumberFormatFloat(float f,int m){
        String strfloat = NumberFormat(f,m);
        return Float.parseFloat(strfloat);
    }

}
