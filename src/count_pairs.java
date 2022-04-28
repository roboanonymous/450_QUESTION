import java.util.*;

public class count_pairs {
	
	public static void count_pair(int[] arr, int n, int k)
	{
		int count = 0;
		HashMap <Integer, Integer> hm = new HashMap<>();
		for(int j=0; j<n; j++)
		{
			if (hm.containsKey(k-arr[j]))
			{
				int ki = hm.get(k-arr[j]);
				count = count+ki;
				System.out.println(arr[j]+ " " + ki +" " +count);
			}
			
			if (hm.containsKey(arr[j]))
			{
				int old = hm.get(arr[j]);
				int ne = old+1;
				hm.put(arr[j], ne);
			}
			else
			{
				hm.put(arr[j], 1);
			}
			
			
			
		}
		
		
		System.out.println(count);
		
		
		
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
		
		
		count_pair(arr,n,k);

	}

}
