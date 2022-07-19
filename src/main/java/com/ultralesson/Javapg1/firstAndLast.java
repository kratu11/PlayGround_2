package com.ultralesson.Javapg1;

import java.util.ArrayList;

public class firstAndLast {

    public static void main(String[] args) {
        String s="Hello, World";
        ArrayList<Integer> listO=new ArrayList<>();
        ArrayList<Integer> listComa=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==','){
                listComa.add(i);
            }
            if(s.charAt(i)=='o' || s.charAt(i)=='O'){
                listO.add(i);
            }
        }
        System.out.println("first occurrence of o is at "+listO.get(0));
        System.out.println("last occurrence of o is at "+listO.get(listO.size()-1));
        System.out.println("first occurrence of , is at "+listComa.get(0));
        System.out.println("last occurrence of , is at "+listComa.get(listComa.size()-1));
    }
    
}
