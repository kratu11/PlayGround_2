package com.ultralesson.Javapg1;

public class letterDetection {

    public static void main(String[] args) {
        String str="Umbrella";
        for(char i:str.toCharArray()){
            if(i=='e' || i=='E'){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }

}
