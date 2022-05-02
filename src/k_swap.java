import java.util.Scanner;

public class k_swap {
	
	public static void k_swap(int[] arr, int n, int k)
	{
		int count =0 , bad = 0;
		for(int j = 0; j<n; j++)
		{
			if(arr[j] <= k)
			{
				count++;
			}
		}
		
		System.out.print(count + "  ");
		
		for(int l=0; l<count; l++)
		{
			if(arr[l] > k)
			{
				bad++;
			}
		}
		
		int ans = bad;
		for(int a=0; a<n;a++)
		{
			for(int b=a; b<count; b++)
			{
				if(arr[b] > k)
				{
					bad++;
				}
			}
			ans = Math.min(bad,ans);
		}
		
		System.out.print(ans);
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
		
		System.out.println("Enter k:");
		int k = sc.nextInt();
		
		k_swap (arr,n, k);

	}

}
