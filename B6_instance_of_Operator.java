

/*
Java instanceof Operator
The instanceof operator checks whether an object is an instanceof a particular class. 
For example,
Here, str is an instance of the String class. 
Hence, the instance of operator returns true
*/
package javaapplication1;
public class B6_instance_of_Operator {
 
  public static void main(String[] args) {

    String str = "Programiz";
    boolean result;

    // checks if str is an instance of
    // the String class
    result = str instanceof String;
    System.out.println("Is str an object of String? " + result);
  }
}
    

