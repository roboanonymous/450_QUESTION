import java.util.*;

public class Minimum_jumps {
	
	public static int jump(int[] arr, int n)
	{
		int count = 0, x=1;
		
	 while(n>x)
		{ 
		 int large = 0, value =0;
		 if(arr[x] == 0)
		 {
			 return Integer.MAX_VALUE;
		 }
		 
		 else
		 {
			 int t = Math.min(n,x+arr[x-1]);
		 for(int j=x; j< t; j++)
		 {
			 if(large > arr[j] )
			 {
				 large = arr[j];
				 value = j;
			 }
		 }
		 
		 x = x + arr[value];
		 System.out.println(x);
		 count ++;
		 
		 }
		}
	 
		return count;
		
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
				
				int f = jump(arr,n);
				System.out.println(f);

	}

}
