package prac2;
import java.util.Scanner;

public class ChefRestoresAMatrix 
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int i,j,a[][],n,m,t,k,var;
        t=in.nextInt();
        for(k=0;k<t;k++)
        {
            n=in.nextInt();
            m=in.nextInt();
            a=new int[n][m];
            //input matrix
            for(i=0;i<n;i++)
            {
                for(j=0;j<m;j++)
                {
                    a[i][j]=in.nextInt();
                }
            }
            var=a[0][0];
            //first column
            for(i=0;i<n;i++)
            {
                if(a[i][0]==-1)
                {
                    a[i][0]= var;
                }
                else
                {
                    var=a[i][0];
                }
            } 
            var=a[0][0];
            //first row
            for(i=0;i<m;i++)
            {
                if(a[0][i]==-1)
                {
                    a[0][i]= var;
                }
                else
                {
                    var=a[0][i];
                }
            }
            //check first row and first column
            for(i=0;i<m-1;i++)
            {
                if(a[i+1][0]<a[i][0])
                {
                    System.out.println("-1");
                }
            }
            for(i=0;i<n-1;i++)
            {
                if(a[0][i+1]<a[0][i])
                {
                    System.out.println("-1");
                }
            }
            //rest of the matrix
            for(i=1;i<n;i++)
            {
                for(j=1;j<m;j++)
                {
                    if(a[i][j]==-1)
                    {
                        if(a[i-1][j]>a[i][j-1])
                        {
                            a[i][j]=a[i-1][j];
                        }
                        else
                        {
                            a[i][j]=a[i][j-1];
                        }
                    }
                }
                //check
                if((a[i][j]<a[i-1][j])||(a[i][j]<a[i][j-1]))
                {
                    System.out.println("-1");
                }
            }
            
            
            
        }                
    }
}
