package prac2;
import java.util.Scanner;

public class CompilersAndParsers {
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        int t,i,j,c,n,count1,count2;
        String s;
        
        t=in.nextInt();
        for(j=0;j<t;j++)
        {
           s=in.next();
           count1=0;
           count2=0;
           
           for(i=0;i<s.length();i++)
           {
                c=s.charAt(i);
                
                if(c=='<')
                {
                   count1++; 
                }
                else if(c=='>')
                {
                    if(count1==0)
                    {
                      break;  
                    }
                    else
                    {
                        count2++;
                    }
                }                
           }
                if(count1>count2)
                {
                    System.out.println(2*count2);
                }
                else
                {
                    System.out.println(2*count1);
                }
        }        
    }
}
