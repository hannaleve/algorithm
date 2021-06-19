package com.eomcs.lang.test;

public class Test02 {

  public static int maxDiff(int[] value) {

    int answer = 1;
    for(int i=1; i<value.length; i++) {
      if((value[i] - value[i-1]) > answer) {
        answer = Math.abs(value[i] - value[i+1]); 
      }
    }
    return answer;
  }
  public static void main(String[] args) {


    //숫자 배열에서 각 이웃하는 숫자간의 차가 가장 큰 것을 알아내기
    //3, -3, -1    => 3이 가장 크다

    System.out.println(maxDiff(new int[] {2,4,1,0}));
  }

}
