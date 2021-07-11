package JavaPackages;

import java.util.Scanner;

public class Factors {

    public static void main(String[] args) { 
    	 // read in one command-line argument
    	Scanner s=new Scanner(System.in);
	  	System.out.println("Enter the prime factorization for N: ");
		long n=s.nextInt();
        
        System.out.print("The prime factorization of " + n + " is: ");

        // for each potential factor
        for (long factor = 2; factor*factor <= n; factor++) {

            // if factor is a factor of n, repeatedly divide it out
            while (n % factor == 0) {
                System.out.print(factor + " "); 
                n = n / factor;
            }
        }    
}
}