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
