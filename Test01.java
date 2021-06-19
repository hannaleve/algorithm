package com.eomcs.lang.test;

public class Test01 {

  public static int countEventNumber(int value) {
    int result = 0;
    int n = value;

    while(n!=0) {
      if((n%2)==0) {
        result++;
      }
      n/=10;
    }
    return result;
  }
  public static void main(String[] args) {

    //주어진 숫자 중 짝수의 개수세기

    System.out.println(countEventNumber(1238694636)); //6

    //286466 = 6

  }

}
