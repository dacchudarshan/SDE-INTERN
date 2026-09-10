public class daimand 
{
    public static void main(String[] args) 
    {
        int n = 5; // Number of rows for the diamond shape

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) 
        {
            // Print leading spaces
            for (int j = i; j < n; j++) 
            {
                System.out.print(" ");
            }
            // Print asterisks 
            for (int k = 1; k <= (2 * i - 1); k++) 
            {
                System.out.print("*");  
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) 
        {
            // Print leading spaces
            for (int j = n; j > i; j--) 
            {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 1; k <= (2 * i - 1); k++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
