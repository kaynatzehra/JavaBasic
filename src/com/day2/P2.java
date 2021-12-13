package com.day2;
import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hundreds = 0;
        int tens = 0;
        int ones = 0;
        System.out.print("Enter a 3 digit number: ");
        int n = input.nextInt();
        if (n > 999) {
            System.out.println("\nError! Number more than 3 digits.");
            }
        else if (n < 100) {
            System.out.println("Error! Number less than 3 digits.");
            }
        else if (100<=n&&n<=999){
          hundreds = (n%1000)/100;
                System.out.println(hundreds);
          tens = (n%100)/10;
                System.out.println(tens);
          ones = n%10;
                System.out.println(ones);
        }    
}
}