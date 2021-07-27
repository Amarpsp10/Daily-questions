
// SOLUTION NO. 1 on CODECHEF

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef {

	
	static void sort(int a[], int arr_size)
	{
		int lo = 0;
		int hi = arr_size - 1;
		int mid = 0, temp = 0;
		while (mid <= hi) {
			switch (a[mid]) {
			case 0: {
				temp = a[lo];
				a[lo] = a[mid];
				a[mid] = temp;
				lo++;
				mid++;
				break;
			}
			case 1:
				mid++;
				break;
			case 2: {
				temp = a[mid];
				a[mid] = a[hi];
				a[hi] = temp;
				hi--;
				break;
			}
			}
		}
               for (int i = 0; i < arr_size; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
		int a[] = new int[n];
                for(int i = 0; i<n; i++){
		    a[i] = sc.nextInt();
		}
		sort(arr, n);
	}
}


// SOLUTION NO.2 ON GFG

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
     int i = 0;
     int j = 0;
     int k = 0;
     for(int p = 0; p<n;p++){
         if(a[p]==0) i++;
         else if(a[p]==1) j++;
         else k++;
     }
     for(int p = 0; p<n;p++){
         if(p<i){
             a[p] = 0;
         }
         else if(i<=p && p<j+i){
             a[p] = 1;
         }
         else{
             a[p] = 2;
         }
     }
    }
}

// { Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

SOLUTION NO.3 ON GFG WITH PRIORITY QUEUE

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      for(int e : a) pq.add(e);
      for(int i=0; i<a.length; i++){
          a[i] = pq.poll();
      }
    }
}

// { Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}




