package prac2;
import java.util.Scanner;

public class Mixtures 
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int t,i,j,n,a[],X,Y,x,y,Y2,x2,y2,X2;
     
        
            x=0;y=0;Y=0;X=0;
            x2=0;y2=0;Y2=0;X2=0;
            n=in.nextInt();
            a=new int[n];
            for(i=0;i<n;i++)
            {
                a[i]=in.nextInt();
            }           
            for(i=0;i<n;i++)
            {
                y=x*a[i];               
                x=(x+a[i])%100;                      
                X+=x;                   
                Y+=y;                   
            }
            for(i=n-1;i>=0;i--)
            {
                y2=x2*a[i];               
                x2=(x2+a[i])%100;                     
                X2+=x2;                   
                Y2+=y2;                
            }
            if(Y<Y2)
            {
                System.out.println(Y);
            }
            else
            {
                System.out.println(Y2);
            }
        
    }
}
