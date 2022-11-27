
package javaapplication1;

import java.util.Scanner;

public class C_If_else_examples {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int age=sc.nextInt();
       
        if(age>18){
            System.out.println("Yes you can drive!");
        
        }
        else{
            System.out.println("No you can not drive yet!");
        }
    } 
}
