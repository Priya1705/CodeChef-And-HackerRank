package prac2;

public class JaggedArray 
{
    public static void main(String[] args)
    {
        int i,j,r=5,count=0;
        int arr[][]=new int[r][];
        
        for(i=0;i<r;i++)
        {
            arr[i]=new int[i+1];
        }
        
        for(i=0;i<r;i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
                arr[i][j]=count++;
            }    
        }
        
        for(i=0;i<r;i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }    
            System.out.println();
        }
    }
}
