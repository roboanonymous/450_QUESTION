import java.util.*;

public class Minimize_the_Heights {
	public static void min_height(int[] arr, int n , int k)
	{
		Arrays.sort(arr);
        int ans = (arr[n - 1] + k)- (arr[0] + k); // Maximum possible height difference
 
        int tempmax = arr[n - 1] - k; // Maximum element when we
                              // subtract k from whole array
        int tempmin = arr[0] + k; // Minimum element when we
                                  // add k to whole array
        int max, min;
 
        for (int i = 0; i < n - 1; i++) {
            if (tempmax > (arr[i] + k)) {
                max = tempmax;
            }
            else {
                max = arr[i] + k;
            }
 
            if (tempmin < (arr[i + 1] - k)) {
                min = tempmin;
            }
            else {
                min = arr[i + 1] - k;
            }
 
            if (ans > (max - min)) {
                ans = max - min;
            }
        }
       
		System.out.println(ans);
		
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
				
				System.out.println("Enter k:");
				int k = sc.nextInt();
				
				min_height(arr,n,k);
	}

}
