// write a program in java to merge the contents of two files into third file.(use appropriate character streams to input and output)
import java.io.*;
import java.util.*;

class mergeFiles{
public static void main(String args[])
    throws Exception{
        PrintWriter pw = new PrintWriter("main.txt");
        FileReader fw1= new FileReader("file1.txt");
        BufferedReader buf1= new BufferedReader(fw1);
        String line=buf1.readLine();
        while(line!=null){
        System.out.println(line);
            pw.println(line);
            line=buf1.readLine();
        }
        FileReader fw2= new FileReader("file2.txt");
        BufferedReader buf2= new BufferedReader(fw2);
        line=buf2.readLine();
        while(line!=null){
        System.out.println(line);
            pw.println(line);
            line=buf2.readLine();
        }
        pw.flush();
        buf1.close();
        buf2.close();
        pw.close();
    }
}
