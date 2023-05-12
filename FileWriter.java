//write a program that enters the following details of a worker in a factory such as worker name, id ,city,contact number from keyborad and stored those details in text file.

import java.util.*;
import java.io.*;

class FileWriter
{
public static void main(String args[])throws IOException{
Scanner sc=new Scanner(System.in);
String name,city,contactnumber,id;
name=sc.nextLine();
city=sc.nextLine();
contactnumber=sc.nextLine();
id=sc.nextLine();

PrintWriter pw =new PrintWriter("home/gehu/hhhhh.txt");
pw.write(name);
pw.write(city);
pw.write(contactnumber);
pw.write(id);
}
}
