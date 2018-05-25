package prac2;
import java.util.Scanner;

public class arraysearch {
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[25];
        for(int i=0;i<25;i++)
        {
            a[i]=in.nextInt();
        }
//        for(int i=0;i<25;i++)
//        {
//            System.out.println(a[i]);
//        }
        System.out.println("enter number to search");
        int y=in.nextInt();
        int count=0;
        for(int i=0;i<25;i++)
        {
            if(a[i]==y)
            {
                count++;
            }
        }
        if(count>0)
        {
            System.out.println("present"+count);
        }
    }   
}
