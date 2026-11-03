import java.util.Arrays;

public class asciiReturn 
{
        static char[] convertLowercaseToUppercase(char[] arr) 
        {
            char[] result = new char[arr.length];

            for (int i = 0; i < arr.length; i++) 
                {
                if (arr[i] >= 'a' && arr[i] <= 'z') 
                    {
                    result[i] = (char) (arr[i] - 32); // type casting
                    } 
                else 
                    {
                    result[i] = arr[i];
                    }
                }

            return result;
        }

        public static void main(String[] args) 
        {
            char[] arr = {'c', 'o', 'd', 'e'};
            char[] output = convertLowercaseToUppercase(arr);

            System.err.println(Arrays.toString(output));

            // System.out.print("['");
            // for (int i = 0; i < output.length; i++) 
            //     {
            //     System.out.print(output[i] + "'");
            //     if (i < output.length - 1) 
            //         {
            //         System.out.print(", '");
            //         }
            //     }
            // System.out.println("]");

    
        }
        
}
