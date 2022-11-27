/*A leap year is exactly divisible by 4 except for century years (years ending with 00).
The century year is a leap year only if it is perfectly divisible by 400.
In the above example, we are checking if the year 1900 is a leap year or not. 
Since 1900 is a century year (ending with 00), it should be divisible by both 4 and 400 to be a leap year.

However, 1900 is not divisible by 400. Hence, it is not a leap year.

Now, let's change the year to 2012. The output will be
Here, 2012 is not a century year. Hence, to be a leap year, it needs to be divisible by only 4.

Since 2012 is divisible by 4, it is a leap year.
EXAMPLE CASE- 1]YEAR ENDS WITH ZERO ZERO(EXAMPLE-2000,1900,3000)not divisible by 400.
2]YEAR NOT ENDS WITH ZERO ZERO(EXAMPLE- 2001,2002,2003,.........) divisible by 4.

*/


package javaapplication1;

// import java.util.Scanner;


public class C_if_else {
    public static void main(String[] args) {
        
    
 /*   Scanner sc=new Scanner(System.in);
    
    int year =sc.nextInt();
    boolean m = (year%4)==0;
    boolean n = (year % 100)!=0;
    boolean o = ((year % 100)==0) && (year %400==0);
   
        if (m||o){
            System.out.println("is a leap year  "+year);
                 
        }
        else{
            System.out.println("is not a leap year  "+year);  
            
        }
    }
}
  
  */
  
  
  /**********************************************************************************************..*/
  
        System.out.println("LEAP YEAR EXAMPLE BY SECOND METHOD");
    // year to be checked
    int year = 2019;
    boolean leap = false;

    // if the year is divided by 4
    if (year % 4 == 0) {

      // if the year is century
      if (year % 100 == 0) {

        // if year is divided by 400
        // then it is a leap year
        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
      }
      
      // if the year is not century
      else
        leap = true;
    }
    
    else
      leap = false;
    
    if (leap)
      System.out.println(year + " is a leap year.");
    else
      System.out.println(year + " is not a leap year.");
  }
}
  
 
  
  
  
  
        
    

    

    

