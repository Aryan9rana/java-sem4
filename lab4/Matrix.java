/* 
develop a program to create a 2d array and insert elements into the array
tarverse the array and find the cordinates of a key 'k';
*/

import java.io.*;
import java.util.*;

class Matrix {

    static void printArray(int arr[][], int n, int m){
        System.out.println("array elements are: ");
        
        for (int i=0; i<n ;i++){
            for(int j=0; j<m;j++)
        System.out.print(arr[i][j]+" ");
        System.out.println();

        }
        System.out.println();

    }

static int[] search(int arr[][], int n, int m){
            Scanner sc = new Scanner(System.in);

    System.out.print("enter key:");
            int key= sc.nextInt();
            int index[]=new int[2];
        for (int i=0; i<n ;i++)
        {
        for(int j=0; j<m;j++){
        if(arr[i][j]==key){
        index[0]=i+1;
        index[1]=j+1;
        return index;
        }
} 
        }
        return null;
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();
        System.out.print("enter m: ");
        int m = sc.nextInt();
        int arr[][]= new int[n][m]; 
        System.out.println("enter array elements");
        for (int i=0; i<n ;i++)
        {
        for(int j=0; j<m;j++)
        arr[i][j]=sc.nextInt();

        }
        printArray(arr, n,m);

        int a[]= new int[2];
        a= search(arr,n,m);
        if(a!=null){
            System.out.println("coordinates: "+a[0]+","+a[1]);
        }
        else{
            System.out.print("Not found");

        }
    }
}