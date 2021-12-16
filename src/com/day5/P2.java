package com.day5;
interface printable{  
void print();  
}  
class P2 implements printable{  
public void print(){System.out.println("Hello");}  
  
public static void main(String args[]){  
P2 obj = new P2();  
obj.print();  
 }  
}
