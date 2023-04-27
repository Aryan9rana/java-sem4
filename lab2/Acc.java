import java.io.*;
import java.util.*;

class Bank{
    static String name;
    static int acc_no;
    static double amount=0;
    
    public static void setDetails(){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter name: ");
        name=sc.nextLine();
        System.out.print("enter account no.: ");
        acc_no=sc.nextInt();
        }
    public static void deposit(){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number you want to deposit: ");
        double money;
        money= sc.nextDouble();
        amount+=money;
    }
    public static void withdraw(){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number you want to withdraw: ");
        double money;
        money= sc.nextDouble();
        if(money>amount){
            System.out.println("Not enough money!");
        }
        else
        amount-=money;
    }
    public static void display(){
        System.out.println("current account balance is "+amount+" rupees");
    }
}

class Acc{
    public static void main(String args[]){
        Bank.setDetails();
        Bank.deposit();
        Bank.display();
        Bank.withdraw();
        Bank.display();
    }
}