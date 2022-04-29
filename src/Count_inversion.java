import java.util.HashSet;
import java.util.Scanner;

public class Count_inversion {
	
	public static void count_inversion(int[] arr, int n)
	{
		
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
		
		count_inversion(arr,n);
	}

}
