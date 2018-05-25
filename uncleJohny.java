package prac2;
import java.util.Arrays;
import java.util.Scanner;
public class uncleJohny {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int t,j,i,k,n,l;
        int a[];
        t=in.nextInt();
        //t text cases
        for(j=0;j<t;j++)
        {
            n=in.nextInt(); //n in the number of songs
            a=new int[n];
            for(i=0;i<n;i++)
            {
                a[i]=in.nextInt(); //length of n songs 
            }
            k=in.nextInt();
            l=a[k-1];   //get the initial length of the song
            Arrays.sort(a);
            for(i=0;i<n;i++)  //find that length
            {
                if(a[i]==l)
                {
                    System.out.println(i+1);
                }                  
            }
        }
    }
}
