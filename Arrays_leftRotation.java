package prac2;
import java.util.Scanner;

public class Arrays_leftRotation
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n,d,i,a[],rotated[];
        n=in.nextInt();
        d=in.nextInt();
        a=new int[n];
        rotated=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(i+d<n)
            {
                rotated[i]=a[i+d];
                //i++;
            }
            else
            {
                rotated[i]=a[i+d-n];
                //i++;
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(rotated[i]+" ");
        }
    }
}
