/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// reverse a array by recursion
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
	    int a[] = new int[n];
	    
	    for(int i = 0; i<n; i++) 
	     a[i] = sc.nextInt();
	    
	    reverse(a, 0, n-1);
	    
	    for(int i = 0; i<n; i++) 
	     System.out.println(a[i]);
	}
	
	public static void reverse(int a[],int i,int j){
	    
	    if(i>=j)
	    return;
	    //swap
	    int temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
	    
	    reverse(a, i+1, j-1);
	}
   
}
