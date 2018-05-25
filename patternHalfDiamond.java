package prac2;

public class patternHalfDiamond {
    public static void main(String[]args)
    {
        int i,j;
        for(i=0;i<4;i++)
        {
            int sum=1;
            for(j=0;j<=i;j++)
            {               
                System.out.print(sum);
                sum+=2;
            }
            System.out.println();
        }
        for(i=0;i<3;i++)
        {
            int sum=1;
            for(j=2;j>=i;j--)
            {
                System.out.print(sum);
                sum+=2;
            }
            System.out.println();
        }
    }
}
