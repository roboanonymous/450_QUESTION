//Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
//
//
//Example 1:
//
//Input:
//N = 5
//Arr[] = {1,2,3,-2,5}
//Output:
//9
//Explanation:
//Max subarray sum is 9
//of elements (1, 2, 3, -2, 5) which 
//is a contiguous subarray.
import java.util.Scanner;

public class Largest_sum_subarray {
	public static void large_sum(int[] arr ,int n)
	{ 
		int a,b,sum=0;
		int large = 0;
		int first =0, last = 0;
		for(a=0;a<n;a++)
		{ sum=0;
			for(b=a;b<n; b++)
			{
				sum  = sum + arr[b];
				if(sum>large)
				{
					large = sum;
					first =a;
					last=b;
				}
			}
		}
		
		System.out.println(first + " to " +last);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		int[] arr;
		arr = new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		large_sum(arr,n);
		

	}

}
