import java.util.Scanner;

public class BasicConcept {
    public static void main(String[] args)
    {

//print
//input
Scanner sc = new Scanner(System.in);

System.out.println("Enter integer: ");
int var1 = sc.nextInt();
System.out.println("Enter float: ");
float var2 = sc.nextFloat();
System.out.println("Enter double: ");
double var3 = sc.nextDouble();
sc.close();
Scanner scn = new Scanner(System.in);
System.out.println("Enter string: ");
String var4 = scn.nextLine();
scn.close();


System.out.println(var1);
System.out.println(var2);
System.out.println(var3);
System.out.println(var4);

    }
    
}
