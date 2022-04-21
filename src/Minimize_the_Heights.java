import java.util.Scanner;

public class Minimize_the_Heights {
	public static void min_height(int[] arr, int n , int k)
	{
		int small =arr[0], large = arr[0] ,diff;
		int small1 = 999999999, small2 = arr[0];
		
		for(int j=0 ;j<n; j++)
		{
			if(large<arr[j])
			{
				large = arr[j];
			}
			
			else {
				large = large;
			}
			
			if(arr[j]> k)
			{
				if(small1 >arr[j])
				{
					small1 = arr[j];
				}
				
				else {
					small1 = small1;
				}
				
			}
			
			else
			{
				if(small2 > arr[j])
				{
					small2 = arr[j];
				}
				
				else {
					small2 = small2;
				}
				
			}
		}
		
		int a = small1 - 3;
		int b = small2 +3;
		if(a>=b)
		{
			small = b;
		}
		else
		{
			small = a;
		}
		diff = large+3-small;
		System.out.println(large);
		System.out.println(small);
		System.out.println(diff);
		
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
				
				System.out.println("Enter k:");
				int k = sc.nextInt();
				
				min_height(arr,n,k);
	}

}
