import java.util.*;

public class Merge_array {
	
	public static void merge_array(int[] arr , int n, int[] arr2, int m )
	{
		int i1=0,i2=0;
		while(i1<n)
		{
			if(arr[i1]>arr2[i2])
			{
				int temp = arr[i1];
				arr[i1] = arr2[i2];
				arr2[i2] = temp;
				Arrays.sort(arr2);
			}
			
			i1++;
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Take INPUT
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
		
		for(int k=0;k<n;k++)
		{
			System.out.println(arr[k]);
		}
		for(int k=0;k<m;k++)
		{
			System.out.println(arr2[k]);
		}


	}

}
