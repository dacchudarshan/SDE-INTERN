import java.util.Scanner;
public class fibonacci 
{
    public static void main(String []args)
    {
      //fibonacci series
      
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; i++) 
            {

            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;   
            }
            
    }
}
