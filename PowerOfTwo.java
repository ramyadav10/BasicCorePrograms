package JavaPackages;

import java.util.Scanner;

public class PowerOfTwo {
	static int i = 0;                // count from 0 to N
	static int powerOfTwo = 1;       // the ith power of two
	public static void main(String[] args) {
        // read in one command-line argument
    	Scanner s=new Scanner(System.in);
	  	System.out.println("Enter the N: ");
		int n=s.nextInt();
        
        // repeat until i equals n
        while (i <= n) {
            System.out.println(i + " " + powerOfTwo);   // print out the power of two
            powerOfTwo = 2 * powerOfTwo;                // double to get the next one
            i++;
        }

    }
}