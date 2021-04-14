//https://www.codechef.com/APRIL21C/problems/KAVGMAT
import java.io.*;
import java.util.*;
import java.io.*;

class Codechef {

	public static void main(String[] args) {
        FastScanner in = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt(), tt = 0;
        while(t-->0) { 
            n = in.nextInt(); m = in.nextInt(); long k = in.nextInt();
            long a[][] = new long[n][m];
            long ans = 0;
            for(int i=0;i<n;i++){
            	for(int j=0;j<m;j++){
            		a[i][j] = in.nextInt();
            		a[i][j] -= k;
            		if(a[i][j]>=0) ans++;
            		//out.print(a[i][j]+" ");
            	}
            	//out.println();
            }
            dp = new long[n][m];
            for(int i=0;i<n;i++){
            	for(int j=0;j<m;j++){
            		dp[i][j] = a[i][j];                  
            		if(i-1>-1) dp[i][j] += dp[i-1][j];
            		if(j-1>-1) dp[i][j] += dp[i][j-1];
            		if(i-1>-1&&j-1>-1) dp[i][j] -= dp[i-1][j-1]; 
            	}
            }
            long cnt = 0;
            for(int i=0;i<n;i++){
            	for(int j=0;j<m;j++){
            		int low = 1, mid, high = Math.min(n-1-i,m-1-j);
            		int last = high;
            		while(low<=high){
            			mid = (low+high)/2;
            			if(getSum(i,j,i+mid,j+mid)<0){
            				low = mid+1;		
            			}
            			else high = mid-1;
            		}
            		ans += (last-low+1);
            	}	
            }
            //out.println(getSum(0,0,1,1)+" "+dp[1][1]);                            
            out.println(cnt+ans);
    		tt++;
    		//out.println("Case #"+tt+": "+ans);
        }
        out.flush();
	}

	static long dp[][];
	static int n, m;

	static long getSum(int i, int j, int p, int q){
		long sum = dp[p][q];
		if(i-1>-1) sum -= dp[i-1][q];
		if(j-1>-1) sum -= dp[p][j-1];
		if(i-1>-1&&j-1>-1) sum += dp[i-1][j-1];
		return sum;
	}
	
	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		
		String next() {
			while(!st.hasMoreTokens())
				try { st = new StringTokenizer(br.readLine()); }
				catch(IOException e) {}
			return st.nextToken();
		}
		
		String nextLine(){
			try{ return br.readLine(); } 
			catch(IOException e) { } return "";
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
		
		int[] readArray(int n) {
			int a[] = new int[n];
			for(int i=0;i<n;i++) a[i] = nextInt();
			return a;
		}
	}

	static final Random random = new Random();

	static void ruffleSort(int[] a){
		int n = a.length;
		for(int i=0;i<n;i++){
			int j = random.nextInt(n), temp = a[j];
			a[j] = a[i]; a[i] = temp;
		}
		Arrays.sort(a); 	
	}
}
