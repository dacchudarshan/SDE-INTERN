public class bubbleSort 
{
    public static void printArray(int[] arr) 
    {
        int n = arr.length; //length of array
        for (int i=0; i<n; ++i) //loop the array printing each element
            System.out.print(arr[i] + " "); // like this: 1 2 3 4 5
        System.out.println();
    }

    public static void bubbleSort(int[] arr) 
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) // Outer loop
            for (int j = 0; j < n-i-1; j++) // Inner loop
                if (arr[j] > arr[j+1]) // Compare elements
                {
                    // swap arr[j+1] and arr[j] 
                    int temp = arr[j]; // Store the value of arr[j]
                    arr[j] = arr[j+1]; // Assign the value of arr[j+1] to arr[j]
                    arr[j+1] = temp;// Assign the stored value of arr[j] to arr[j+1]
                }
    }

    public static void main(String[] args) 
    {
        System.out.println("Original array: ");
        // printArray(new int[]{5,4,3,2,1}); //print original array
        // printArray(new int []{12,43,1,23,67});
        //printArray(new int []{199,2121,12,123,422,2324});
        printArray(new int []{21,34,2,76,93});

        // int[] arr = {5,4,3,2,1};
        //int [] arr = {12,43,1,23,67};
        // int [] arr = {199,2121,12,123,422,2324};
        int [] arr = {21,34,2,76,93};
        bubbleSort(arr); //call the bubblesort method

        System.out.println("Sorted array: ");
        printArray(arr); //call the printArray method
        
        


    }
}
