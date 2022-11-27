

/*  
                       Increment and Decrement Operators
Java also provides increment and decrement operators: ++ and -- respectively. 
++ increases the value of the operand by 1, while -- decrease it by 1. 


For example,
int num = 5;
increase num by 1
++num;
Here, the value of num gets increased to 6 from its initial value of 5.


In the above program, we have used the ++ and -- operator as prefixes (++a, --b).
We can also use these operators as postfix (a++, b++).
There is a slight difference when these 
operators are used as prefix versus when they are used as a postfix.
*/
package javaapplication1;
public class B5_Unary_Operators {
   
  public static void main(String[] args) {
    
    // declare variables
    int a = 12, b = 12;
    int result1, result2;

    // original value
    System.out.println("Value of a: " + a);

    // increment operator
    result1 = ++a;
    System.out.println("After increment: " + result1);

    System.out.println("Value of b: " + b);

    // decrement operator
    result2 = --b;
    System.out.println("After decrement: " + result2);
   }
}
    

