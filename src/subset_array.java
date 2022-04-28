import java.util.*;

public class subset_array {
	
	public static void sub_array(int[] arr, int[] arr2, int n, int m)
	{
		HashSet <Integer> hs = new HashSet <> ();
		for(int j=0; j<n; j++)
		{
			hs.add(arr[j]);
		}
		
		for(int a=0;a<m; a++)
		{
			if(! hs.contains(arr2[a]))
			{
				System.out.print(false);
			}
			
		}
		System.out.print(true);
		
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

		
		System.out.println("Enter m:");
		int m = sc.nextInt();
		int[] arr2;
		arr2 = new int [m];
		for(int i=0;i<m;i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		sub_array(arr, arr2, n, m);

	}

}
