
/* Working of Program

(5 > 3) && (8 > 5) returns true because both (5 > 3) and (8 > 5) are true.
(5 > 3) && (8 < 5) returns false because the expression (8 < 5) is false.
(5 < 3) || (8 > 5) returns true because the expression (8 > 5) is true.
(5 > 3) || (8 < 5) returns true because the expression (5 > 3) is true.
(5 < 3) || (8 < 5) returns false because both (5 < 3) and (8 < 5) are false.
!(5 == 3) returns true because 5 == 3 is false.
!(5 > 3) returns false because 5 > 3 is true.

*/
package javaapplication1;


public class B4_Logical_Operators {
   
  public static void main(String[] args) {
      
      System.out.println("&& (Logical AND)");

    // && operator
    System.out.println((5 > 3) && (8 > 5));  // true
    System.out.println((5 > 3) && (8 < 5));  // false
    
      System.out.println("|| (Logical OR)");

    // || operator
    System.out.println((5 < 3) || (8 > 5));  // true
    System.out.println((5 > 3) || (8 < 5));  // true
    System.out.println((5 < 3) || (8 < 5));  // false
    
       System.out.println("! (Logical NOT)");

    // ! operator
    System.out.println(!(5 == 3));  // true
    System.out.println(!(5 > 3));  // false
    
  }
}

