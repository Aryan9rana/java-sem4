/* develop a java program to find the maximum 
second max and minimun , second minimum
from an array of "n" intergers (wihtout using any sorting)
*/

import java.io.*;
import java.util.*;

class maxmin {

    static void printArray(int arr[], int n){
        System.out.println("array elements are: ");
        
        for (int i=0; i<n ;i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();
        int arr[]= new int[n]; 
        System.out.println("enter array elements");
        for (int i=0; i<n ;i++){
            arr[i]= sc.nextInt();
        }
        printArray(arr, n);

        int max=0 , min =0;
        int secondmax=0 , secondmin=0;
        for (int i=1; i<n ;i++){
            if(arr[i]>arr[max]){
                secondmax=max;
                max=i;
            }
            else if(arr[i]> arr[secondmax] && arr[i]!=arr[max]){
                secondmax=i;
            }
            if(arr[i]<arr[min] ) {
                secondmin=min;
                min= i;
                }

            else if(arr[i]< arr[secondmin] && arr[i]!= arr[min]){
                secondmin=i;
            }
        }
        // for (int i=0; i<n ;i++){
        //     if(arr[i]> secondmax && arr[i]!=max){
        //         secondmax=arr[i];
        //     }
        //     if(arr[i]< secondmin && arr[i]!= min){
        //         secondmin=arr[i];
        //     }
        // }

    System.out.println("max ="+arr[max]);
    System.out.println("2max ="+arr[secondmax]);
    System.out.println("min ="+arr[min]);
    System.out.println("2min ="+arr[secondmin]);

    }
}