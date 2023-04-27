import java.io.*;
import java.util.Scanner;


class Product{
String name;
int code;
double amount;
public Product(){
name=null;
code=0;
amount=0;
}
public Product(String n, int c, double p){
name=n;
code=c;
amount=p;
}

public void show(){
System.out.println("name= "+name);
System.out.println("code= "+code);
System.out.println("amount= "+amount);
}

}

class Sales extends Product{
int day;
double tax=0;
double totamt=0;
public Sales(){
super();
day=0;
}
public Sales(String s, int c, double p, int d){
super(s,c,p);
day=d;
}

public void compute(){
tax=(super.amount*12.4)/100;
double fine=0;
if(day>30){
 fine=(super.amount*2.5)/100;
} 
totamt= super.amount+tax+fine;
System.out.println("total="+totamt);
}

}


class Tax{
public static void main(String srgs[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter name: ");
String name=sc.nextLine();
System.out.print("enter code: ");
int code=sc.nextInt();
System.out.print("enter actual amount: ");
double amt=sc.nextDouble();
System.out.print("enter days: ");
int day=sc.nextInt();
Sales obj= new Sales(name,code,amt,day);
obj.compute();

}
}