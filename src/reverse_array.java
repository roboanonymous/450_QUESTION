//Write a code to reverse array

import java.util.*;

public class reverse_array {
	
	public static int[] reverse(int[] arr, int n)
	{
		
		for(int j=0;j<n/2;j++)
		{
		 int temp=0;
			temp = arr[j];
			arr[j] = arr[n-j-1];
			arr[n-j-1] = temp;
			
		}
		return arr;

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
		
		reverse (arr,n);
		
		for(int k=0;k<n;k++)
		{
			System.out.println(arr[k]);
		}
		
	}

}

// Swap number from first and last
