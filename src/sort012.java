import java.util.*;
public class sort012 {
	
	public static int[] sort012(int[] arr, int n)
	{
		int zero =0,one =0,two =0;
		for(int j=0;j<n;j++)
		{
			if(arr[j] == 0)
			{
				zero++;
			}
			else if (arr[j] == 1)
			{
				one++;
			}
			else
			{
				two++;
			}	
		}
		
		for(int a=0;a<zero;a++)
		{
			arr[a] = 0;
		}
		for(int b=zero;b<zero+one;b++)
		{
			arr[b] = 1;
		}
		for(int c=zero+one;c<n;c++)
		{
			arr[c] = 2;
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
		
		sort012(arr,n);
		
		// Give OUTPUT
		for(int k=0;k<n;k++)
		{
			System.out.println(arr[k]);
		}
		

	}

}
