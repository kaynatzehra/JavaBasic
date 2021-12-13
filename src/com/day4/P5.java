package com.day4;

public class P5 {
		  public void eat() {
		    System.out.println("I can eat");
		  }
		class Dog extends P5 {
		  public void eat() {
		    System.out.println("I eat dog food");
		  }
		  public void bark() {
		    System.out.println("I can bark");
		  }
		}
		class Main {
		  public static void main(String[] args) {

		    // create an object of the subclass
		    Dog labrador = new Dog();

		    // call the eat() method
		    labrador.eat();
		    labrador.bark();
		  }
		}
}