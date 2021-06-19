package com.eomcs.lang.test;

public class Test04 {


  public static int divisorsPairs(int[] value) {
    int result = 0;

    for(int i=0; i<value.length; i++) { //0~3
      for(int j=i; j<value.length; j++) {
        if(value[i] % value[j] == 0) {
          result ++;
        }
      }
    }
    return result;
  }
  public static void main(String[] args) {

    //숫자배열 중 나누어 0으로 떨어지는 수가 몇 쌍 있는지 구하기

    int[] value = {2,4,8};
    System.out.println(divisorsPairs(value)); //3
    //2%2, 4%4, 8%8 = 3 


  }

}