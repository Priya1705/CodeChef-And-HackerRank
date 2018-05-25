import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MultipleOfTwo{

private static int myinput = 
57;

int check(int n)
      {
      int m=n;
      int i,r;
      int count=0;
      while(n>0)
      {
          r=n%10;
          n=n/10;
          
          if(m%r==0)
          {
           count++;
          }
      }
      
      if(count>=2)
      {
          return 1;
      }
      else
      {
          return 0;
      }
    }
    
    
    public static void main(String[] args) {
      
     MultipleOfTwo obj=new MultipleOfTwo(); 
   
      System.out.println(obj.check(23));
}}
