import java.util.*;
public class SeriesSum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float res = 0;
        for(float i =1; i<=n; i++) 
        {
            res += 1/i;
        }  
        System.out.println(res);
    }
}
