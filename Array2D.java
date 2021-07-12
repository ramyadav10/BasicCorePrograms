package JavaPackages;

import java.util.Scanner;

public class Array2D{
	
	static int M, N,i,j;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	  	System.out.println("Enter the row value: ");
	  	M=s.nextInt();
	  	System.out.println("Enter the column value: ");
	 	N=s.nextInt();
	 	int[][] array = new int[M][N]; 
	 	for(i=0; i<M;i++) {
	  		for(j=0; j<N;j++) {
	  			array[i][j]=i*j;
	  			System.out.print(array[i][j]+"   ");	
	  		}
	  		System.out.println();
	 	}
	}
}
