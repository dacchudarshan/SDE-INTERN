public class twoDArray 
{
    //matrix multiplication
    static int[][] getMatricMultiplication (int[][] A, int[][] B)
    {
        //edge case 1: check if either matrix is null
        if (A == null || B == null || A.length == 0 || B.length == 0)
        {
            System.out.println("One or both matrices are null or empty");
            return new int[0][0];
        }
        //edge case 2: check if the number of columns in A is equal to the number of rows in B
        if (A[0].length != B[0].length)
        {
             System.out.println("Incompatible matrix dimensions");
             return new int[0][0];
        }
        
        int[][] result = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) //outer loop
        {
            for (int j = 0; j < B[0].length; j++) //inner loop
            {
                for (int k = 0; k < B.length; k++) //loop for multiplication
                {
                    result[i][j] += A[i][k] * B[k][j]; //multiplication and addition
                }
            }
        }
        return result;
    }
//-------------------------------------------------------------------------------------------------------------
    class boundaryElements
    {
        static void printBoundaryElements(int[][] matrix)
        {
            for (int i = 0; i < matrix.length; i++)
            {
                for (int j = 0; j < matrix[0].length; j++)
                {
                    if (i == 0 || i == matrix.length - 1 || j == 0 || j == matrix[0].length - 1)
                    {
                        System.out.print(matrix[i][j] + " ");
                    }
                }
                System.out.println();
            }   
        }
    }

    public static void main(String[] args)
    {
        int[][] A = {{3,5,6},{7,6,2},{4,8,1}};
        
        int[][] B = {{1,0},{0,1,0},{0,0,1}};

        int[][] result = getMatricMultiplication(A, B);
        for (int[] row : result)
        {
            for (int value : row)
            {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        boundaryElements.printBoundaryElements(A);
    }
}
