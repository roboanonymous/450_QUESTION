import java.util.*;

public class chocolate_distribution {
	
	public static int choc_dist(int[] arr, int n, int m)
	{
		if (m == 0 || n == 0)
		{
			return 0;
		}
		
		Arrays.sort(arr);
		
		if (n < m)
		{
			return -1;
		}
		
		int min_diff = Integer.MAX_VALUE;
		
		for (int i = 0; i + m - 1 < n; i++)
        {
            int diff = arr[i+m-1] - arr[i];
            if (diff < min_diff)
                min_diff = diff;
        }
        return min_diff;
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
		
		int t = choc_dist(arr,n,k);

	}

}
