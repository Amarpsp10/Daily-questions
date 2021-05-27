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

