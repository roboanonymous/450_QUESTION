import java.util.Scanner;

public class alternate_negative {

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
				
				
				for(int k=0;k<n;k++)
				{
					System.out.println(arr[k]);
				}

	}

}
