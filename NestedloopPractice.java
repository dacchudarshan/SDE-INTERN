public class NestedloopPractice 
{
    public static void main(String[] args) 
    {
        int n = 7;

        if (n > 0) 
        {
            for (int i = 1; i <= n; i++) 
            {
                if (i == 3) 
                {
                    continue;
                }

                int j = 1;

                while (j <= n) 
                {
                    if (j == 5) 
                    {
                        break;
                    }

                    System.out.print("* ");
                    j++;
                }

                System.out.println();
            }
        } 
        else 
        {
            System.out.println("Invalid");
        }
    }
}