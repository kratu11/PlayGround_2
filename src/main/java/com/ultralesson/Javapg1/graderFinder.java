package com.ultralesson.Javapg1;

import java.util.Scanner;

public class graderFinder {

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        System.out.println(graderFinder(marks));
    }

    private static String graderFinder(int marks) {
        if(marks>=91){
            return "AA";
        } else if (marks>=81) {
            return "AB";
        } else if (marks>=71) {
            return "BB";
        } else if (marks>=61) {
            return "BC";
        } else if (marks>=51) {
            return "CD";
        } else if (marks>=41) {
            return "DD";
        }else{
            return "Fail";
        }

    }
}
