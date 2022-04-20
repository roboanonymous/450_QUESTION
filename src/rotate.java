import java.util.Scanner;

public class rotate {
	public static void rotate_array(int[] arr, int n)
	{
		int temp=arr[0];
		for(int i=0; i<n-1;i++)
		{
		    int temp2 = arr[i+1];
			arr[i+1] = temp;
			 temp = temp2;
		}
		arr[0] = temp;
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
				
				rotate_array(arr,n);
				
				// Give OUTPUT
				for(int k=0;k<n;k++)
				{
					System.out.println(arr[k]);
				}

	}

}
