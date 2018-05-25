package prac2;
import java.util.Arrays;
import java.util.Scanner;

public class SpeedyNumbers {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int N,arr[],i,x,count=0,j;
        
        N=in.nextInt();
        arr=new int[N];
        for(i=0;i<N;i++)
        {
            arr[i]=in.nextInt();
        }
    
        Arrays.sort(arr);

        x=arr[N-1]; 
        
        for(i=0;i<N;i++)
        {
            if(arr[i]==x)
            {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
