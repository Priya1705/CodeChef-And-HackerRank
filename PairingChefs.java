package prac2;
import java.util.ArrayList;
import java.util.Scanner;
public class PairingChefs {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int t,m,n,i,j,k;
        t=in.nextInt();
        
        for(j=0;j<t;j++)
        {
            n=in.nextInt();
            m=in.nextInt();
            int q[][]=new int[m][2];
            ArrayList<Integer> al=new ArrayList<Integer>();
            boolean[] b=new boolean[n];          
            for(i=0;i<m;i++)
            {
                q[i][0]=in.nextInt();
                q[i][1]=in.nextInt();               
            }
            for(i=m-1;i>=0;i--)
            {
                if(!b[q[i][0]]&&!b[q[i][1]])
                {
                    al.add(0,i);
                    b[q[i][0]]=true;
                    b[q[i][1]]=true;
                }
            }
            for(int a:al)
            {
                System.out.print(a+" ");
            }
            System.out.println();
    }}
}
