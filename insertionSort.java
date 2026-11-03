//insertion sort
public class insertionSort
{
    public static void insertionSort(int[] arr)
    {
        for (int i = 1; i < arr.length; i++)
            {
            int key = arr[i]; // current element to be inserted
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key)
                {
                arr[j + 1] = arr[j];
                j--;
                }
            arr[j + 1] = key; // insert the key at the correct position
            }
    }

    public static void main(String[] args)
    {
        System.err.println("Before Insertion sort");
        int[] arr = { 9, 2, 16, 6, 13 }; // original array
        System.out.println("Original array: " + java.util.Arrays.toString(arr));

        insertionSort(arr); // calling the insertion sort method
        System.out.println("After insertion sort: " + java.util.Arrays.toString(arr));

    }
}
