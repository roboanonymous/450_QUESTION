import java.util.Scanner;
import java.util.*;

public class unionarray2 {
	
	public static void union2(int[] arr ,int n, int[] arr2, int m)
	{
		int i;
		HashSet <Integer> s = new HashSet<>();
		for(i=0;i<n;i++)
		{
			s.add(arr[i]);
		}
		
		for(i=0;i<m;i++)
		{
			s.add(arr2[i]);
		}
		
		System.out.println(s.size());
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
				
				//Take INPUT
				System.out.println("Enter m:");
				int m = sc.nextInt();
				int[] arr2;
				arr2 = new int [m];
				for(int i=0;i<m;i++)
				{
					arr2[i] = sc.nextInt();
				}
				
				
				union2(arr,n,arr2,m);


	}

}
