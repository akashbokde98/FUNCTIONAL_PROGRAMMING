package com.bl.Functional_Programming;
import java.lang.Math;
import java.util.Scanner;

public class Quadratic
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Value:");
        double a = sc.nextDouble();
        System.out.println("Enter Second Value:");
        double b = sc.nextDouble();
        System.out.println("Enter Third Value:");
        double c = sc.nextDouble();

        double delta = b * b - 4 * a *c;
        double x1;
        double x2;

        if (delta > 0)
        {
             x1 = (-b + Math.sqrt(delta)) / (2 * a);
             x2 = (-b - Math.sqrt(delta)) / (2 * a);
        }
        else if (delta == 0)
        {
            x1 = x2 = (-b) / (2 * a);
            System.out.println(x1 + " " + x2);
        }
        else
        {
        System.out.println("Equation has no real roots!");
        }
    }
}
