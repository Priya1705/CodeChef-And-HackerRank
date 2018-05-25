package prac2;
import java.util.Scanner;

public class santaAndFootballMatch {
    public static void main(String [] args)
    {
        Scanner in= new Scanner(System.in);
        int t,i,n,k,x;
        t=in.nextInt();
        for(i=0;i<t;i++)
        {
            n=in.nextInt();
            k=in.nextInt();
            x=k/3;
            System.out.println(x);
        }  
    }
}
