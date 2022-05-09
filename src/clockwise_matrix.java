import java.util.Scanner;

public class clockwise_matrix {
	
	public static void clock_mat(int[][] matrix, int n, int m)
	{
		for(int i=0; i<n/2; i++)
		{
			for(int j =i; j<n-i-1; j++)
			{
				 int temp = matrix[i][j];
		            matrix[i][j] = matrix[n - 1 - j][i];
		            matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
		            matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
		            matrix[j][n - 1 - i] = temp;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int column = sc.nextInt();
		
		int [][] matrix = new int [rows][column];
		
		for (int i= 0; i<rows; i++)
		{
			for(int j = 0; j<column; j++)
			{
				matrix[i][j] = sc.nextInt();	
			}
		}
		
		clock_mat(matrix, rows, column);
		
		for(int i=0; i<rows; i++) {
	           for(int j=0; j<column; j++) {
	                   System.out.print(matrix[i][j]+" ");
	               }
	               System.out.println();
	           }
	   

	}

}
