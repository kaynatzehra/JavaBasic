package com.day4;

public class P4 {
		  public void eat() {
		    System.out.println("I can eat");
		  }
		}
		class Dog extends P4 {
		  public void eat() {
		    super.eat();
		    System.out.println("I eat dog food");
		  }
		  public void bark() {
		    System.out.println("I can bark");
		  }
		}

		class Main {
		  public static void main(String[] args) {

		    Dog d = new Dog();
		    d.eat();
		    d.bark();
		  }
		}