package com.example.javaprogramers.JAVAPROGRMERS;

public class Day3 {

    public static long solution(int a, int b) {
        long answer = 0;

        if (a - b > 0) {
            while (a > b) {

                answer = a + answer;
                a--;

            }
            return answer;
        } else {
            while (a < b) {
                answer = a + answer;
                a++;

            };
            return answer;
        }

    }


    public static void main(String[] args) {
        int a = -7;
        int b = 13;

        System.out.println(solution(a, b));
        System.out.println(solution(2, 7));


    }

    ;
}


//    long answer = 0;
//        if(a==b){
//                return (long)a;
//                }else{
//                //(첫항+끝항)*갯수/2
//                answer=(a+b)*(Math.abs(b-a)+1);
//                return (long)answer/2;
//                }