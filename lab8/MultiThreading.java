// write a multithreading program where these are three threads . the first thread prints the numbers from 1 to 10 , the second thread prints your name five times on the screen, and the thrid thread prints "JAVA" ten times on the screen. the threads complete their task cocurrently

import java.io.*;
import java.util.*;
 class myThread1 extends Thread{
public void run(){
    for(int i=1;i<=10;i++){
        System.out.println(i);
    }
}
}
 class myThread2 extends Thread{
public void run(){
    for(int i=1;i<=5;i++){
        System.out.println("aryan");
    }
}}
 class myThread3 extends Thread{
public void run(){
    for(int i=1;i<=10;i++){
        System.out.println("JAVA");
    }
}}

class MultiThreading{
public static void main(String args[]){
    myThread1 ob1= new myThread1();
    myThread2 ob2= new myThread2();
    myThread3 ob3= new myThread3();
    ob1.start();
    ob2.start();
    ob3.start();
}
}