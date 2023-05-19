/* create a class "bank" having method getRateOfInterest().  create child classes as HDFC , SBI and pnb that override the method getRateOfInterest() and return interest reates for fiexed deposits as 
4.0,4.5 and 5 % respectively . the main class displays a menu for the customer to choose his /her bank and claclulates accordingly the amount he gets on investing principal of rupees 'p' for 't' years in a particular bank*/
import java.util.Scanner;
import java.io.*;
abstract class bank{
    public abstract double getRateOfInterest();
}
class HDFC extends bank {
    public double getRateOfInterest(){
        return 4.0;
    }
}
class PNB extends bank {
public double getRateOfInterest(){
    return 4.5;
    }
}
class SBI extends bank {
    public double getRateOfInterest(){
        return 5.0;
    }
}



class BankInterest{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter your choice\n 1.HDFC \n 2.PNB \n 3.SBI");
        int a=input.nextInt();
        double interest=0;
        double r=0;
        switch(a){
            case 1:
            bank b1= new HDFC();
            r=b1.getRateOfInterest();
            break; 
            case 2:
            bank b2= new PNB();
            r=b2.getRateOfInterest();
            break; 
            case 3:
            bank b3= new SBI();
            r=b3.getRateOfInterest();
            break; 
            default : System.out.println("wrong choice");
        }
        System.out.print("enter principle amt: ");
        double p=input.nextDouble();
        System.out.print("enter years: ");
        int t= input.nextInt();
        interest= (p*(double)t*r)/100;
        double amt=p+interest;
        System.out.println("interest= "+interest);
        System.out.println("net amount ="+amt);
    }
}
