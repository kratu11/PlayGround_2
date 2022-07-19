package com.ultralesson.Javapg1;

import java.util.Scanner;

public class productOfNumbers {

    public static void main(String[] args)
    {
        productOfNumbers pn = new productOfNumbers();
        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        System.out.println(pn.prod(num1,num2));
    }

    public int prod(int a, int b){
        return a*b;
    }

}
