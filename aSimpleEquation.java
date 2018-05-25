package prac2;
import java.util.Scanner;

public class aSimpleEquation {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int t,ti,A,B,C,N,i,j,k,count,smaller;
        t=in.nextInt();
        for(ti=0;ti<t;ti++)
        {
            N=in.nextInt();
            A=in.nextInt();
            B=in.nextInt();
            C=in.nextInt();

            count=0;
            for(i=0;i<=A;i++)
            {
                for(j=0;j<=B;j++)
                {                       
                        k=N-(i+j);
                        if(k>=0)
			{
                            if(k<=C)
				smaller=k;
                            else
				smaller=C;
                            
                            count=count+(smaller+1);
			}
                    }
                }          
            System.out.println(count);  
        }
    }
}

