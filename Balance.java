//create a LowBalanceException that occurs when user tries to withdraw some amount that is greater than his curretn bank balance. To withdraw you have to write a void withdraw(int amount)method.

import java.util.Scanner;
import java.io.*;

class LowBalanceException extends Exception{
LowBalanceException(String s){
super(s);
}
}
class Balance
{
int balance;
Balance(int n){
balance=n;}
void withdraw (int amount){
try{if(amount>balance){
throw new LowBalanceException("insufficient funds");}
else {balance=balance-amount;
System.out.println("remaining balance: "+balance);
}
}
catch(LowBalanceException e){
System.out.println(e.toString());
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter balance: ");
int B=sc.nextInt();
Balance bank= new Balance(B);
int n;
System.out.print("enter withdraw amount: ");
n=sc.nextInt();
bank.withdraw(n);
}
}
