/* 
create a jagged array having 3 rows where 1st row contains 3 columns 2nd row contains 4 columns and  3rd row contains 2 columns.
insert the elems into the array and find the sum of each row.
*/


import java.io.*;
import java.util.*;

class Jagged {

    public static void main (String args[]){
        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];
        Scanner sc= new Scanner (System.in);
        System.out.println("enter array elements");           

        for (int i = 0; i < arr.length; i++){
                System.out.println("row "+i+":");           
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = sc.nextInt();}

      System.out.println("array elements are: ");           
    for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j]+" ");

                System.out.println();

       }   
       }
}