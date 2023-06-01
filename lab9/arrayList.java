import java.io.*;
import java.util.*;

class arrayList{
public static void main(String args[]){
ArrayList<String> colors = new ArrayList<>();
colors.add ("Red");
colors.add ("Green");
colors.add ("Blue");
colors.add ("yellow"); 
colors.add ("violet");
System.out.println("Colors in the arraylist are:");
for (String color: colors) {
System.out.println(color);
}
}
}