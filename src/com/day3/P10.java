package com.day3;

public class P10 {
		   public static void main(String args[]){
		      int temp, size;
		      int array[] = {10, 20, 30, 40, 50, 60};
		      size = array.length;
		      for(int i = 0; i<size; i++ ){
		         for(int j = i+1; j<size; j++){

		            if(array[i]>array[j]){
		               temp = array[i];
		               array[i] = array[j];
		               array[j] = temp;
		            }
		         }
		      }
		      System.out.println("Third second largest number is:: "+array[size-2]);
		   }
}
