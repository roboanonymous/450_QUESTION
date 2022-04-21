import java.util.Scanner;

public class Minimum_jumps {
	
	public static int jump(int[] arr, int n)
	{
		int count = 0, x=1;
		
	 while(n>x)
		{ 
		 if(arr[x-1] == 0)
		 {
			 return Integer.MAX_VALUE;
		 }
		 else
		 {
			count ++;
			x= x+arr[x-1];			
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
