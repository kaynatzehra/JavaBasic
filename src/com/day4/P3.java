package com.day4;
class EncapsulationDemo{
    private String empName;
    private int empAge;

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }


    }

public class P3{
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setEmpName("Ravi");
         obj.setEmpAge(23);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee Age: " + obj.getEmpAge());
    } 
}
 
