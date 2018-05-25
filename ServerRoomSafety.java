package prac2;
import java.util.Scanner;

public class ServerRoomSafety 
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        int n,p[],h[],i,j,count=0,k;
        boolean left=false,right=false;
        n=in.nextInt();
        p=new int[n];
        h=new int[n];
        for(i=0;i<n;i++)
        {
            p[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            h[i]=in.nextInt();
        }
        
        for(i=0;i<n-1;i++)
        {   
            j=i;
            for(k=i+1;k<n;k++)
            {
                if((p[i]+h[i])>=p[k])
                {
                    count++;
                }
                if(count==(n-1))
                {
                    left=true;
                }
            } 
        }
         count=0;
        for(i=n-1;i>0;i--)
        {
            j=i;   
            for(k=i-1;k>=0;k--)
            {
                if((p[i]-h[i])<=p[k])
                {
                    count++;

                }
                if(count==(n-1))
                {
                    right=true; 
                }
            }
        }
        if(left==true && right==true)
        {
            System.out.println("BOTH");
        }
        else if(left==true && right==false)
        {
            System.out.println("LEFT");
        }
        else if(left==false && right==true)
        {
            System.out.println("RIGHT");
        }
        else if(left==false && right==false)
        {
            System.out.println("NONE");
        }
        
    }
}
