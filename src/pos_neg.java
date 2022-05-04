import java.util.Scanner;

public class pos_neg {
	
	public static void pos_neg(int[] arr, int n)
	{
		int pos=1, neg =0;
		
		for(int j=0 ; j<n; j++)
		{
			if(arr[j]<0)
			{
				int temp = arr[j];
				arr[j] = arr[neg];
				arr[neg] = temp;
				
				neg = neg+2;
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
		
		pos_neg(arr, n);
		
		for(int k=0;k<n;k++)
		{
			System.out.println(arr[k]);
		}

	}

}
