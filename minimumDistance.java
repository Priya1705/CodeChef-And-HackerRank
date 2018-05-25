package prac2;
import java.util.Scanner;
public class minimumDistance {
    public static void main(String [] args)
    {
       Scanner in=new Scanner(System.in);
       int t,s,d,i,j,n,x,y;
       n=in.nextInt();
       for(j=0;j<n;j++)
       {
           t=in.nextInt();
           s=in.nextInt();
           d=in.nextInt();
           
           x=Math.max(t,s);
           y=Math.min(t,s);
           
           if(x+y<d)   
           {
               System.out.println(d-(x+y));
           }
           else if(x>y+d)   
           {
               System.out.println(x-(y+d));
           }
           else
               System.out.println("0");
       }
    }
}
