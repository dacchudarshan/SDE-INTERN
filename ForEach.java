// // for each loop in java
// public class ForEach 
// {
//         static void traverse(int arr[]) 
//         {
//         for(int i : arr)
//         {
//             System.out.print(i + " ");
//         } 
//         }
//         public static void main(String[] args) 
//         {
//             //traverse(new int[]{1,2,3,4});   //ananimous array
//             int arr[] = {1,2,3,4};
//             traverse(arr);
//         } 
// }


// // for each loop in java
// class ForEach2 
// {
//     static void traverse(int arr[]) 
// {
//     int count = 0;

//     for (int i : arr)
//     {
//         System.out.print(i);
//         count++;

//         if (count < arr.length)
//         {
//             System.out.print(" ");
//         }
//     }

//     System.out.println();
// }
// }


// class sum 
// {
//     static void findSum(int arr[]) 
//     {
//         int sum = 0;

//         for (int i : arr) 
//         {
//             sum += i;
//         }

//         System.out.println("Sum: " + sum);
//     }

//     public static void main(String[] args) 
//     {
//         int arr[] = {1, 2, 3, 4};
//         findSum(arr);
//     }
// }


// // find the max
// class Max 
// {
//     static void findMax(int arr[]) 
//     {
//         int max = arr[0];

//         for (int i : arr) 
//         {
//             if (i > max) 
//             {
//                 max = i;
//             }
//         }

//         System.out.println("Max: " + max);
//     }

//     public static void main(String[] args) 
//     {
//         int arr[] = {223, 2, 123456, 23, 4};
//         findMax(arr);
//     }
// }

// search an element in an array arr[10,20,3o0,40,50] target = 20
class Search 
{
    static boolean searchElement(int arr[], int target) 
    {
        for (int x : arr)  
        {
            if (x == target) 
            {
               return true;
            }
        }
        return false;
    }
    public static void main(String[] args) 
    {
        int arr[] = {10, 20, 30, 40, 50};
        System.out.println(searchElement(arr, 30)); // Output: true
        System.out.println(searchElement(arr, 60)); // Output: false    
    }
}
