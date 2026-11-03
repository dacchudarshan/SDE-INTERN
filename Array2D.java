public class Array2D
{
    // write a function to print 3*3 2D integer array 
    public static void printArray(int[][] arr) 
    {
        for (int row = 0; row < 5; row++) 
        {
            for (int col = 0; col < 5; col++) 
            { 
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    // print any row of 2D array in two for loop
    public static void printRow(int[][] array, int rowNumber)
    {
        for(int row = 0; row < array.length; row++)
        {
            if(row == rowNumber)
            {
                for(int col = 0; col < array[row].length; col++)
                {
                    System.out.print(array[row][col] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void printCol(int[][] array, int colNumber)
    {
        for(int col = 0; col < array[0].length; col++)
        {
            if(col == colNumber)
            {
                for(int row = 0; row < array.length; row++)
                {
                    System.out.println(array[row][col] + " ");
                }
            }
        }
        System.out.println();
    }
    
    
    // print any row of 2D array in single for loop
    public static void printRow1(int[][] array, int rowNumber)
    {
        //null check
        if(array == null)
            return;

        // check the range of row number 0 to length
        if(rowNumber < 0 || rowNumber >= array.length)
        {
            System.out.println("Invalid row number");
            return;
        }

        for(int col = 0; col < array[rowNumber].length; col++)
        {
            System.out.print(array[rowNumber][col] + " ");
        }
        System.out.println();
    }

    public static void printCol1(int[][] array, int colNumber)
    {
        //null check
        if(array == null)
            return;

        // check the range of column number 0 to length
        if(colNumber < 0 || colNumber >= array[0].length)
        {
            System.out.println("Invalid column number");
            return;
        }

        for(int row = 0; row < array.length; row++)
        {
            System.out.println(array[row][colNumber] + " ");
        }
        System.out.println();

    }
    
    //print daiganal of 2D array
   public static void printDiagonal(int[][] array)
    {
        //null check
        if(array == null)
            return;

        // check the range of row number 0 to length
        if(array.length != array[0].length)
        {
            System.out.println("Invalid array");
            return;
        }

        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                if(i == j)
                {
                    System.out.print(array[i][j] + " ");
                }
                else
                {
                    System.err.print("  ");
                }
        }
        System.out.println();
    }
    }
    

    // print vertical of 2D array
     public static void printVertical(int[][] array)
    {
        //null check
        if(array == null)
            return;
     if(array.length != array[0].length)
        {
            System.out.println("Invalid array");
            return;
        }

        for(int i = 4; i < array.length-1; i++)
        {
            for(int j = 4; j > array[i].length; j--)
            {
                if(j == i)
                {
                    System.out.print(array[i][j] + " ");
                }
                else
                {
                    System.err.print("  ");
                }
        }
        System.out.println();
    }
    } 
    

      public static void main(String[] args) 
    {
        int[][] array = {
                            {11, 12, 13, 14, 15}, 
                            {21, 22, 23, 24, 25},
                            {31, 32, 33, 34, 35},
                            {41, 42, 43, 44, 45},
                            {51, 52, 53, 54, 55}
                        };  
                          
        printArray(array);

        // two for loop 
        System.err.println();
        System.err.println("TWO FOR LOOP");
        printRow(array, 0);

        System.err.println();
        printCol(array,0);

        //single for loop
        System.err.println();
        System.err.println("SINGLE FOR LOOP");
        printRow1(array,0);

        System.err.println();
        printCol1(array, 0);

        System.err.println();
        System.err.println("DIAGONAL");
        printDiagonal(array);

        System.err.println();
        System.err.println("VERTICAL");
        printVertical(array);
    }


}
