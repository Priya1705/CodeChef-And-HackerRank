package prac2;
import java.util.Scanner;
     
   public class try2
    {
//    static int gcd(int a, int b)
//    {
//        if (a == 0 || b == 0)
//           return 0;
//
//        if (a == b)
//            return a;
//
//        if (a > b)
//            return gcd(a-b, b);
//        return gcd(a, b-a);
//    }
    
    public static void main(String[] args) 
    {   Scanner in=new Scanner(System.in);
        int a,b,i,x,t;
        int count=0;
 
        a=in.nextInt();
        b=in.nextInt();
        
//        for(i=1;i<= a && i <= b;++i)
//        {
//            // Checks if i is factor of both integers
//            if(a % i==0 && b % i==0)
//                x = i;
//        }

//        while(a != b)
//        {
//            if(a > b)
//                a -= b;
//            else
//                b -= a;
//        }
//        
//        System.out.printf("G.C.D of %d and %d is %d i", a, b, x);
         while(b != 0)
        {
            t = b;
            b = a%b;
            a = t;
        }
		
        x = a;
        
       
        //x=a;
         //   x=gcd(a,b);

           for(i=1;i<=x;i++)
           {   
               if(a%i==0)
               {  
                   if(b%i==0)
                   {
                       count++;
                   }
               }
           } 
        System.out.println(count);
    }
}
   
    

