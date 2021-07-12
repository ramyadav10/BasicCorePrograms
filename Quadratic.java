package JavaPackages;

import java.util.Scanner;

public class Quadratic{
	
	public static void main (String[] args){
		
      double a, b, c;  // ax^2 + bx + c
      double discriminant, root1, root2;

      Scanner s = new Scanner (System.in);

      System.out.print ("Enter the coefficient of x squared: ");
      a = s.nextDouble();

      System.out.print ("Enter the coefficient of x: ");
      b = s.nextDouble();

      System.out.print ("Enter the constant: ");
      c = s.nextDouble();

      // Use the quadratic formula to compute the roots.
      // Assumes a positive discriminant.

      discriminant = Math.pow(b, 2) - (4 * a * c);
      root1 = ((-1*b) + Math.sqrt(discriminant)) / (2 * a);
      root2 = ((-1*b) - Math.sqrt(discriminant)) / (2 * a);

      System.out.println ("Root #1: " + root1);
      System.out.println ("Root #2: " + root2);
   }
}
