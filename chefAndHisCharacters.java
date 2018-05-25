package prac2;
import java.util.Scanner;

public class chefAndHisCharacters {
    
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String s;
        int i,j,count,x,t,n;
        n=in.nextInt();
        
     for(t=0;t<n;t++)
     {  count=0;
        s=in.nextLine(); 
        x=s.length();   
        for(i=0;i<x;i++)
        {    
          
            if(s.charAt(i)=='c')
            {
                for(j=i+1;j<=i+3;j++)
                {   
                    if(s.charAt(j)=='h')
                    {
                        if(s.charAt(j+1)=='e')
                        {   
                            if(s.charAt(j+2)=='f')
                            {   
                                count++;
                            } 
                        }
                        else if(s.charAt(j+1)=='f')
                        {
                            if(s.charAt(j+2)=='e')
                            {
                                count++;
                            } 
                        }
                        
                    }
                    else if(s.charAt(j)=='e')
                    {
                        if(s.charAt(j+1)=='h')
                        {
                            if(s.charAt(j+2)=='f')
                            {
                                count++;
                            } 
                        }
                        else if(s.charAt(j+1)=='f')
                        {
                            if(s.charAt(j+2)=='h')
                            {
                                count++;
                            } 
                        }
                        
                    }
                    else if(s.charAt(j)=='f')
                    {
                        if(s.charAt(j+1)=='h')
                        {
                            if(s.charAt(j+2)=='e')
                            {
                                count++;
                            } 
                        }
                        if(s.charAt(j+1)=='e')
                        {
                            if(s.charAt(j+2)=='h')
                            {
                                count++;
                            } 
                        }
                        
                    }
                    
                }
            }  
            //////////////////////////////////////////////////////////
            else if(s.charAt(i)=='h')
            {
                for(j=i+1;j<=i+3;j++)
                {   
                    if(s.charAt(j)=='c')
                    {
                        if(s.charAt(j+1)=='e')
                        {   
                            if(s.charAt(j+2)=='f')
                            {   
                                count++;
                            } 
                        }
                        else if(s.charAt(j+1)=='f')
                        {
                            if(s.charAt(j+2)=='e')
                            {
                                count++;
                            } 
                        }
                        
                    }
                    else if(s.charAt(j)=='e')
                    {
                        if(s.charAt(j+1)=='c')
                        {
                            if(s.charAt(j+2)=='f')
                            {
                                count++;
                            } 
                        }
                        else if(s.charAt(j+1)=='f')
                        {
                            if(s.charAt(j+2)=='c')
                            {
                                count++;
                            } 
                        }
                        
                    }
                    else if(s.charAt(j)=='f')
                    {
                        if(s.charAt(j+1)=='c')
                        {
                            if(s.charAt(j+2)=='e')
                            {
                                count++;
                            } 
                        }
                        if(s.charAt(j+1)=='e')
                        {
                            if(s.charAt(j+2)=='c')
                            {
                                count++;
                            } 
                        }
                        
                    }
                   
                }
            } 
            //////////////////////////////////////////////////
            else if(s.charAt(i)=='e')
            {
                for(j=i+1;j<=i+3;j++)
                {   
                    if(s.charAt(j)=='h')
                    {
                        if(s.charAt(j+1)=='c')
                        {   
                            if(s.charAt(j+2)=='f')
                            {   
                                count++;
                            } 
                        }
                        else if(s.charAt(j+1)=='f')
                        {
                            if(s.charAt(j+2)=='c')
                            {
                                count++;
                            } 
                        }
                        
                    }
                    else if(s.charAt(j)=='c')
                    {
                        if(s.charAt(j+1)=='h')
                        {
                            if(s.charAt(j+2)=='f')
                            {
                                count++;
                            } 
                        }
                        else if(s.charAt(j+1)=='f')
                        {
                            if(s.charAt(j+2)=='h')
                            {
                                count++;
                            } 
                        }
                        
                    }
                    else if(s.charAt(j)=='f')
                    {
                        if(s.charAt(j+1)=='h')
                        {
                            if(s.charAt(j+2)=='c')
                            {
                                count++;
                            } 
                        }
                        if(s.charAt(j+1)=='c')
                        {
                            if(s.charAt(j+2)=='h')
                            {
                                count++;
                            } 
                        }
                        
                    }
                    else
                        break;
                }
            } 
            ///////////////////////////////////////////////////
            else if(s.charAt(i)=='f')
            {
                for(j=i+1;j<=i+3;j++)
                {   
                    if(s.charAt(j)=='h')
                    {
                        if(s.charAt(j+1)=='e')
                        {   
                            if(s.charAt(j+2)=='c')
                            {   
                                count++;
                            } 
                        }
                        else if(s.charAt(j+1)=='c')
                        {
                            if(s.charAt(j+2)=='e')
                            {
                                count++;
                            } 
                        }
                        
                    }
                    else if(s.charAt(j)=='e')
                    {
                        if(s.charAt(j+1)=='h')
                        {
                            if(s.charAt(j+2)=='c')
                            {
                                count++;
                            } 
                        }
                        else if(s.charAt(j+1)=='c')
                        {
                            if(s.charAt(j+2)=='h')
                            {
                                count++;
                            } 
                        }
                        
                    }
                    else if(s.charAt(j)=='c')
                    {
                        if(s.charAt(j+1)=='h')
                        {
                            if(s.charAt(j+2)=='e')
                            {
                                count++;
                            } 
                        }
                        if(s.charAt(j+1)=='e')
                        {
                            if(s.charAt(j+2)=='h')
                            {
                                count++;
                            } 
                        }
                        
                    }
                    else
                        break;
                }
            } 
            
            ///////////////////////////////////////////////////
        }
        if(count>0)
            System.out.println("lovely "+count);
        else
            System.out.println("normal");
    }
    }
}
