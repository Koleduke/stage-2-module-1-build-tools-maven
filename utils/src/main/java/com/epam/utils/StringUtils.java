package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if(Integer.getInteger(str)>0){return true;}
        return false;
    }
}
