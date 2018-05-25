package prac2;
import java.util.Scanner;

public class hearts {
  public static void main(String [] args)
  {
      Scanner in=new Scanner(System.in);
      int t,m,n,k,j,i,a[];
      t=in.nextInt();
      for(j=0;j<t;j++)
      {
          m=in.nextInt();
          n=in.nextInt();
          k=in.nextInt();
          a=new int[m*n];
          for(i=0;i<m*n;i++)
          {
              a[i]=i+1;
          }
          
      }
  }  
}
