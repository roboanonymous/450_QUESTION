import java.util.Scanner;

public class THREE_WAY {
	
	public static void three_way(int[] arr, int n, int a , int b)
	{
		int low = 0 , mid = 0, high = n-1;
		while(mid<high)
		{
			if(arr[mid] < a)
			{
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				
				mid++;
				low++;
			}
			
			if(arr[mid]  > b )
			{
				int temp = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp;
				
				mid++ ; 
				high--;
			}
			
			else
			{
				mid++;
			}
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
		
		
		System.out.println("Enter a:");
		int a = sc.nextInt();
		System.out.println("Enter b:");
		int b = sc.nextInt();
		
		three_way(arr,n, a ,b);
		
		for(int k=0;k<n;k++)
		{
			System.out.println(arr[k]);
		}

	}

}
