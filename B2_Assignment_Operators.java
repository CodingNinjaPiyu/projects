

/* Assignment operators are used in Java to assign values to variables. For example,

int age;
age = 4;
Here, = is the assignment operator. 
It assigns the value on its right to the variable on its left.
That is, 4 is assigned to the variable age.

*/



package javaapplication1;

public class B2_Assignment_Operators {
    
  public static void main(String[] args) {
    
    // create variables
    int a = 4;
    int var; 
    
    // assign value using =
    var = a;
    System.out.println("var using =: " + var);

    // assign value using =+
    var += 6;
    System.out.println("var using +=: " + var);

    // assign value using =*
    var *= 6;
    System.out.println("var using *=: " + var);
    
    var /= 6;
    System.out.println("var using /=: " + var);
    
    var -= 6;
    System.out.println("var using -=: " + var); 
    
    var %= 6;
    System.out.println("var using %=: " + var);
 
    }
}
    

