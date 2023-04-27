import java.io.*;
import java.util.Scanner;

class Employee{
String empname ;
int empcode;
double basicpay;

public Employee(){
empcode=0;
basicpay=0;
empname=null;
}

public Employee(String n, int p, double q){
empname= n;
empcode=p;
basicpay=q;
}

public double salarycal(){
double HRA= (basicpay*40)/100;
double DA= (basicpay*30)/100;
double salary= basicpay +HRA+DA;
double allowance=(20*salary)/100;

if(allowance<=2500&& empcode<=15 && salary<=15000 ){
return salary + allowance;

}
else return salary+1000;

}
}

class Pay{
public static void main(String args[]){

Scanner input = new Scanner(System.in);
String name;
int code;
double basic;
System.out.print("enter name: ");
name= input.nextLine();
System.out.print("enter code: ");
code= input.nextInt();
System.out.print("enter bacis salary: ");
basic= input.nextDouble();
Employee emp= new Employee(name,code,basic);
double sal= emp.salarycal();
System.out.print("salary= "+sal);
}
}

