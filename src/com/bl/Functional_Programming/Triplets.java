package com.bl.Functional_Programming;
import java.util.Scanner;

public class Triplets
{
    public static int sumOfThreeInt(int[] a, int arrSize)
    {
        int count = 0;
        for (int i = 0; i < arrSize; i++)
        {
            for (int j = i + 1; j < arrSize; j++)
            {
                for (int k = j + 1; k < arrSize; k++)
                {
                   if ( a[i] + a[j] + a[k] == 0)
                   {
                       System.out.println(a[i]+" "+a[j]+" "+a[k]);
                       count++;
                   }
                }
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N Integer input array:");
        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Enter Values To Store in Array:");
            arr[i] = sc.nextInt();
        }

        int sum = sumOfThreeInt(arr, N);
        System.out.println("Number Of Distinct Triplets is:" + sum);
    }

}
