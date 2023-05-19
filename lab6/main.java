import java.io.*;
import java.util.*;
abstract class Point {
    int x1,x2,y1,y2;
    double dis;
    public Point(){
        x1=0;
        x2=0;
        y1=0;y2=0;dis=0;
    }
    public abstract void readPoint();
    public abstract void findDistance();
    void show(){
        System.out.println("x1= "+x1 +" x2= "+x2+" y1= "+y1+" y2= "+y2+ "\ndistance= "+dis);
    }
}
class distance extends Point {
    float midx,midy;
    public distance()
    {   super();
        midx=0;
        midy=0;
    }
    public void readPoint(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter x1:");
        x1=input.nextInt();
        System.out.print("enter x2:");
        x2=input.nextInt();
        System.out.print("enter y1:");
        y1=input.nextInt();
        System.out.print("enter y2:");
        y2=input.nextInt();
    }
    public void findDistance(){
        dis= Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)); 
    }
    public void findMidpoint(){
        midx=(x1+x2)/2;
        midy=(y1+y2)/2;
    }
    public void show(){
        super.show();
        System.out.println("midx= "+midx+ " midy= "+midy);
    }

}
class main{
public static void main(String args[]){
    distance obj =new distance();
    obj.readPoint();
    obj.findDistance();
    obj.findMidpoint();
    obj.show();
}
}