package com.day5;
class Student {
    
    public int exam;
    public void display() {
        System.out.println("I am a student.");
        System.out.println("I have " + exam + " exam.");
    }
}
public class P1 {
    public static void main( String[] args ) {
        Student stu = new Student();
        stu.exam = 6;
        stu.display();
    }
}
