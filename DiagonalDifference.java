package prac2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,a[][],i,j,d1=0,d2=0;
        n=in.nextInt();
        a=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();
                if(i==j)
                {
                    d1+=a[i][j];
                }
            }
        }
        for(i=0;i<n;i++)
        {
            j=Math.abs(i-(n-1));
               d2+=a[i][j];     
        }
        System.out.println(Math.abs(d1-d2));
       
    }
}

