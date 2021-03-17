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
		    
		    
		     int frogs = sc.nextInt();
		     
		     Dictionary d = new Hashtable();
		     
		     int w[] = new int[frogs];
		     int l[] = new int[frogs];
		     
		     for(int i = 1; i<=frogs; i++){
		         
		           w[i-1] = sc.nextInt();
		           
		           d.put(w[i-1],i);
		         
		     }
		     for(int i = 0; i<frogs; i++){
		         
		         l[i]  = sc.nextInt();
		         
		     }
		     Arrays.sort(w);
		     int hit = 0;
		     
		     int len = (int)d.get(w[0]);
		     
		     for(int i = 1; i<frogs; i++){
		           
		            int currloc = (int)d.get(w[i]);
		           
		            
		         if(currloc<=len){
		             
		          //   int loc = l[(int)d.get(w[i-1])-1];
		             int mul = l[(int)d.get(w[i])-1];
		             
		             
		             while(currloc<=len){
		                 currloc += mul;
		                 hit+=1;
		             }
		             
		         }
		         len = currloc;
		     }
		     System.out.println(hit);
		}
	    
	}
}
