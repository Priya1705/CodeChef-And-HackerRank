
package prac2;
import java.util.Scanner;

public class ChefGoesToTheCinema
{
    public static void main(String[] args)
    {   int j,x,t;
        Scanner in=new Scanner(System.in);
        t=in.nextInt();
        for(j=0;j<t;j++)
        {
            int i=1,sum=1,prev=0;
            x=in.nextInt();
            while(x>sum)
            {
                i++;
                sum+=i;
            }
            prev=sum-i;
            if(x==sum || x==i)
            {
                System.out.println(i);
            }
            else if(x==prev)
            {
                System.out.println(i-1);
            }
            else if(sum-x < x-prev)
            {
                System.out.println(i+sum-x);
            }
            else
            {
                System.out.println(i+x-prev-1);
            }
        }
    }
}
