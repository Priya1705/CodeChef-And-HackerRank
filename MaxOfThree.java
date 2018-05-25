
package prac2;
import java.util.Scanner;

public class MaxOfThree {
 
private static int max3(int x, int y, int z) {
  
   if( x>=y )
   {
       if(x>=z)
           return x;
       else 
           return z;
   }
   else if(z>=y)
   {
       return z;
   }
   else
   {
       return y;
   }
  
}
public static void main(String [] args)
{
   MaxOfThree ob=new MaxOfThree();
   Scanner in=new Scanner(System.in);
   int a,b,c;
   a=in.nextInt();
   b=in.nextInt();
   c=in.nextInt();
   
   System.out.println(ob.max3(a,b,c));
}
}
