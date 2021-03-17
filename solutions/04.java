import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	      Scanner sc = new Scanner(System.in);
	      
	      int t = sc.nextInt();
	      
	      for(int i = 0; i<t; i++){
	          
	          int n = sc.nextInt();
	          
	          long[] a = new long[n];
	          
	   
	          for(int j = 0; j<n; j++){
	             
	             a[j] = sc.nextLong();
	          }
	          
	          Arrays.sort(a);
	          
	          System.out.println(2*(a[n-1]-a[0]));
	         
	      }
	}
	
	

}

