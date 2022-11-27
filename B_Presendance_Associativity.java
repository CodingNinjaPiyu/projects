
package javaapplication1;

public class B_Presendance_Associativity {
    public static void main(String[] args) {
        
        int a=6*5-36/2;
        /*
        Highest prsenedance goes to * and / . 
        They are then evaluted on the basis of left to right Associativity
         
        =30-36/2
        =30-18
        =12
        */
        
        int b=60/5-20*3;
        /*
        =12-20*3
        =12-60
        =-48
        */
        
        int c=20+5-20*3;
        
        /*
        =-20*3-25
        =-60+25
        =-35
        */
        
        int d=10-2+20+5;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
    }
    
}
