import java.util.Scanner;

public class median_matrix {
	
	public static void median_matrix(int [][] matrix , int rows, int column)
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows:");
		int rows = sc.nextInt();
		System.out.println("Enter column:");
		int column = sc.nextInt();
		
		int [][] matrix = new int [rows][column];
		
		for (int i= 0; i<rows; i++)
		{
			for(int j = 0; j<column; j++)
			{
				matrix[i][j] = sc.nextInt();	
			}
		}
		
		median_matrix(matrix , rows, column);

	}

}
