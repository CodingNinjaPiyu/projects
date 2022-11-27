/*
The ternary operator (conditional operator) is shorthand for the if-then-else statement. For example,

variable = Expression ? expression1 : expression2
Here's how it works.

If the Expression is true, expression1 is assigned to the variable.
If the Expression is false, expression2 is assigned to the variable.

*/
package javaapplication1;


public class B7_Ternary_Operator {
 
  public static void main(String[] args) {

    int februaryDays = 29;
    String result;

    // ternary operator
    result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
    System.out.println(result);
  }
}
  /*
In the above example, we have used the ternary operator to check if the year is a leap year or not.
*/  

