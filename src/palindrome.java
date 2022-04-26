import java.util.Scanner;

public class palindrome {
	public static void palindrome (int[] arr , int n)
	{
		int count =0;
		for(int j=0 ; j<n;j++)
		{
			 int r,sum=0,temp;  
			int x = arr[j];
			while(x>0)
			{
				 r = x % 10;
				 sum = sum*10 + r;
				x = x/10;
			}
			
			if(sum == arr[j])
			{
				count++ ;
				
			}
		}
		
		if(count == n)
		{
			System.out.println("Yes");
		}
		
		else
		{
			System.out.println("No");
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
				
				palindrome(arr,n);
	}

}
