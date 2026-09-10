public class PrintDARSHU 
{
    public static void main(String[] args) 
    {
        int n = 5; // Height of the letters

        for (int i = 1; i <= n; i++) 
            {
            // Letter D
            for (int j = 1; j <= n; j++) 
                {
                if (j == 1 || ((i == 1 || i == n) && j < n) || (j == n && i != 1 && i != n))
                    System.out.print("*");
                else System.out.print(" ");
                }
            System.out.print("  "); // Space between letters

            // Letter A
            for (int j = 1; j <= n; j++) 
                {
                if (((j == 1 || j == n) && i != 1) || (i == 1 && j != 1 && j != n) || (i == n / 2 + 1))
                    System.out.print("*");
                else System.out.print(" ");
                }
            System.out.print("  ");

            // Letter R
            for (int j = 1; j <= n; j++) 
                {
                if (j == 1 || ((i == 1 || i == n / 2 + 1) && j < n) || (j == n && i != 1 && i < n / 2 + 1) || (i > n / 2 + 1 && j == i))
                    System.out.print("*");
                else System.out.print(" ");
                }
            System.out.print("  ");

            // Letter S
            for (int j = 1; j <= n; j++) 
                {
                if (i == 1 || i == n || i == n / 2 + 1 || (j == 1 && i < n / 2 + 1) || (j == n && i > n / 2 + 1))
                    System.out.print("*");
                else System.out.print(" ");
                }
            System.out.print("  ");

            // Letter H
            for (int j = 1; j <= n; j++) 
                {
                if (j == 1 || j == n || i == n / 2 + 1)
                    System.out.print("*");
                else System.out.print(" ");
                }
            System.out.print("  ");

            // Letter U
            for (int j = 1; j <= n; j++) 
                {
                if (((j == 1 || j == n) && i != n) || (i == n && j != 1 && j != n))
                    System.out.print("*");
                else System.out.print(" ");
                }

            System.out.println(); // Move to the next row
        }
    }
}