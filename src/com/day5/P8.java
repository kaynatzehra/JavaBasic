package com.day5;
public class P8 {     
    int a = 10;
    int b = 10;
    void call(int a) {
        a = a+10;
    }
    void call(P8 eg) {
        eg.b = eg.b+10;
    }
    public static void main(String[] args) {
 
        P8 eg = new P8();
        System.out.println("Before call-by-value: " + eg.a);
        eg.call(50510);
        System.out.println("After call-by-value: " + eg.a);
        System.out.println("Before call-by-reference: " + eg.b);
        eg.call(eg);
        System.out.println("After call-by-reference: " + eg.b);
         
         
    }
}