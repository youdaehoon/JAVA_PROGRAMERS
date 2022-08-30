package com.example.javaprogramers.JAVAPROGRMERS;

import java.util.ArrayList;
import java.util.List;

public class Day4 {
    public static int solution(int[] numbers) {
        int answer = -1;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum+numbers[i];
        }
        System.out.println(sum);
        return 45-sum;
    };



    public static void main(String[] args) {
        int[] arrayList={2,4,8,6};
        solution(arrayList);


    }
}
