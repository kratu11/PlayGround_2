package com.ultralesson.Javapg1;

import java.util.Scanner;

public class arrayLargestAndSmallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];

        int lar = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

        for(int i=0;i<arraySize;i++){
            array[i] = sc.nextInt();
            lar = Math.max(lar, array[i]);
            small = Math.min(small, array[i]);
        }
        System.out.println("Largest Number: "+lar);
        System.out.println("Smallest Number: "+small);
    }
}


