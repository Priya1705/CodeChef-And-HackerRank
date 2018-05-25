package prac2;
import java.util.Scanner;

public class test {
    public static void main(String[]args)
    {
        Scanner in =new Scanner(System.in); 
        int t,i,j,n,k,count[];
        boolean stat=false;
        String []str;
        t=in.nextInt();
        for(j=0;j<t;j++)
        {
            n=in.nextInt(); 
            //System.out.println("n is"+n);
            str=new String[n];
            count=new int[5];
            for(k=0;k<5;k++)
            {
                count[k]=0;
            }
            for(i=0;i<n;i++)
            {
              str[i]=in.next(); 
             // System.out.println("elemetns is "+k);
              if(str[i].equals("cakewalk"))
                {
                    count[0]++;
                }
                else if(str[i].equals("simple"))
                {
                    count[1]++;
                }
                else if(str[i].equals("easy"))
                {
                    count[2]++;
                }
                else if(str[i].equals("easy-medium")||str[i].equals("medium"))
                {
                    count[3]++;
                }
                else if(str[i].equals("medium-hard")||str[i].equals("hard"))
                {
                    count[4]++;
                }
                
            }
            
            for(int a=0;a<5;a++)
            {
                if(count[a]==0)
                {
                    stat=true;
                }
            }
            if(stat==false)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
