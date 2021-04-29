//https://www.codechef.com/APRIL21C/problems/KAVGMAT
import java.lang.*;
import java.io.*;
import java.util.*;
public class Main {
    public static PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) {
		InputReader in = new InputReader(System.in);
	int t = in.nextInt();
        while (t-- > 0) {
            long n = in.nextLong();
            long m = in.nextLong();
            long k = in.nextLong();
            long[][] arr = new long[(int) n+1][(int) m+1];
            for (long i = 0; i <= n; i++) {
                for (long j = 0; j <= m; j++) {
                    if(i==0||j==0)
                        arr[(int)i][(int)j]=0;
                    else
                    arr[(int) i][(int) j] = in.nextLong();
                }
            }
           out.print(CountSubMatrix(arr, n, m, k)+"\n");
            out.flush();
        }	
	}
	public static long CountSubMatrix(long[][] arr, long n, long m, long k) {
        for (long i = 1; i <= n; i++) {
            for (long j = 1; j <= m; j++)
                arr[(int) i][(int) j] += arr[(int)i-1][(int)j]+arr[(int)i][(int)j-1]-arr[(int)i-1][(int)j-1];
        }
        long c=0;
        for(long size=1;size<=n;size++){
            for(long i=1;i<=n-size+1;i++){
                long l=1;
                long h=m-size+1;
                long mid;
                long p=0;
                long flag=0;
                while(l<=h){
                    mid=(h+l)/2;
                    long sum=arr[(int)(i+size-1)][(int)(mid+size-1)]-arr[(int)(i+size-1)][(int)mid-1]-arr[(int)i-1][(int)(mid+size-1)]+arr[(int)(i-1)][(int)(mid-1)];
                       if(sum>=k*size*size) {
                           h=mid-1;
                           p=mid;
                           flag=1;
                       }
                       else
                           l=mid+1;
                }
                if(flag==1)
                    c=c+(m-size-p+2);
            }
        }
        return c;
      }
	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
				    tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
				    throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() { 
       return Long.parseLong(next());
      }
        public double nextDouble(){
      return Double.parseDouble(next()); 
         }
        public  String nextLine(){
           String str = ""; 
           try { 
          str = reader.readLine(); 
            } 
        catch (IOException e) {
            e.printStackTrace(); 
             }
         return str; 
          }
	}
}
