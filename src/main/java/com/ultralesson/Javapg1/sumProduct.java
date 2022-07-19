package com.ultralesson.Javapg1;

import java.util.Scanner;

public class sumProduct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];

        int sum = 0;
        double product = 1;

        for(int i=0;i<arrSize;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
            product *= arr[i];
        }

        System.out.println("Sum: "+sum);
        System.out.println("Product: "+product);
    }

}
