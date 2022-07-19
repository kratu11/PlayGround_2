package com.ultralesson.Javapg1;

import java.util.Scanner;

public class maxOfThreeNum {

    public static void main(String[] args){

        Scanner ss = new Scanner(System.in);
        int a = ss.nextInt();
        int b = ss.nextInt();
        int c = ss.nextInt();

        maxOfThreeNum res = new maxOfThreeNum();

        System.out.println("Maximum Number = " + res.maxi(a,b,c));
        System.out.println("Minimum Number = " + res.mini(a,b,c));


    }

    public int maxi(int a,int b,int c){
        return Math.max(a,Math.max(b,c));
    }
    public int mini(int a,int b,int c){
        return Math.min(a,Math.min(b,c));
    }
}
