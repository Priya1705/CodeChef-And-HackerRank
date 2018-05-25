package prac2;
import java.util.Scanner;

public class SparseArrays 
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n,i,j,q,count;
        String a[],b[];
        n=in.nextInt();
        a=new String[n];
        //input for strings
        for(i=0;i<n;i++)
        {
            a[i]=in.next();
        }
        
        q=in.nextInt();
        b=new String[q];
        //input for queries
        for(i=0;i<q;i++)
        {
            b[i]=in.next();
        }
        
        for(i=0;i<q;i++)
        {   
            count=0;
            for(j=0;j<n;j++)
            {
                if(b[i].equals(a[j]))
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
