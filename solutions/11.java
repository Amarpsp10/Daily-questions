/* package codechef; // don't place package name! */

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
	   while(t-->0){
	       int n = sc.nextInt();
	       int m = sc.nextInt();
	       int k = sc.nextInt();
	       int count = 0;
	       int a[][] = new int[n][m];
	       long asum[][] = new long[n][m];
	       
	       for(int i = 0; i<n; i++){
	           for(int j = 0; j<m; j++){
	               a[i][j] = sc.nextInt();
	               
	               asum[i][j] = a[i][j];
	               if(j>0) asum[i][j]+= asum[i][j-1];
	               if(i>0) asum[i][j]+= asum[i-1][j];
	               if(i>0&&j>0) asum[i][j]-= asum[i-1][j-1];
	               
	               if(a[i][j]>=k) count+=1;
	           }
	       }
	  
           
	       int l = 2;
	       
	       while(l<=n){
	           count += findCount(asum,n,m,k,l);
	           l++;
	       }
	       System.out.println(count);
	   }
	}
	public static int findCount(long[][] asum, int n, int m, int k, int l){
	         int count = 0;
	         for(int i = 0; i<=n-l; i++){
	             for(int j = 0; j<=m-l; j++){
	                 long sum = asum[i+l-1][j+l-1];
	                 if(i>0) sum -= asum[i-1][j+l-1];
	                 if(j>0) sum -= asum[i+l-1][j-1];
	                 if(i>0 && j>0) sum += asum[i-1][j-1];
	                 if(sum/(l*l)>=k) count +=1;
	             }
	         }
	        
	         return count;
	}
}
