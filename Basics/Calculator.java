import java.util.Scanner;
public class Calculator {
    public static void main(String[] args)
    {
       int a = 15;
       int b = 10;
       int sum = a+b;
       int mul = a*b;
       int d1= a/b;
       int d2= b/a;
       int r1 = a%b;
       int r2= b%a;
       int exp = (a*b)/(a+b);  //priority
       System.out.println("\nSum of "+a+" and "+b+" is "+sum);
       System.out.println("multiply of "+a+" and "+b+" is "+mul);
       System.out.println("division of "+a+" and "+b+" is "+d1);
       System.out.println("divison of "+b+" and "+a+" is "+d2);
       System.out.println("reminder of "+a+" and "+b+" is "+r1);
       System.out.println("reminder of "+b+" and "+a+" is "+r2);
       System.out.println("result of exponential is "+exp);
    }
    
}
