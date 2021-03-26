/* package codechef; // don't place package name! */
//https://www.codechef.com/FEB21C/problems/TEAMNAME

import java.util.*;
import java.lang.*;
import java.io.*;


	/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int t  = Integer.parseInt(bf.readLine());
		
		while(t-->0){
		    
		    int w = Integer.parseInt(bf.readLine());

		    String[] s = new String[w];
		    
		    s = bf.readLine().split(" ");
            
   		   Map<String,String> map = new HashMap<>();

           for(String word: s){
               String sub = word.substring(1);
               if(map.containsKey(sub)){
                   map.put(sub,map.get(sub)+word.substring(0,1));
               }
               else{
                   map.put(sub,word.substring(0,1));
               }
           }

           ArrayList<String> val = new ArrayList<String>(map.values());
           int l = val.size();
           
           int ans = 0;
           
           for(int i = 0; i<l-1; i++){
               
               for(int j = i+1; j<l; j++){
                   
                   int len1 = val.get(i).length();
                   int len2 = val.get(j).length();
                   
                   int comman = findComman(val.get(i),val.get(j));
                   
                    ans+= (len1-comman)*(len2-comman)*2;  
                   
               }
           }
            System.out.println(ans);
		}
	}
	
    public static int findComman(String i, String j){
        int comman=0;
        int[] visited = new int[j.length()];
        for(int w=0; w<i.length(); w++ ){
            
            for(int k = 0; k<j.length(); k++){
                
                if(i.charAt(w)==j.charAt(k) && visited[k]!=1) {
                    comman+=1;
                    visited[k]=1;
                    continue;
                    
                }
            }
        }
        return comman;
    }
}
    








