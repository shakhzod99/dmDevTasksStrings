package com.princeInc.lesson10;

/**
 * 4. Подсчитать количество всех точек,
 *  запятых и восклицательных знаков в строке.
 */
public class TaskString4 {
    public static void main(String[] args) {
        String value = "qwertyu.,!asdf...,?qwer!fdsa";
        System.out.println(countSymbols(value));
    }
    public static int countSymbols(String value){
        String result = value.replace(".", "")
                .replace(",", "")
                .replace("!", "")
                .replace("?", "");
        return value.length() - result.length();
    }
}
