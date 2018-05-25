package prac2;
import java.util.ArrayList;
import java.util.Scanner;
public class MinimumMaximum
{
    public static void main(String [] args)
    {
        int t,n,i,j,y;
        Scanner in=new Scanner(System.in);
        t=in.nextInt();
        for(j=0;j<t;j++)
        {   int sum=0;
            n=in.nextInt();
            ArrayList <Integer> a=new ArrayList<Integer>();
            for(i=0;i<n;i++)
            {
                y=in.nextInt();
                a.add(y);
            }
            for(i=0;i<a.size();i++)
            {
                while(a.size()>1)
                {
                    if(a.get(0)>a.get(1))
                    {
                        sum+=a.get(1);
                        a.remove(0);
                    }
                    else
                    {
                        sum+=a.get(0);
                        a.remove(1);
                    }
                }
                System.out.println(sum);
            }
        }
    } 
}
