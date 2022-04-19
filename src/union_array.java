//Given two arrays a[] and b[] of size n and m respectively. The task is to find union between these two arrays.
//
//Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.
//
//Example 1:
//
//Input:
//5 3
//1 2 3 4 5
//1 2 3
//Output: 
//5
//Explanation: 
//1, 2, 3, 4 and 5 are the
//elements which comes in the union set
//of both arrays. So count is 5.

import java.util.Scanner;

public class union_array {
	
	public static void union(int[] arr ,int n, int[] arr2, int m)
	{
		int count =0;
		for(int a=0; a<n; a++)
		{
			for(int b=0;b<m;b++)
			{
				if(arr[a] == arr2[b])
				{
					count ++;
				}
			}
		}
		System.out.println(n+m-count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Take INPUT
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		int[] arr;
		arr = new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		//Take INPUT
		System.out.println("Enter m:");
		int m = sc.nextInt();
		int[] arr2;
		arr2 = new int [m];
		for(int i=0;i<m;i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		
		union(arr,n,arr2,m);
		

	}

}
