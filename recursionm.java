//Module 5 part 1 Using the Recursion method

    /**
    *
    * @author Glenney
    */
class Recursionm{  
    /**
    * This is a program for outputting the Fibonacci sequence based the value/input given 
    * while using a Recursion method in java. It also displays how many nanoseconds it took for the 
    * function to compile the sequence.
    * @param args
    */
 
 static int n1 = 0,n2 = 1,n3 = 0;   
    /**
    * Static variables used to create single copy of variable
    * often used for recursion method
    */
 static void printA(int count){   
    /**
    * Association with class
    */
     
    if(count>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         System.out.println(" "+n3);   
         printA(count-1); 
    /**
    * Mathmatical expression for Fibonacci sequence.
    * "count-1" to keep count accurate. Using 7 as an example. 7 values given including the initial 0. 
    */    
     }    
     }    
 public static void main(String args[]){    
    /**
    * This is the main method used for the execution 
    * of a java program.
    */

  long startTime = System.nanoTime();
     /**
    * Used to measure the elapsed time. Essentially, how long it would take to execute the code.
    * Start of the measurement.
    */
  int count=7; 
     /**
    * Using 7 as the value to compare runtime between the recursion and iterative methods.
    */

    System.out.println(n1); 
    System.out.println(n2); 
     printA(count-2);
 long endTime = System.nanoTime();
    /**
    * End of the time measurement.
    */
    
     System.out.println((endTime - startTime)+ " " + " nanoseconds");
    /**
    * Final print output of results including the compling time of the function measured.
    */
 }  
}
