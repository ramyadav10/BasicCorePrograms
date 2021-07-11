package JavaPackages;

import java.util.Scanner;

public class CheckVowel {
	static char letter;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	  	System.out.println("Enter the Letter ");
	  	letter=s.next().charAt(0);
	  	if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ){
            System.out.println(letter + " is vowel");
	  	}else {
            System.out.println(letter + " is consonant");
	  	}
    }
}

