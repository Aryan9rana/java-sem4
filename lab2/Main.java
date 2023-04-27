import java.io.*;
import java.util.*;

class Student{
    int id;
    String name,branch,uni;


    public void setDetails(){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter name: ");
        name=sc.nextLine();
        System.out.print("enter branch: ");
        branch=sc.nextLine();
        System.out.print("enter university: ");
        uni=sc.nextLine();
        System.out.print("enter ID: ");
        id=sc.nextInt();
        }
    public void getDetails(){
        System.out.println("enter name: "+name);
        System.out.println("enter branch: "+branch);
        System.out.println("enter university: "+uni);
        System.out.println("enter ID: "+id);
    }
}

class Main{
    public static void main(String args[]){
        Student s1= new Student();
        s1.setDetails();
        s1.getDetails();
    }
}