package prac2;
import java.util.Arrays;
import java.util.Scanner;

public class ChefJudgesACompetition 
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        int t,j,n,A[],B[],i,sumA,sumB;
        
        t=in.nextInt();
        for(j=0;j<t;j++)
        {   sumA=0;
            sumB=0;
            n=in.nextInt();
            A=new int[n];
            B=new int[n];

            for(i=0;i<n;i++)
            {
                A[i]=in.nextInt();
            }
            for(i=0;i<n;i++)
            {
                B[i]=in.nextInt();
            }
            Arrays.sort(A);
            Arrays.sort(B);
            A[n-1]=0;
            B[n-1]=0;

            for(i=0;i<n;i++)
            {
                sumA+=A[i];
            }
            for(i=0;i<n;i++)
            {
                sumB+=B[i];
            }
            if(sumA>sumB)
            {
                System.out.println("Bob");
            }
            else if(sumA<sumB)
            {
                System.out.println("Alice");
            }
            else
            {
                System.out.println("Draw");
            }
        } 
    }
}
