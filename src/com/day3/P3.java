package com.day3;

public class P3 {
	    public static void main(String[] args) {  
	        int [] arr = new int [] {15, 35, 5, 55, 45};  
	        int max = arr[0];  
	        for (int i = 0; i < arr.length; i++) {    
	           if(arr[i] > max)  
	               max = arr[i];  
	        }  
	        System.out.println("largest element present in given array: " + max);  
	    }  
	}  
