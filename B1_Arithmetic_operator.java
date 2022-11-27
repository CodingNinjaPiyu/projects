


/*
Here, the + operator is used to add two variables a and b.
Similarly, there are various other arithmetic operators in Java.
*/



package javaapplication1;

import java.util.Scanner;

public class B1_Arithmetic_operator {
    
   
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      int a=sc.nextInt();
      int b=sc.nextInt();
      
      
    // declare variables
    // int a = 12, b = 5;

    // addition operator
    System.out.println("a + b = " + (a + b));

    // subtraction operator
    System.out.println("a - b = " + (a - b));

    // multiplication operator
    System.out.println("a * b = " + (a * b));

    // division operator
    System.out.println("a / b = " + (a / b));

    // modulo operator
    System.out.println("a % b = " + (a % b));
    
    }
}
    

