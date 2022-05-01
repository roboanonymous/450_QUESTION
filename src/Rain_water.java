import java.util.Scanner;

public class Rain_water {
	
	public static void rain_water(int[] arr ,int n)
	{
		  int left[]=new int[n];
	       int right[]=new int[n];
	       left[0]=arr[0];
	       for(int i=1;i<n;i++){
	           left[i]=Math.max(left[i-1],arr[i]);
	       }
	       right[n-1]=arr[n-1];
	       for(int i=n-2;i>=0;i--){
	           right[i]=Math.max(right[i+1],arr[i]);
	       }
	       long ans=0;
	       for(int i=0;i<n;i++){
	           ans+=(Math.min(left[i],right[i])-arr[i]);
	       }
	       
	       System.out.println(ans);
	       
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
		
		
		rain_water(arr , n);

	}

}
