/* 
WAP following function of strign buffer object string = hello
append java
inserst java at index 1
replace with java the characters between index 1 to 2
delete 2 character between index 1 and 2
reverse the stirng hello
convert the srting into lowecase


*/

import java.util.*;
import java.io.*;

public class Buffer{
    public static void main(String args[]){
    StringBuffer str= new StringBuffer("hello");
    
    System.out.println(str.append("java"));
    System.out.println(str.insert(1,"java"));
      System.out.println(str.replace(1,2 ,"java"));
    }
} 