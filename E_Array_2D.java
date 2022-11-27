/*

ARRAY IS  A COLLECTION OF SIMILAR TYPES OF DATA.
index starts from zero,one,two..........n.AND GOES (n-1) WHERE N IS THE SIZE OF ARRAY
   
marks[5] throws an error ....-Index 5 out of bounds for length 5

THERE ARE THREE MAIN WAYS TO CREATE AN ARRAY IN JAVA

FIRST-int[]marks = new int[5];                   DECLARATION+MEMORY ALLOCATION.

SECOND -INT[]MARKS;                              DECLARATION
MARKS=NEW INT[5];                                MEMORY ALLOCATION

THIRD- INT[]MARKS={100,90,80,70,60}              DECLARE+INITIALIZATION

INT[]MARKS;  ......... DECLARATION
NEW INT[5]; ...........MEMORY ALLOCATION
        marks [0]=100;
        marks [1]=90;
        marks [2]=80;
        marks [3]=70;
        marks [4]=60;   .......INITIALIZATION

How to declare an array in Java?
dataType[] arrayName;
EXAMPLE- double[] data;
// declare an array
double[] data;

// allocate memory
data = new double[10];

In Java, we can declare and allocate the memory of an array in one single statement. For example,

double[] data = new double[10];

How to Initialize Arrays in Java?
In Java, we can initialize arrays during declaration. For example,

//declare and initialize and array
int[] age = {12, 4, 5, 2, 5};

// declare an array
int[] age = new int[5];

// initialize array
age[0] = 12;
age[1] = 4;
age[2] = 5;


*/
package javaapplication1;

public class E_Array_2D {
    public static void main(String[] args) {
    /*
        int[]marks = new int[5];
        marks [0]=100;
        marks [1]=90;
        marks [2]=80;
        marks [3]=70;
        marks [4]=60;
        
        System.out.println(marks[3]);

        
        int[]marks;
        marks =new int[5];
         
        marks [0]=100;
        marks [1]=90;
        marks [2]=80;
        marks [3]=70;
        marks [4]=60;
        
        System.out.println(marks[3]);
         
        */
    
        int[]marks={100,90,80,70,60};
        System.out.println(marks[3]);
        
        
    }
    
}
