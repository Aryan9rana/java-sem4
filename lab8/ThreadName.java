// program to set and get the name of threads also set and get the priotrity of the threads.
import java.io.*;
import java.util.*;
class mythread extends Thread{
    public void run(){
    System.out.println("priority is: "+ Thread.currentThread().getPriority());
    }
}
class ThreadName{
public static void main(String args[]){
    mythread th= new mythread();
    th.setPriority(Thread.MAX_PRIORITY);
    th.start();
    System.out.println(th.getPriority());
    System.out.println("thread name=" +th.getName());
}
}