import java.util.Scanner;
import java.io.*;
public class LargestWord
{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a word or sentence:");
       String str = in.nextLine();
       
       str += " "; 
       String word = "", lWord = "";
       int len = str.length();
       for (int i = 0; i < len; i++) {
           char ch = str.charAt(i);
           if (ch == ' ') {
                if (word.length() > lWord.length())
                    lWord = word;
                word = "";
           }
           else {
               word += ch;
           }
       }
       System.out.println("The longest word: " + lWord +
        ": The length of the word: " + lWord.length());
    }
}