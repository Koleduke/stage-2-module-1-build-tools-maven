package com.epam.demo;



import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
       for(int i = 0; args.size()>i;i++){
           if(Integer.getInteger(args.get(i))<0){return false;}
       }
       return true;
    }
}