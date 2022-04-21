import java.util.Scanner;

public class factorial {
	public static long factorial(int n)
	{
		if(n==0) {
			return 1;
		}
		else {
			return(n* factorial(n-1));
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		
		System.out.println (factorial(n));

	}

}
