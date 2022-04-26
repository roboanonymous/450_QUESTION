import java.util.*;
import java.lang.*;
import java.io.*;
public class median {
	public static void main(String[] args) throws IOException
	 {
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     int T = Integer.parseInt(br.readLine().trim());
	     while(T-->0)
	     {
	         int n = Integer.parseInt(br.readLine().trim());
	         String s = br.readLine();
	         String[] S = s.split(" ");
	         int[] v  = new int[n];
	         for(int  i = 0; i < n; i++)
	             v[i] = Integer.parseInt(S[i]);
	         Solution ob = new Solution();
	         int ans = ob.find_median(v);
	         System.out.println(ans);
	     }
	 }

}
//{ Driver Code Starts
//Initial Template for Java


//User function Template for Java

class Solution
{
 public int find_median(int[] v)
 {
     // Code here
     int m;
     int n = v.length;
     Arrays.sort(v);
     if(n%2 == 0)
     {
        int b =  v[n/2]+v[(n/2)-1];
        m = b/2;
     }
     
     else
     {
         m = v[(n/2)];
     }
     
     return m;
 }
}