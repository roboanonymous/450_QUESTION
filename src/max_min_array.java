// Find maximum and minimum of array

import java.util.*;
public class max_min_array {
	public static void max(int[] arr,int n)
	{
		int a;
		a = arr[0];
		for(int j=0;j<n;j++)
		{
			if(a<arr[j])
			{
				a = arr[j];
			}
		}
		System.out.println(a);
	}
	
	public static void min(int[] arr,int n)
	{
		int b;
		b = arr[0];
		for(int j=0;j<n;j++)
		{
			if(b>arr[j])
			{
				b = arr[j];
			}
		}
		
		System.out.println(b);
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
		
		 max(arr,n);
		 min(arr,n);
		
		
		

	}

}
