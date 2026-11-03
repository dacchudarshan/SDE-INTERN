public class twoDArrays
{  
    // 1,sum of all elements
    static int printSum(int[][] array)
    {
        int sum = 0;

        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[row].length; col++)
            {
                sum += array[row][col];
            }
        }
        return sum;
    }

    // 2, max of all elements
    static int printMax(int[][] array)
    {
        int max = array[0][0];

        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[row].length; col++)
            {
                if (array[row][col] > max)
                {
                    max = array[row][col];
                }
            }
        }
        return max;
    }

    // 3, min of all elements
    static int printMin(int[][] array)
    {
        int min = array[0][0];

        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[row].length; col++)
            {
                if (array[row][col] < min)
                {
                    min = array[row][col];
                }
            }
        }
        return min;
    }

    // 4, count of even and odd elements
    static int[] printEvenOddCounts(int[][] array)
    {
        int evenCount = 0;
        int oddCount = 0;

        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[row].length; col++)
            {
                if (array[row][col] % 2 == 0)
                {
                    evenCount++;
                }
                else
                {
                    oddCount++;
                }
            }
        }
        return new int[]{evenCount, oddCount};
    }

    // 5, search for a key in the array
    static boolean printKeySearch(int[][] array, int key)
    {
        boolean found = false;

        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[row].length; col++)
            {
                if (array[row][col] == key)
                {
                    found = true;
                    break;
                }
            }
            if (found)
                break;
        }

        return found;
    }
    
    //6, scalar multiplication 
     static int[][] printScalarMultiplication(int[][] array, int scalar)
    {
        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[row].length; col++)
            {
                array[row][col] *= scalar;
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
        return array;
    }   

    // 7. Sum of each column
    static void sumOfEachColumn(int[][] array)
    {
        for (int j = 0; j < array[0].length; j++)
        {
            int sum = 0;

            for (int i = 0; i < array.length; i++)
            {
                sum = sum + array[i][j];
            }

            System.out.println("Column " + j + " Sum = " + sum);
        }
    }

    // 8. Sum of elements greater than 5
    static int sumGreaterThan5(int[][] array)
    {
        int sum = 0;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                if (array[i][j] > 5)
                {
                    sum = sum + array[i][j];
                }
            }
        }

        return sum;
    }

    // 9. Maximum in every row
    static void maxInEveryRow(int[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            int max = array[i][0];

            for (int j = 1; j < array[i].length; j++)
            {
                if (array[i][j] > max)
                {
                    max = array[i][j];
                }
            }

            System.out.println("Row " + i + " Maximum = " + max);
        }
    }

    // 10. Minimum even element
    static int minEven(int[][] array)
    {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                if (array[i][j] % 2 == 0 && array[i][j] < min)
                {
                    min = array[i][j];
                }
            }
        }

        return min;
    }

    // Helper method to print the array
    static void printArray(int[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 11. Multiply only the main diagonal by 10
    static void multiplyMainDiagonal(int[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i][i] = array[i][i] * 10;
        }

        printArray(array);
    }

    // 12. Count how many times an element occurs
    static int countElement(int[][] array, int target)
    {
        int count = 0;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                if (array[i][j] == target)
                {
                    count++;
                }
            }
        }

        return count;
    }

    // 13. Search element only in main diagonal
    static boolean searchMainDiagonal(int[][] array, int target)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i][i] == target)
            {
                return true;
            }
        }

        return false;
    }

    // 14. Sum of both diagonals(leetcode 1572)
    static int diagonalSum(int[][] mat)
    {
        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++)
        {
            sum = sum + mat[i][i];

            sum = sum + mat[i][n - 1 - i];
        }

        if (n % 2 != 0)
        {
            sum = sum - mat[n / 2][n / 2];
        }

        return sum;
    }

    // Main method 
     public static void main(String[] args)
    {
        int[][] array = {{3,5,9},{7,6,2},{4,8,1}};

        // Print the array
        System.out.println("Array:");
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // 1, sum of all elements
        System.out.println("\n1. Sum of All Elements");
        System.out.println("Sum: " + printSum(array));

        // 2, max of all elements
        System.out.println("\n2. Maximum of All Elements");
        System.out.println("Maximum: " + printMax(array));

        // 3, min of all elements
        System.out.println("\n3. Minimum of All Elements");
        System.out.println("Minimum: " + printMin(array));

        // 4, count of even and odd elements
        System.out.println("\n4. Count of Even and Odd Elements");
        int[] counts = printEvenOddCounts(array);
        System.out.println("Even count: " + counts[0]);
        System.out.println("Odd count : " + counts[1]);

        // 5, search for a key in the array
        System.out.println("\n5. Search for a Key in the Array");
        System.out.println("Contains 8: " + printKeySearch(array, 8));

        // 6, scalar multiplication
        System.out.println("\n6. Scalar Multiplication");
        System.out.println("Array after scalar multiplication:");
        int[][] scaledArray = printScalarMultiplication(array, 2);

        // 7. Sum of each column
        System.out.println("\n7. Sum of Each Column");
        sumOfEachColumn(array);

        // 8. Sum of elements greater than 5
        System.out.println("\n8. Sum of Elements Greater Than 5");
        System.out.println(sumGreaterThan5(array));

        // 9. Maximum in every row
        System.out.println("\n9. Maximum in Every Row");
        maxInEveryRow(array);

        // 10. Minimum even element
        System.out.println("\n10. Minimum Even Element");
        System.out.println(minEven(array));

        // 11. Multiply only the main diagonal by 10
        System.out.println("\n11. Multiply Main Diagonal by 10");
        multiplyMainDiagonal(array);

        // 12. Count how many times an element occurs
        System.out.println("\n12. Count Element");
        System.out.println("Count = " + countElement(array, 7));

        // 13. Search element only in main diagonal
        System.out.println("\n13. Search in Main Diagonal");
        System.out.println(searchMainDiagonal(array, 60));

        // 14. Sum of both diagonals
        System.out.println("\n14. Sum of Both Diagonals (LeetCode 1572)");
        int[][] mat1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] mat2 = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int[][] mat3 = {{5}};

        System.out.println(diagonalSum(mat1)); 
        System.out.println(diagonalSum(mat2)); 
        System.out.println(diagonalSum(mat3)); 
    }
}
