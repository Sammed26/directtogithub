import java.util.Scanner;



class Matrix
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);

		System.out.println("enter row number in your two matrices");
		int rows = scn.nextInt();
		System.out.println("enter column number in your two matrices");
		int columns = scn.nextInt();
		int [][] matrix1 = new int [rows][columns];

		//System.out.println("enter row number in your second matrix");
		//rowNo = scn.nextInt();
		//System.out.println("enter column number in your second matrix");
		//columnNo = scn.nextInt();

		int [][] matrix2 = new int [rows][columns];
		
		MatrixMethods mMethods = new MatrixMethods();

		//takeInput(matrix1, rows, columns);
		//takeInput(matrix1, rows, columns);
		
		System.out.println("enter first matrix");
		for(int i = 0; i<rows; i++)
		{
			for(int j = 0; j<columns; j++)
			{
				System.out.println("for " + i + " row " + j + " column");
				matrix1[i][j] = scn.nextInt();
			}
		}

		System.out.println("enter second matrix");
		for(int i = 0; i<rows; i++)
		{
			for(int j = 0; j<columns; j++)
			{
				System.out.println("for " + i + " row " + j + " column");
				matrix2[i][j] = scn.nextInt();
			}
		}
		
		mMethods.displayMatrix(matrix1, rows, columns);
		mMethods.displayMatrix(matrix2, rows, columns);
		
		mMethods.addMatrix(matrix1, matrix2, rows, columns);
		mMethods.subtractMatrix(matrix1, matrix2, rows, columns);
		mMethods.multiplicationMatrix(matrix1, matrix2, rows, columns);
	}
}


public class MatrixMethods
{
	
	void addMatrix(int [][] m1, int [][] m2, int rows, int columns)
	{
		int [][] result = new int [rows][columns];
		
		for(int i = 0; i<rows; i++)
		{
			for(int j = 0; j<columns; j++)
			{
				result[i][j] = m1[i][j] + m2[i][j];
			}
		}
		
		System.out.println("\nprinting sum of matrices");
		displayMatrix(result, rows, columns);
	}	
	

	void subtractMatrix(int [][] m1, int [][] m2, int rows, int columns)
	{
		int [][] result = new int [rows][columns];
		
		for(int i = 0; i<rows; i++)
		{
			for(int j = 0; j<columns; j++)
			{
				result[i][j] = m1[i][j] - m2[i][j];
			}
		}
		
		System.out.println("\nprinting subtraction of matrices");
		displayMatrix(result, rows, columns);
	}

	void multiplicationMatrix(int [][] m1, int [][] m2, int rows, int columns)
	{
		int [][] result = new int [rows][columns];
		for(int i = 0; i<rows; i++)
		{
			for(int j = 0; j<columns; j++)
			{
				for(int k = 0; k<rows; k++)
				{
					result[i][j] += (m1[i][k] * m2[k][j]);
				}
			}
		}
		System.out.println("multiplication of matrix");
		displayMatrix(result, rows, columns);
	}

	//void takeInput(int [][] m, int row, int column)	
	//{
	//	for(int i = 0; i<rows; i++)
	//	{
	//		for(int j = 0; j<column; j++)
	//		{
	//			System.out.println("for " + i + " row " + j + " column");
	//			m[i][j] = scn.nextInt();
	//		}
	//	}
	//}

	void displayMatrix(int [][] matrix, int rows, int columns)
	{
		System.out.println("\n//////// printing matrix //////////////\n");
		for(int i = 0; i<rows; i++)
		{
			for(int j = 0; j<columns; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
