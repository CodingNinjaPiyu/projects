package javaapplication1;

import java.util.Scanner;


public class D_exercise_1 {
    public static void main(String[] args) {
    
        System.out.println("QUESTION-1-SUM OF THREE NUMBERS");
        int a=80;
        int b=40;
        int c=70;
        int Sum=a+b+c;
        System.out.println(Sum);
        
        System.out.println("QUESTION-2-CALCULATE CGPA USING MARKS OF THREE SUBJECT OUT OF 10");
        
        float subject1=50;
        float subject2=60;
        float subject3=75;
        float cgpa=(subject1+subject2+subject3)/30;
        
        System.out.println(cgpa);
        
        System.out.println("QUESTION-3-CALCULATE AVERAGE USING MARKS OF THREE SUBJECT OUT OF 100");
        
        int subject4=50;
        int subject5=60;
        int subject6=75;
        
        int average=(subject4+subject5+subject6)/3;
        
        System.out.println(average);
        
        System.out.println("QUESTION-4-WHAT IS YOUR NAME");  
         
        Scanner sc =new Scanner(System.in);
         
        String name=sc.next();
         
        System.out.println("Hello "+ name +" have a good day !");
         
        System.out.println("QUESTION-5-check number entered by the user is integer or not -ENTER YOUR NUMBER");
         
        
       //  Scanner sc =new Scanner(System.in);
        System.out.println(sc.hasNextInt());
         
        System.out.println("QUESTION-6-CONVERT KM TI MILES");  
         
        double kilometers;

	System.out.println("Please enter kilometers:");

	Scanner in = new Scanner(System.in);
                
	kilometers = in.nextDouble();

	double miles = kilometers / 1.6;

	System.out.println(miles + " Miles");
                
    }
}
