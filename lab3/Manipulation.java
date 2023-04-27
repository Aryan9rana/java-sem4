









import java.util.*;
import java.io.*;

public class Manipulation{
    public static void main(String args[]){
        String str= "Java";
        str.concat("welcome");
        System.out.println(str);
        System.out.println("enter i: ");
        Scanner sc= new Scanner(System.in);
        int i=sc.nextInt();
        System.out.println(str.charAt(i));
        System.out.println("index of first a: "+str.indexOf('a'));
        int result = str.compareTo("JAVA");
        System.out.println("Comparison result: " + result);
        result = str.compareToIgnoreCase("JAVA");
        System.out.println("Comparison result ignoring case: " + result);
        System.out.println("Index of last 'a': " + str.lastIndexOf('a'));

        StringBuffer sb = new StringBuffer("HELLO");
        sb.append("Java");
        System.out.println(sb); 
        sb.insert(1, "Java");
        System.out.println(sb); 
        sb.replace(1, 3, "Java");
        System.out.println(sb); 
        sb.delete(1, 3);
        System.out.println(sb); 
        sb.reverse();
        System.out.println(sb); 
        String lowerCase = sb.toString().toLowerCase();
        System.out.println(lowerCase); 
    }
} 