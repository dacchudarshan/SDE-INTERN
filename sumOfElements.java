public class sumOfElements
{
    static int[][] array = {
                                {3, 5, 9},
                                {7, 6, 2},
                                {4, 8, 1}
                               };
      
    // 1,sum of all elements
    static void printSum(int[][] array)
    {
        int sum = 0;

        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[row].length; col++)
            {
                sum += array[row][col];
            }
        }
        System.out.println("Sum of all elements: " + sum);
    }

    // 2, max of all elements
    static void printMax(int[][] array)
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
        System.out.println("Max of all elements: " + max);
    }

    // 3, min of all elements
    static void printMin(int[][] array)
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
        System.out.println("Min of all elements: " + min);
    }

    // 4, count of even and odd elements
    static void printEvenOddCounts(int[][] array)
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
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count : " + oddCount);
    }

    // 5, search for a key in the array
    static void printKeySearch(int[][] array, int key)
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

        if (found)
        {
            System.out.println("Key " + key + " found!");
        }
        else
        {
            System.out.println("Key " + key + " not found!");
        }
    }
    
    //6, scalar multiplication 
     static void printScalarMultiplication(int[][] array, int scalar)
    {
        System.out.println("After scalar multiplication by " + scalar + ":");
        
        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[row].length; col++)
            {
                array[row][col] *= scalar;
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }   

     public static void main(String[] args)
    {
        // 1, sum of all elements
        printSum(array);

        // 2, max of all elements
        printMax(array);

        // 3, min of all elements
        printMin(array);

        // 4, count of even and odd elements
        printEvenOddCounts(array);

        // 5, search for a key in the array
        printKeySearch(array, 8);

        // 6, scalar multiplication
        printScalarMultiplication(array, 2);
    }
}
