//https://www.codechef.com/JAN21C/problems/DECODEIT

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
	public static void main (String[] args) throws java.lang.Exception
	{
		char[] a = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'};
        
        
        int cases = Integer.parseInt(br.readLine());
        
        for(int i =0; i<cases; i++){
            long l = Long.parseLong(br.readLine());
            String bit = br.readLine();
            long loop = l/4;
            int  range = 0;
            
            for(int j  = 0; j<loop ; j++){
                
                String sub = bit.substring(range, range+4);
               
                int decimal = Integer.parseInt(sub,2);
               
                System.out.print(a[decimal]);
                
                range +=4;
            }
            System.out.println();
	}
}
}
