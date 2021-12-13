package com.day3;

public class P4 {
	    public static void main(String[] args) {  
	        int [] arr = new int [] {15, 35, 5, 55, 45};   
	        int min = arr[0];
	        for (int i = 0; i < arr.length; i++) {   
	           if(arr[i] <min)  
	               min = arr[i];  
	        }  
	        System.out.println("Smallest element present in given array: " + min);  
	    }  
	}  

