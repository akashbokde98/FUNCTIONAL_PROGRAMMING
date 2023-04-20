package com.bl.Functional_Programming;
import java.util.Scanner;
import java.lang.Math;

public class Distance
{
    //Declared Method For Calculate Euclidean Distance.
    public void printDistance(double a, double b)
    {
        //Formula To Calculate Distance.
        //distance = sqrt(x*x + y*y).
        double p1 = Math.pow(a,b);
        double p2 = Math.pow(a,b);

        double distance = Math.sqrt(p1 + p2);
        System.out.println("Euclidean distance:" + distance);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter X-Point Value:");
        double x = sc.nextFloat();
        System.out.println("Enter Y-Point Value:");
        double y = sc.nextFloat();
        //Created Object of Class In Order to Call Method.
        Distance d = new Distance();
        d.printDistance(x, y);
    }
}
