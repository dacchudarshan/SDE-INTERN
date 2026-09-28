// public class array1 
// {
//     public static void main(String[] args) 
//     {
//         int marks[] = {10,20,30,40};
//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);
//         // System.out.println(marks[3]);
//         // System.out.println(marks[4]);

//         for(int i=0; i<marks.length; i++)
//         {
//             marks[-4]=100;
//             System.out.print(marks[i] + " ");
//         }

//         // int marks[] = new int[5];
//         // for(int i=0; i<marks.length; i++)
//         // {
//         //     System.out.print(marks[i] + " ");
//         // }
//     }
// }


//-------------------------------------------------------------------------------------------------------
class array
{
    // 1), left to right printing of array elements
    public static void printLeftToRight(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);

            // remove the last arrow after the last element
            if(i < arr.length - 1)
                System.out.print("->");
        }

        System.out.println();
    }

    // 2), right to left printing of array elements
    public static void printRightToLeft(int arr[])
    {
        for(int i = arr.length - 1; i >= 0; i--)
        {
            System.out.print(arr[i]);

            // remove the last arrow after the last element
            if(i > 0)
                System.out.print("->");
        }

        System.out.println();
    }

    // 3), two pointers printing of array elements
      public static void bothSidesTowardCenter(int arr[])
    {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right)
        {
            System.out.print(arr[left] + " " + arr[right] + " ");

            left++;
            right--;
        }

        System.out.println();
    }

    // 4), center moving left and right printing of array elements
   public static void centerMovingLeftAndRight(int arr[])
    {
    int center = arr.length / 2;

    if(arr.length % 2 == 0)
    {
        // Even
        for(int i = 1; i <= center; i++)
        {
            System.out.print(arr[center - i] + " " + arr[center + i - 1] + " ");
        }
    }
    else
    {
        // Odd
        System.out.print(arr[center] + " ");

        for(int i = 1; i <= center; i++)
        {
            System.out.print(arr[center - i] + " " + arr[center + i] + " ");
        }
    }

    System.out.println();
}

    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        //left to right
        System.out.println("Left to Right: ");
        printLeftToRight(arr);

        System.out.println();
       
        //right to left
        System.out.println("Right to Left: ");
        printRightToLeft(arr);

        System.out.println();

        //two pointers
        System.out.println("Two Pointers: ");
        bothSidesTowardCenter(arr);

        System.out.println();
        //center moving left and right
        System.out.println("Center Moving Left and Right: ");
        centerMovingLeftAndRight(arr);
    }
}

