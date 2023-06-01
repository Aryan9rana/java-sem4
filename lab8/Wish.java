//write a class display having synchonized void wish(String) methods that wishes hello to given string name. Between printing hello and provided stirng name apply delay of 500 milliseec. Suppose multiple threads are there and they are trying to access this wish () method cocurrently on different objects then irregular output will be there . write this application is such a way so that ouput bemoces regular.
import java.util.*; import java.io.*;
class Display {
public synchronized void wish(String name) {
for (int i = 0; i < 5; i++) { System.out.print("Hello "); try {
Thread.sleep(500);
} catch (InterruptedException e) {
System.out.println(e); }
System.out.println(name); }
} }
public class Wish {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in); System.out.println("Enter Your First Name"); String FirstName = sc.nextLine(); System.out.println("Enter Your Last Name"); String LastName = sc.nextLine();
Display d1 = new Display();
Display d2 = new Display();
Thread thread1 = new Thread(() -> { d1.wish(FirstName);
});
Thread thread2 = new Thread(() -> { d2.wish(LastName);
});
thread1.start();
thread2.start(); }
}