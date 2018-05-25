package prac2;
import java.util.ArrayList;
import java.util.Scanner;

public class aFewLaughingJokes {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n,i,j,k,x,count,t;
        
        t=in.nextInt();
        for(k=0;k<t;k++)
        {
        count=0;
        n=in.nextInt();
         
        ArrayList <Integer> J= new ArrayList<Integer>();
        ArrayList <Integer> L= new ArrayList<Integer>();
        ArrayList <Integer> al= new ArrayList<Integer>();
        
        for(i=0;i<n;i++)
        {
            x=in.nextInt();
            J.add(x);
        }
        for(i=0;i<n;i++)
        {
            x=in.nextInt();
            L.add(x);
        }
        
        for(i=0;i<n;i++)
        {
            if(J.get(i)==1)
            {  
                al.add(L.get(i));
            }
        }  

        for(i=0;i<al.size()-1;i++)
        {
            if(al.get(i+1)>al.get(i))
            {
                break;
            }
            else
            {
                count++;
            }
        }       
    
        if(count>1)
        {
            System.out.println("#itsnot_arjun");

        }
        else
        {
            System.out.println("#laughing_arjun");
        } 
        }
}
}