

           /*TAKING INPUT FROM THE USER*/
/*System.in=Keyword input or read from the keyboard*/
/*sc.nextInt(); = METHOD TO READ FROM THE KEYBOARD*/
/*IN ORDER TO READ DATA FROM THE KEYBOARD,JAVA HAS A SCANNER CLASS.
& SCANNER CLASS HAS A LOT OF METHODS TO READ THE DATA FROM THE KEYBOARD
&NEXTINT IS METHOD TO TAKE INTEGER */

/*TO PRINT ALL WORDS OR FULL LINE THEN USE NEXTLINE METHOD*/

package javaapplication1;

import java.util.Scanner;


public class A_Taking_Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
         System.out.println("example-1-check expression validity");  
        
        boolean b1=sc.hasNextInt();
        System.out.println(b1); 
        
      /*  System.out.println(sc.hasNextFloat()); */
         
         System.out.println("example-2");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
          System.out.println(c); 
          
          System.out.println("example-3");
        
        float d=sc.nextFloat();
        float e=sc.nextFloat();
        float f=d+e;
           System.err.println(f); 
     
     System.out.println("example-4"); 
       String str=sc.next(); 
       System.out.println(str); 
       
      /*  String str=sc.nextLine(); 
        System.out.println(str);  
    */
          }
       }
    

       
        
        
              
      
    
    

