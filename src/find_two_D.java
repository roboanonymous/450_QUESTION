import java.util.Scanner;

public class find_two_D {
	
	public static void find_two_d(int [][] matrix, int rows, int column, int k)
	{
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<column; j++)
			{
				if(matrix[i][j] == k)
				{
					System.out.print("Row is " + (i+1) + " and column is " + (j+1));
				}
			}
		}
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
		
		System.out.println("Enter k:");
		int k = sc.nextInt();
		
		
		find_two_d(matrix, rows,  column, k);

	}

}