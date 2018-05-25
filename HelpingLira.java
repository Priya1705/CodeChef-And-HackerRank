package prac2;
import java.util.Arrays;
import java.util.Scanner;

public class HelpingLira {
    
    public static int Max(int[] array)
    {
        int largest = array[0];
        int largestIndex = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] >= largest)
            {
                largest = array[i];             
                largestIndex=i;
            }
        }

        return largestIndex+1;     
    }
    public static int Min(int[] array)
    {
        int smallest = array[0];
        int smallestIndex=0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] <= smallest)
            {
                smallest = array[i]; 
                smallestIndex=i;
            }
        }

        return smallestIndex+1;     
    }
            
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        int n,j,i;
        
        int a[]=new int[6];
        n=in.nextInt();
        int area[]=new int[n];
        for(j=0;j<n;j++)
        {
            for(i=0;i<6;i++)
            {
                a[i]=in.nextInt();
            }            
                area[j]=Math.abs(((a[2]-a[0])*(a[5]-a[1])-(a[4]-a[0])*(a[3]-a[1]))/2);                                              
        }
            System.out.println(Min(area));
            System.out.println(Max(area));                 
    }
}
