
package prac2;
import java.util.Scanner;
import java.util.Arrays;


public class sort {
    
private static void mostFreq3(int a[], int n, int b[])
{
  Arrays.sort(a);
  int j,k;
  int count=0;
  for(j=1;j<n;j++)
  {
      for(k=1;k<n;k++)
      {
          a[j]=a[k];
                  count++; 
      }
     
  }System.out.println(count);
}

public static void main(String[] args) {
	int n;
	int b[] = new int[3];
	int i=0;

	Scanner scan = new Scanner(System.in);
	n = scan.nextInt();
	int a[] = new int[n];
	for(i=0;i<n;i++) 
		a[i] = scan.nextInt();

	mostFreq3(a,n,b);

	for(i=0;i<3;i++)
		System.out.print(b[i] + " ");
}
}
