public class selectionSortingArray
{
    static void sortingArray(int arr[]) 
    {
        for (int i = 0; i < arr.length - 1; i++) // (outer loop) one pass
            {
            int minIndex = i; // assume the first element is the minimum

            //comparision
            for (int j = i + 1; j < arr.length; j++)  //inner loop 
                {
                if (arr[j] < arr[minIndex])  //compare 
                    {
                    minIndex = j; // update the index of the minimum element
                    }
                }
            int temp = arr[i]; 
            arr[i] = arr[minIndex]; //swap 
            arr[minIndex] = temp;
            }
    }
    // Function to print the array
    static void printArray(int[] arr)
    {
        for (int x : arr)  // enhanced for loop
            {
            System.out.print(x + " ");// output like this 9 2 16 6 13
            }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        int array[] = { 9, 2, 16, 6, 13 }; // original array

        System.out.println("Before Swapping");
        printArray(array);

        System.out.println("After Swapping");
        sortingArray(array); //calling method
        printArray(array);
    }
}