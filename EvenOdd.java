package JavaPackages;

import java.util.Scanner;

public class EvenOdd {
	static int number;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	  	System.out.println("Enter the Number ");
	  	number=s.nextInt();
	  	if(number%2 == 0) {
	  		System.out.println("Number is Even");
	  	}else {
	 		System.out.println("Number is Odd");
	  	}
	
	}

}
