public class CompareElement 
{
    // pick 1 element compare with all 
    public void compare(int[] arr) 
    {
        for (int i = 0; i < arr.length; i++) //outer loop
            {
            for (int j = 0; j < arr.length; j++) //inner loop
                {
                if (arr[i] > arr[j]) //compare elements
                    {
                    System.out.println(arr[i] + " > " + arr[j]); 
                    }
                else if (arr[i] < arr[j]) 
                {
                    System.out.println(arr[i] + " < " + arr[j]);
                }
                else 
                {
                    System.out.println(arr[i] + " == " + arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) 
    {
        int[] arr = {10, 20, 30, 40, 50};

        CompareElement obj = new CompareElement(); //create a object 
        obj.compare(arr); //call compare method
    }
}