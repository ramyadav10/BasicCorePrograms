package JavaPackages;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
        // input point coordinates
    	System.out.println("Enter Temperature in f: ");
        double t = s.nextInt();
    	System.out.println("Enter the wind speed in v:  ");
        double v = s.nextInt();
        double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Temperature = " + t);
        System.out.println("Wind speed  = " + v);
        System.out.println("Wind chill  = " + w);
    }

}


