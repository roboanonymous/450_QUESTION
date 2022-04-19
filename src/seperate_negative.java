import java.util.Scanner;

public class seperate_negative {
	public static int[] seprate_negative(int[] arr, int n)
	{
		int neg=0,mid=0;
		while(mid<=n-1)
		{
			if(arr[mid]<0)
			{
				int temp = arr[neg];
				arr[neg] = arr[mid];
				arr[mid] = temp;
				
				mid++;
				neg++;
			}
			else
			{
				mid++;
			}
		}
		return arr;
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
		
		seprate_negative(arr,n);
		
		// Give OUTPUT
		for(int k=0;k<n;k++)
		{
			System.out.println(arr[k]);
		}
		

	}


}
