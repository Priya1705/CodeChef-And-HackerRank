package prac2;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
///////////////////incomplete
public class LittleTourist {
    boolean Palindrome(int arr[])
    {int i,temp[],N;
//        int temp,n,sum=0,r;
//        temp=n;    
//        while(n>0)
//        {    
//        r=n%10;  //getting remainder  
//        sum=(sum*10)+r;    
//        n=n/10;    
//        }    
    N=arr.length;
    temp=new int[N];
    for(i=0;i<N;i++)
    {
        temp[i]=arr[i];
    }
    Collections.reverse(Arrays.asList(temp));
        
            if(Arrays.equals(arr, temp))
            {
                return true;
            }
            else
            {
                return false;
            }
    } 
   public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int N,arr[],i,x,count=0,l,sum;
        boolean check=false; 
        N=in.nextInt();
        arr=new int[N];
        for(i=0;i<N;i++)
        {
            arr[i]=in.nextInt();
        }
        l=arr.length;
        LittleTourist ls=new LittleTourist();
        if(l%2!=0)
        {
            check=ls.Palindrome(arr);
            if(check==false)
            {
                System.out.println("-1");
            }
            else
            {
                System.out.println("1");
            }
        }
        else
        {
            //run test
        }
    } 
}
