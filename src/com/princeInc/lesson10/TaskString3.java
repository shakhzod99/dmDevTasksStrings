package com.princeInc.lesson10;

/**
 * Написать функцию, принимающую в качестве параметров имя,
 * фамилию и отчество и возвращающую инициалы
 */
public class TaskString3 {
    public static void main(String[] args) {
        String name = "John";
        String surname = "Wick";
        String secondName = "ronalds";
        String result =  returnInitials("wer","xv","asdf");
        System.out.println(returnInitials(name, surname, secondName));
        System.out.println(result);
    }
    private static String returnInitials(String name, String surname, String secondName){
        String nameChar = name.substring(0,1).toUpperCase();
        String surnameChar = surname.substring(0,1).toUpperCase();
        String secondNameChar = name.substring(0,1).toUpperCase();
        return String.format("%s.%s.%s", nameChar, surnameChar, secondNameChar);
    }
}
