//////incomplete
package prac2;
import java.util.Scanner;

public class FriendsAndGeometry {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        double a,b,c,A,B,C,u,v,w;
        
        //angle input
        a=in.nextInt();
        b=in.nextInt();
        c=360-a-b;
        System.out.println("a,b and c are: "+a+b+c);
        
        
//        A=(int) (B*(Math.sin (b)/Math.sin (c)));
//        B=(int) (C*(Math.sin (c)/Math.sin (a)));
//        C=(int) (A*(Math.sin (b)/Math.sin (a)));
        System.out.println("u/v: "+(a/b));
        System.out.println("v/w: "+(b/c));
        
        
    }
}
