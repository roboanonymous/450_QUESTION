import java.util.*;

public class spiral_matrix {
	
	public static void spiral_matrix(int [][] matrix, int rows, int column)
	{
		List<Integer> ans = new ArrayList<Integer>();
		int top=0, down=rows-1, left=0, right= column-1;
		int dir = 0;
		while(top <= down && left<=right)
		{
			if(dir == 0)
			{
				for(int i=left ;i<=right; i++)
				{
					ans.add(matrix[top][i]);
				}
				
				top++;
			}
			else if(dir == 1)
			{
				for(int i=top ;i<=down; i++)
				{
					ans.add(matrix[i][right]);
				}
				
				right--;
			}
			
			else if(dir == 2)
			{
				for(int i=right ;i>=left; i--)
				{
					ans.add(matrix[down][i]);
				}
				
				down--;
			}
			else if(dir == 3)
			{
				for(int i=down ;i>=top; i--)
				{
					ans.add(matrix[i][left]);
					
				}
				left++;
			}
			
			dir = (dir+1)%4;
		}
		
		System.out.print(ans);
		
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
		
		spiral_matrix(matrix, rows, column);

	}

}
