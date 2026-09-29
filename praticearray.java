public class praticearray 
{
    // left to right 
    public static void printLeftToRight(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.err.print(arr[i]);
            // remove last arrow 
            if (i < arr.length - 1)
        
            System.err.print(" -> ");
        }
        System.err.println();
    }

    // right to left
    public static void printRightToLeft(int arr[])
    {
        for(int i = arr.length - 1; i >= 0; i--) 
        {
            System.out.print(arr[i]);
            if(i >= arr.length-1)
            {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        int arr[]= {10,20,30,40,50};
        System.err.println("\nleft to right");
        printLeftToRight(arr);

        System.out.println("\nright to left");
        printRightToLeft(arr);         
    }
    
}
