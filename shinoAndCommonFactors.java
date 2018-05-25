package prac2;
import java.util.Scanner;
     
   public class shinoAndCommonFactors
    {
    static int gcd(int a, int b)
    {
        if (a == 0 || b == 0)
           return 0;

        if (a == b)
            return a;

        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
    
    public static void main(String[] args) 
    {   Scanner in=new Scanner(System.in);
        int a,b,i,x;
        int count=0;
        
        //input 
        a=in.nextInt();
        b=in.nextInt();
        
        //hcf of the two numbers
        
            x=gcd(a,b);
        
//        if(a<b)
//        {
           for(i=1;i<=x;i++)
           {   
               if(a%i==0)
               {    // System.out.println("i is "+ i);
                   if(b%i==0)
                   {
                       count++;
                   }
               }
           } 
//        }
//        else
//        {
//            for(i=1;i<=x;i++)
//           {    
//               if(a%i==0)
//               {     System.out.println("i is "+ i);
//                   if(b%i==0)
//                   {
//                       count++;
//                   }
//               }
//           } 
//        }
        System.out.println(count);
    }
}
   
    

