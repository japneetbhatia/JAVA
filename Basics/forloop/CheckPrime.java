import java.util.*;
public class CheckPrime {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int val = 0;

        for(int i=2; i*i <=no; i++)
        {
            if(no%i == 0)
            {
                val =1;
                break;
            }
        }

        
        if(val == 1 || no<2)
           System.out.println("Not Prime");
        else
        System.out.println("Prime");
    }
}
