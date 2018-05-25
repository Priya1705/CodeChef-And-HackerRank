package prac2;

public class armstrong {
    public static void main(String[] args)
    {
        int x;
        for(int num=100;num<=1000;num++)
        {
            int t=num;
            int sum = 0;
            while(t!=0)
            {
                x=t%10;
                sum=sum+(x*x*x);
                t=t/10;
            }
            if(sum==num)
            {
                System.out.println("armstrong"+num);
            }
        }
    }
}
