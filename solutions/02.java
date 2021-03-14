//https://www.codechef.com/JAN21C/problems/DIVTHREE

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    private static Scanner sc = new Scanner(System.in);
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    int cases = sc.nextInt();
	    
	    for (int i = 0; i<cases ; i++ ){
	        
	        int setter = sc.nextInt();
	        Long prob = sc.nextLong();
	        Long days = sc.nextLong();
	        
	        Long totalP = new Long(0);
	        
	        for(int j = 0; j<setter; j++ ){
	            totalP += sc.nextLong();
	        }
	        
	        Long realDays = totalP/prob;
	       // System.out.println("debug :"+totalP);
	        if(realDays<days){
	            System.out.println(realDays);
	        }
	        else{
	            System.out.println(days);
	        }
	        
	    } 
	   
	}
}
