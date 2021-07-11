package JavaPackages;
import java.util.Scanner;  

public class LargestNumber{  
	
	static int a, b, c, largest, temp;  
	public static void main(String[] args){  
    		
    	//object of the Scanner class  
    	Scanner s = new Scanner(System.in);  
    	//reading input from the user  
	    System.out.println("Enter the first number:");  
	    a = s.nextInt();  
	    System.out.println("Enter the second number:");  
	    b = s.nextInt();  
	    System.out.println("Enter the third number:");  
	    c = s.nextInt();  
	    //comparing a and b and storing the largest number in a temp variable  
	    temp=a>b?a:b;  
	    //comparing the temp variable with c and storing the result in the variable  
	    largest=c>temp?c:temp;  
	    //prints the largest number  
	    System.out.println("The largest number is: "+largest);  
	}  
}  