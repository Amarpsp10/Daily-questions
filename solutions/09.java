//https://www.codechef.com/APRIL21C/problems/SSCRIPT

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int t = Integer.parseInt(br.readLine());
	     while(t-->0){
	       
	        String[] b = br.readLine().split(" ");
	        int n = Integer.parseInt(b[0]);
	        int k = Integer.parseInt(b[1]);
	        String s = br.readLine();
	         
	         if(k>n){
	             System.out.println("NO");
	             continue;
	         }
	         String a = "*" + String.join("", Collections.nCopies(k-1, "*"));
	         if(finding(s,a,n,k)){
	             System.out.println("YES");
	         }
	         else{
	             System.out.println("NO");
	         }
	     }
	}
	public static boolean finding(String s, String a,int n , int k){
	    int i = 0;
	    int j = n-k;
	    while(j-k+1>=i){
	         
	         if(s.substring(i,i+k).equals(a)){
	             return true;
	         }
	         if(s.substring(j,j+k).equals(a)){
	             return true;
	         }
	         i++;
	         j--;
	    }
	    
	    return false;
	}
}
