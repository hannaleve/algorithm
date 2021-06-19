package com.eomcs.lang.test;

public class Test03 {

  public static void main(String[] args) {

    //배열의 전체 길이를 l이라고하자.
    //배열을 절반(L/2)으로 나눌 때, 앞쪽 부분과 뒤쪽 부분의 위치를 바꿔라.
    // 예)
    // [2, 4, 5, 6, 4, 3, 7, 8] => [4, 3, 7, 8, 2, 4, 5, 6]


    int value[] = {2,4,5,6,4,3,7,8};
    changeValuePosition(value);

    for(int i : value) {
      System.out.print(i + ",");
    }

  }

  public static void changeValuePosition(int[] value) {
    for(int i=0; i<value.length/2; i++) {
      int temp = value[i+value.length/2];
      value[i+value.length/2] = value[i];
      value[i] = temp;
    }
  }
}
