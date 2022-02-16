package com.princeInc.lesson10;
/**
 * 2. Написать функцию, прнимаюшую 2 параметра: строку и слово
 * - и возвращающую true, если строка начинается и заканчивает
 * этим словом.
 */
public class TaskString2 {
    public static void main(String[] args) {
        String value = "12 is equal to 12";
        String word = "12";
        System.out.println(isStartEndEqual(value, word));
    }
    private static boolean isStartEndEqual(String target, String word){
        return target.startsWith(word) && target.endsWith(word);
    }
}
