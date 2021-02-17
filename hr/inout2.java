import java.util.Scanner;

public class Solution {

public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
