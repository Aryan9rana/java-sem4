import java.io.*;
import java.util.Scanner;

class calculator{
  public static void main(String[] args) {

    char operator;
    Double a, b, result;

    
    Scanner sc = new Scanner(System.in);

while(true){
    System.out.println("Choose an operator: +, -, *, or / \n Enter ? to end");
    operator = sc.next().charAt(0);

    if(operator=='?') System.exit(0);
    System.out.println("Enter first number");
    a = sc.nextDouble();

    System.out.println("Enter second number");
    b = sc.nextDouble();
    switch (operator) {

      
      case '+':
        result = a + b;
        System.out.println(a + " + " + b + " = " + result);
        break;

      
      case '-':
        result = a - b;
        System.out.println(a + " - " + b + " = " + result);
        break;

      
      case '*':
        result = a * b;
        System.out.println(a + " * " + b + " = " + result);
        break;

      
      case '/':
        result = a / b;
        System.out.println(a + " / " + b + " = " + result);
        break;
      default:
        System.out.println("Invalid operator!");
        break;
    }
}
  }
}