package com.day3;

public class P5 {
	    public static void main(String[] args) {  
	        int [] arr = new int [] {1, 6, 7, 4, 5};   
	          
	        System.out.println("Elements of given array present on even position: ");  
	        
	        for (int i = 1; i < arr.length; i = i+2) {   
	            System.out.println(arr[i]);   
	        }    
	    }  
	}  