package prac2;
import java.util.Scanner;

public class TheNextPalindrome 
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int t,k,i,j,x,p;
        
        t=in.nextInt();
        for(j=0;j<t;j++)
        {
            boolean palin=false;      
            k=in.nextInt();  
            p=k+1;         
            while(palin==false)
            { 
                k=p;
                x=0;
                while(k!=0)
                {
                   x=x*10;            
                   x=x+k%10;
                   k=k/10;
                }
                if(p==x)
                {
                    palin=true;
                }
                if(palin==true)
                {
                    System.out.println(p);
                }
                p++;
            }
        }
    }
}
