package com.example.javaprogramers.JAVAPROGRMERS;

public class Day2 {
    public static String solution(String s) {
        String answer = "";
        double len=s.length();
        if(len%2==0){
            return s.substring((int)(Math.floor(len/2)-1),(int)(Math.floor(len/2)-1)+2);
        }else{
           return s.substring((int)(Math.floor(len/2)),(int)(Math.floor(len/2))+1);
        }

    }

    public static void main(String[] args) {
        String s = "123acvava222";
        solution(s);
        System.out.println(solution(s));
    }
}
