import java.util.*;

public class search_diff_by_k {
	
	public static void diff(int[] arr,int n, int x, int k)
	{
		int i=0;
		while(i<n)
		{
			if (arr[i] == x)
			{
				System.out.println("Number is present at " + i );
			}
			
			i = i + Math.max(1, Math.abs( (arr[i] - x)/k));
		}
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
		
		System.out.println("Enter x:");
		int x = sc.nextInt();
		System.out.println("Enter k:");
		int k = sc.nextInt();
		
		diff(arr,n, x , k);
		
		

	}

}
