package com.princeInc.lesson10;
/**
 * 1. Заменить все грустные самый :( в строке на весёлые :)
 */
public class TaskString1 {
    public static void main(String[] args) {
        String value  = "first :( second :(  third :) fourth :) fifth :(";
        String result = replace(value);
        System.out.println(result);
    }

    public static String replace(String value){
        return value.replace(":(",":)");
    }
}
