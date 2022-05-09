import java.util.*;

public class common_matrix {
	
	public static void common_matrix1(int [][] matrix,int rows,int column)
	{
		HashMap <Integer, Integer> hm = new HashMap <>();
		for(int i=0; i<column; i++)
		{
			hm.put(matrix[0][i], 1);
		}
		
		for(int i=1; i<rows; i++ )
		{
			for(int j=0; j< column; j++)
			{
				if (hm.get(matrix[i][j]) != null && hm.get(matrix[i][j]) == i)
				{
					hm.put(matrix[i][j], i+1);
					
					
					if(i== column-1)
					{
						System.out.print(matrix[i][j] + " ");
					}
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
		
		common_matrix1(matrix, rows, column);

	}

}
