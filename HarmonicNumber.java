package JavaPackages;

import java.util.Scanner;

public class HarmonicNumber { 
	static double sum = 0.0;
	
	public static void main(String[] args) { 
    	 // read in one command-line argument
    	Scanner s=new Scanner(System.in);
	  	System.out.println("Enter the Harmonic value in N: ");
		int n=s.nextInt();
        
        // compute 1/1 + 1/2 + 1/3 + ... + 1/n   
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        // print the nth harmonic number
        System.out.println(sum);
    }

}