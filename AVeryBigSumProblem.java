//wrong answer

package prac2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AVeryBigSumProblem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //long[] arr = new long[n];
        double[] arr = new double[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
            sum+=arr[i];System.out.println("sum at "+i+ " is "+sum);
        }
        System.out.println(sum);
        
    }
}
