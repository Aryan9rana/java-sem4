import java.util.Scanner;
import java.io.*;

class Shape{
public static void area(double l,double b){
double a=l*b;
System.out.println("area of rectangle= "+ a);
}
static public void area(double side){
double a=4*side;
System.out.println("area of square= "+ a);
}
public static void area(float r){
double a=2*3.14*r*r;
System.out.println("area of circle= "+ a);
}

public static void main(String args[]){
Scanner sc= new Scanner (System.in);
System.out.println("1.rectangle area\n 2.square\n 3.circle");
int choice = sc.nextInt();
switch(choice){
case 1:
System.out.print("enter l and b: ");
double l=sc.nextDouble();
double b= sc.nextDouble();
area(l,b);
break;

case 2:
System.out.print("enter side: ");
double s=sc.nextDouble();
area(s);
break;
case 3:
System.out.print("enter radius: ");
float r=sc.nextFloat();
area(r);
break;
default: System.out.println("wrong choice");
}
}
}