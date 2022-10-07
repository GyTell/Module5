//Module 5 part 1 Using Iterative method
import java.util.*;
/**
*
* @author Glenney
*/
public class Iterativem{
    /**
    * This is a program for outputting the Fibonacci sequence based the value/input given 
    * while using an Iterative method in java. It also displays how many nanoseconds it took for the 
    * function to compile the sequence.
    * @param args
    */
    public static void main(String[] args) {
        
    /**
    * This is the main method used for the execution 
    * of a java program.
    */
        int a=0,b=1, sequence, i;
        
    /**
    *Declared 4 variables a,b,sequence and i.
    */
        Scanner sc= new Scanner(System.in);
    /**
    * Using Scanner class to allow user to input a value
    * The value will determine how much of the sequence is displayed and run.
    */
        System.out.println("Please enter a value: ");
     /**
     * method above used for printing on the output screen.
     * Requesting a value. 7 is the value being used as an example to test average run time in nanoseconds
     */
       
        int n= sc.nextInt();
    /**
    * returning the integer from input
    */
        
        System.out.println("Fibonacci function and compile time ");
        long startTime = System.nanoTime();
    /**
    * Used to measure the elapsed time. Essentially, how long it would take to execute the code.
    * Start of the measurement.
    */
        
        for (i = 0; i < n; i++){
    /**
    * Creating the loop for iteration. for used to start the loop at 0
    */
            
        if (i <= 1)
            sequence = i;
        else {
            sequence = a+b;
            a=b;
            b=sequence;
        }
    /**
    * Mathmatical expression to generate Fibonacci sequence via loop.
    */
       long endTime = System.nanoTime();
     /**
    * End of the time measurement.
    */
    System.out.println(sequence + " " + (endTime - startTime) + " nanoseconds");
    /**
    * Final print output of results including the compling time of the function measured.
    */
    }
    } 
    }
