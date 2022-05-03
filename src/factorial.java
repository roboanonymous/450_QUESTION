import java.util.*;

public class factorial {
	public static void factorial(int n)
	{
		ArrayList <Integer> al = new ArrayList <>();
		int size=0 , carry =0;
		al.add(0,1);
		size=1;
		int val = 2;
		while (val <= n)
		{
			for(int j =size-1; j>=0; j--)
			{
				int temp = al.get(j) *val +carry;
				al.set(j,temp%10);
				carry = temp/10;
			}
			
			while(carry != 0)
			{
				al.add(0,carry%10);
				carry = carry/10;
				size++;
			}
			val++;
		}
		
		System.out.print(al);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		
		factorial(n);

	}

}
