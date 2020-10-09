import java.util.*;
public class XpowerToy {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int val =1;
        for(int i =1 ; i<=y; i++)
        {
            val *= x;
        }
        System.out.print(val);
    }
}
