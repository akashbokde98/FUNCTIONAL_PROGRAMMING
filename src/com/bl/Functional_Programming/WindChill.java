package com.bl.Functional_Programming;
import java.util.Scanner;
public class WindChill
{
    //Method For Calculating WindChill.
    public static double CalculateWindChill(double tempFh, double windMph)
    {
        double windChill = 0;
        //Temperature Should be below 50 Fahrenheit.
        //Wind Speed Should be Above 3.0 Mph.
        if (tempFh < 50.0 && windMph > 3.0)
        {
            //Formula For Calculate windChill.
            windChill = 35.74 + (0.6215 * tempFh) + ((0.4275 * tempFh) - 35.75)*(Math.pow(windMph, 0.16));
        }
        return windChill;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Temperature:");
        double tempC = sc.nextDouble();
        System.out.println("Enter The Wind Speed:");
        double windInMs = sc.nextDouble();
        //Converting Celsius to Fahrenheit
        double tempF =  tempC * 9 / 5 + 32;
        //Converting ms to mph.
        double windInMph = Math.round(windInMs * 2.24);
        //Calling Method To Print WindChill.
        double windChill = CalculateWindChill(tempF, windInMph);
        System.out.println("Wind Chill:" + windChill);
    }
}
