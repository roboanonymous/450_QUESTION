//Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.
//
//Example 1:
//
//Input:
//N = 6
//arr[] = 7 10 4 3 20 15
//K = 3
//Output : 7
//Explanation :
//3rd smallest element in the given 
//array is 7.


import java.util.Arrays;
import java.util.Scanner;

public class k_smallest {
	
	public static int small (int[] arr, int n, int k) {
		int a;
		Arrays.sort(arr);
		a = arr[k-1];
		return a;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		System.out.println("Enter k:");
		int k = sc.nextInt();
		int[] arr;
		arr = new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int m = small(arr,n,k);
		System.out.println(m);
				
	}
	
	

}
