package com.ultralesson.Javapg1;


import java.util.Scanner;

public class caseChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);

        if(input >= 'a' && input <= 'z'){
            System.out.println("Lowercase");
        }
        if(input >= 'A' && input <= 'Z'){
            System.out.println("UpperCase");
        }

    }

}
