package prac2;
import java.util.ArrayList;
import java.util.Scanner;
public class GiftRift {
    public static void main(String[]args)
    {
       Scanner in=new Scanner(System.in); 
       int r,c,i,j;
       ArrayList<Integer> maxn=new ArrayList<Integer>();
       ArrayList<Integer> minn=new ArrayList<Integer>();
       ArrayList<Integer> ans=new ArrayList<Integer>();
       r=in.nextInt();
       c=in.nextInt();
       
       int x[][]=new int[r][c]; 

       for(i=0;i<r;i++)
       {
           for(j=0;j<c;j++)
           {
               x[i][j]=in.nextInt();
           }
       }
       for(i=0;i<c;i++)
       {   int max=0; 
           for(j=0;j<r;j++)
           {
               if(x[j][i]>=max)
               {
                   max=x[j][i];
               }          
           } 
        //   System.out.println("max is"+max);   
           maxn.add(max);   
       }
       for(i=0;i<r;i++)
       {   int min=10000; 
           for(j=0;j<c;j++)
           {
               if(x[i][j]<=min)
               {
                   min=x[i][j];
               }          
           } 
          // System.out.println("min is"+min);   
           minn.add(min);
       }
       
       	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
                    if(x[i][j]==maxn.get(j)&&x[i][j]==minn.get(i))
                    {
                        ans.add(x[i][j]);
                        //System.out.println(x[i][j]);
                    }
                }
	}
           
        Object[] st = ans.toArray();
        for (Object s : st) {
        if (ans.indexOf(s) != ans.lastIndexOf(s)) {
            ans.remove(ans.lastIndexOf(s));
         }
      }

        if(!ans.isEmpty())
        {
            for(int a:ans)
            {
                System.out.print(a);
            }
        }
        else
        {
            System.out.println("GUESS");
        }
       
    }
}
