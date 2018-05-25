package prac2;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n,m,i,j,a,b,k;
        int arr[];
        n=in.nextInt();
        arr=new int[n];
        m=in.nextInt();
        
        for(i=0;i<m;i++)
        {
            a=in.nextInt();
            b=in.nextInt();
            k=in.nextInt();
            for(j=a;j<=b;j++)
            {
                arr[j-1]=arr[j-1]+k;
            }
        }
       

        Arrays.sort(arr);       
        System.out.println(arr[n-1]);
    }
}
