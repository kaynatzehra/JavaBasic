package com.day5;
interface AnimalEat {
	   void eat();
	}
	interface AnimalTravel {
	   void travel();
	}
	class Animal implements AnimalEat, AnimalTravel {
	   public void eat() {
	      System.out.println("Animal is eating");
	   }
	   public void travel() {
	      System.out.println("Animal is travelling");
	   }
	}
	public class P4 {
	   public static void main(String args[]) {
	      Animal a = new Animal();
	      a.eat();
	      a.travel();
	   }
	}
