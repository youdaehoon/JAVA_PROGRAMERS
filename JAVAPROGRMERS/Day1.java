package com.example.javaprogramers.JAVAPROGRMERS;

public class Day1 {
    public static int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        System.out.println(answer);
        System.out.println(((Object)answer).getClass().getName());

        return answer;
    }

    public static void main(String[] args) {
        String s = "1234";
        solution(s);
    }
}
