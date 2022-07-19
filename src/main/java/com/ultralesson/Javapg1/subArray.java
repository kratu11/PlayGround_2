package com.ultralesson.Javapg1;

import java.util.Arrays;

public class subArray {

    public static void main(String[] args) {
        int[] arr={10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,3,9)));
    }
}
