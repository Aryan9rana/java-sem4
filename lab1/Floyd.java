import java.io.*;
import java.util.Scanner;
public class Floyd {
   public static void main(String args[]){
      int n,i,j,k = 1;
      System.out.println("Enter the number of lines you need in the Floyd's Triangle");
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();

      for(i = 1; i <= n; i++) {
         for(j=1;j <= i; j++){
            System.out.print(" "+k++);
         }
         System.out.println();
      }
   }
}