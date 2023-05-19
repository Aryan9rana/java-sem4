//write a java program to handle exception when taking an array of size 'n' as input and trying to divide any two numbers in array with proper exception handlers 
//such as ArithmeticException, ArrayOutOfBoundsException or any other exception.

import java.util.Scanner;
import java.io.*;

class ExceptionHandling
{
public static void main(String args[]){
int n;
Scanner sc= new Scanner (System.in);
System.out.println("enter n:");
n=sc.nextInt();
int[]arr= new int [n];
for(int i=0;i<n;i++){
System.out.print("enter array element: ");
arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
System.out.println(arr[i]+" ");

try{
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println(arr[a]/arr[b]);
}
catch(ArithmeticException e){
System.out.println(e);
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println(e);
}
catch(Exception e){
System.out.println(e);
}
}
}
