import java.util.*;

public class Unsorted_median {
	
	public static void merge_array(int[] arr, int n, int[] arr2, int m)
	{
		int count;
	    int m1 = -1, m2 = -1;
		int a1=0, a2=0, med =0;
		for(count = 0;
	            count <= (n + m) / 2;
	            count++)
	        {
	            if (a1 != n && a2 != m)
	            {
	                m1 = (arr[a1] > arr2[a2]) ?
	                      arr2[a2++] : arr[a1++];
	            }
	            else if (a1 < n)
	            {
	                m1 = arr[a1++];
	            }
	             
	            // for case when j<m,
	            else
	            {
	                m1 = arr2[a2++];
	            }
	        }
		System.out.println(m1);
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
		
		merge_array(arr,n,arr2,m);


	}

}
