package prac2;
import java.util.Scanner;
public class threeDifferentNumbers 
{
  
    public static void main(String [] args)
    {
        int t,i,j,k,n,m,o,ti,x,count;
        int a[],b[],c[];
        int d[]=new int[3];
        
        Scanner in=new Scanner(System.in);
        t=in.nextInt();
        
        for(ti=0;ti<t;ti++)
        {
            n=in.nextInt();
            m=in.nextInt();
            o=in.nextInt();

            a=new int[n];
            b=new int[m];
            c=new int[o];
            
            for(i=0;i<n;i++)
            {
                a[i]=i+1;
            }
            for(i=0;i<m;i++)
            {
                b[i]=i+1;
            }
            for(i=0;i<o;i++)
            {
                c[i]=i+1;
            }
            count=0;
            for(i=0;i<n;i++)
            {
                for(j=0;j<m;j++)
                {
                    for(k=0;k<o;k++)
                    {
                        if((a[i]!=b[j])&&(a[i]!=c[k])&&(b[j]!=c[k]))                       
                        {
                            d[0]=a[i];
                            d[1]=b[j];
                            d[2]=c[k];
                            
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
            
            
    
        }
    }
}
