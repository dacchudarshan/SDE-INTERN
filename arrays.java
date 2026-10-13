// public class arrays 
// {
//     int countPassed(int[] arr) 
//     {
//         int count = 0;
//         for (int n : arr)
//             if (n >= 35) count++;
//         return count;
//     }
//     public static void main(String[] args) 
//     {
//         int[] arr = {10, 20, 30, 40, 50};

//         arrays obj = new arrays(); //create a object 
//         int passedCount = obj.countPassed(arr); //call countPassed method
//         System.out.println("Number of students who passed: " + passedCount);
//     }
// }


// given a array and differne smallest and largest
class Difference 
{
    public static void main(String[] args) 
    {
        int[] arr = {4, 10, 26, 1, 5}; //initialize array

        int min = arr[0], max = arr[0]; //initialize first element as min and max

        for (int n : arr)  //for each loop to traverse the array
        {
            //find largest and smallest
            if (n > max) max = n;  
            else if (n < min) min = n;
        }

        //print largest and smallest
        System.out.println("Largest: " + max+ "\nSmallest: "+min);

      
    }
}


