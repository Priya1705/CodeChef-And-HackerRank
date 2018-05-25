package prac2;

public class NewClass {


private static int num[] = {

0,0,0};
int triangleType(int a, int b, int c) {
  if(a != b && b != c)
    return 1;
  else if(a == b && a == c)
    return 3;
  else
    return 2;
}

public static void main(String [] args)
{
  NewClass ob=new NewClass();
  System.out.println(
          ob.triangleType(num[0],num[1],num[2])
  );

}}