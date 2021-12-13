package com.day4;

public class P12 {
	    int roll;  
	    String name;  
	    P12(int i,String n){  
	    roll = i;  
	    name = n;  
	    }  
	    void display(){System.out.println(roll+" "+name);}  
	   
	    public static void main(String args[]){  
	    //creating objects and passing values  
	    P12 p1 = new P12(1,"Arav");  
	    P12 p2 = new P12(2,"Aryan");
	    p1.display();  
	    p2.display();  
	   }  
	}  

