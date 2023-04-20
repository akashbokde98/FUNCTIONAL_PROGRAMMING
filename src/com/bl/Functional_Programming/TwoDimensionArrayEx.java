package com.bl.Functional_Programming;
import java.util.Scanner;
public class TwoDimensionArrayEx
{
    //Function For Displaying Array Elements.
    public void PrintArrayElements(int[][] arr, int r , int c)
    {
        //Retrieving Array Elements.
        System.out.println("User Entered Array Element is:");
        for (int i = 0; i < arr.length ; i++)
        {
            for (int j = 0; j < c; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number Of Row:");
        int row = sc.nextInt();
        System.out.println("Enter Number Of Column:");
        int col = sc.nextInt();
        //Declared 2D Array.
        int[][] intArr = new int[row][col];
        //Assigning User Input Value to The Array.
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                intArr[i][j] = sc.nextInt();
            }
        }
        //Created Object For Calling Fuction.
        TwoDimensionArrayEx obj = new TwoDimensionArrayEx();
        obj.PrintArrayElements(intArr, row, col);
    }
}
