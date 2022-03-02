package com.princeInc.lesson10;

public class TaskString6 {
  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    StringBuilder value = new StringBuilder();
    StringBuilder valueToSum = new StringBuilder("8,1 2 ? 4,3 ?");
    for (int i=0; i<15; i++){
      value.append(i);
      System.out.println(value);
    }
    long endTime = System.currentTimeMillis();
    System.out.println("Time: " + (endTime - startTime));
  }
}
