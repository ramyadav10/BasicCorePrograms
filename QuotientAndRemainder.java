package JavaPackages;

import java.util.Scanner;

public class QuotientAndRemainder {
	static int dividend;  
	static int divisor;
    public static void main(String[] args){
    	Scanner s=new Scanner(System.in);
	  	System.out.println("Enter the Dividend Number ");
	  	dividend=s.nextInt();
	  	System.out.println("Enter the Divisor Number ");
	  	divisor =s.nextInt();
  
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
  
        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);
    }
}