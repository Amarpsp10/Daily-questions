//https://www.codechef.com/APRIL21C/problems/SDICE

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0){
		    long n = Long.parseLong(br.readLine());
		    
		    long e =  n%4;
		    long f = (long) Math.ceil( ((double)n)/4.0);
		    long sum = 44*(f-1);
		    long e1 = f==1 ? 0:e;
		    sum = sum+(getValue(e))+((4-e1)%4)*4;
		    System.out.println(sum);
		}
	}
	
	public static int getValue(long e){
	         if(e==1) return 20;
		    if(e==2) return 36;
		    if(e==3) return 51;
		    return 60;
	}
}
