package com.ultralesson.Javapg1;

public class nameOfStudent {

    String name;
    public nameOfStudent(){
        this.name = "Unknown";
        System.out.println(this.name);
    }
    public nameOfStudent(String name){
        this.name = name;
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        nameOfStudent ob1 = new nameOfStudent("Kratu Sharma");
        nameOfStudent ob2 = new nameOfStudent();
    }
}
