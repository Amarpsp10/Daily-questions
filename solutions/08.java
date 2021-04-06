//https://www.codechef.com/APRIL21C/problems/BOLT

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
		    float v = 100/((sc.nextFloat())*(sc.nextFloat())*(sc.nextFloat())*(sc.nextFloat()));
		    v = (float)(Math.round(v * 100.0)) /(float) 100.0;
		   
		    if(v<=9.57){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
