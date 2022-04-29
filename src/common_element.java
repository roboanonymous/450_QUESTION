import java.util.*;

public class common_element {
	
	public static void common_element(int[] A, int[] B,int[] C,int n1,int n2, int n3)
	{
		ArrayList<Integer> al = new ArrayList<>();
		HashSet <Integer> hs = new HashSet <> ();
		for(int j=0; j<n1; j++)
		{
			hs.add(A[j]);
		}
		
		HashSet <Integer> hs2 = new HashSet <> ();
		for(int j=0; j<n2; j++)
		{
			hs2.add(B[j]);
		}
		
		for(int t=0; t<n3; t++)
		{
			if(hs.contains(C[t]) && hs2.contains(C[t]))
			{
				al.add(C[t]);
			}
		}
		
		System.out.println(al);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1:");
		int n1 = sc.nextInt();
		int[] A;
		A = new int [n1];
		for(int i=0;i<n1;i++)
		{
			A[i] = sc.nextInt();
		}
		
		System.out.println("Enter n2:");
		int n2 = sc.nextInt();
		int[] B;
		B = new int [n2];
		for(int i=0;i<n2;i++)
		{
			B[i] = sc.nextInt();
		}
	
		System.out.println("Enter n3:");
		int n3 = sc.nextInt();
		int[] C;
		C = new int [n3];
		for(int i=0;i<n3;i++)
		{
			C[i] = sc.nextInt();
		}
		
		
		common_element(A,B,C,n1,n2,n3);

	}

}
