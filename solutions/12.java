//https://www.codechef.com/APRIL21C/problems/MEXSTR

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
	       //  char[] s = br.readLine().split("");
	         ArrayList<String> sa = new ArrayList<String>(Arrays.asList(br.readLine().split("")));
	         int ans = 0;
	         int i = 0;
	         while(true){
	             if(!findSub(i,sa)){
	                 ans = i;
	                 break;
	             }
	             i++;
	         }
	         
	         System.out.println(Integer.toBinaryString(ans));
		}
	}
	
	public static boolean findSub(int i, ArrayList<String> sa){
	    String is = Integer.toBinaryString(i);
	    int sp = 0;
	    for(int j =0; j<is.length(); j++){
	        
	        if(sp<sa.size()){
	        int p = sa.subList(sp,sa.size()).indexOf(String.valueOf(is.charAt(j)));
	        if(p==-1) return false;
	        sp = sp+p+1;
	        }
	        else{
	            return false;
	        }
	        
	    }
	    return true;
	    
	}
	
}
