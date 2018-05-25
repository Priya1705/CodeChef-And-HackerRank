package prac2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExamRush {

    static int examRush(int[] tm, int t, int n) {
        int sum=0,i,count=0;
        for(i=0;i<n;i++)
        {
//            while(!(sum>t))
//            {
//                sum+=tm[i];
//                count++;
//            }
            if(!(sum>t))
            {
                sum+=tm[i];
                count++;
            }
        }
        return count-1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  //no of chapters
        int t = in.nextInt();  //total time
        int i;
        int[] tm = new int[n]; //time for chapter
        for(i = 0; i < n; i++){
            tm[i] = in.nextInt();  //array input
        }
        Arrays.sort(tm);
        
        int result = examRush(tm, t,n);
        System.out.println(result);
        in.close();
    }
}
