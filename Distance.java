package JavaPackages;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
        // input point coordinates
    	System.out.println("Enter the x coordinates: ");
        int x = s.nextInt();
    	System.out.println("Enter the y coordinates: ");
        int y = s.nextInt();
 
        // compute distance
        //double distance = Math.sqrt((x * x) + (y * y));
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        // output distance
        System.out.println("Distance from (0, 0) to (" +x + ", " + y + ") is " +distance);
 
    }
}