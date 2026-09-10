


public class nestedloop 
{
    public static void main(String[] args) 
    {

        // Outer loop for rows
             for (int i = 1; i <= 3; i++) 
                {

            for (int j = 1; j <= 3; j++) 
                {
                System.out.print(" * ");
                }

            System.out.println();
                }

            // print (1,1) (1,2) (1,3)
            // print (2,1) (2,2) (2,3)
            // print (3,1) (3,2) (3,3)

            for (int i = 1; i <= 3; i++) 
            {
                for (int j = 1; j <= 3; j++) 
                {
                    System.out.print("(" + i + "," + j + ") ");
                }
                System.out.println();
            }
            
    }
}   

class BreakAndCont
{
    public static void main(String[] args) 
    {
        // Break statement
        for (int i = 1; i <= 10; i++)
        {
            if (i % 3 == 0)
            {
                continue; // skip the current iteration when i is divisible by 3
            }
            System.out.println("i: " + i);
        }
    }
}

