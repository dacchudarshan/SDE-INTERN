import java.util.Scanner;
public class octal 
{
    public static void main(String[] args) 
    {
        // //octal number checking
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter an octal number: ");
        // String octal = sc.nextLine();

        // boolean decimal = true;

        // for (int i = 0; i < octal.length(); i++) 
        // {
        //     char c = octal.charAt(i);
        //     if (c < '0' || c > '7') 
        //     {
        //         decimal = false;
        //         break;
        //     }
        // }
        // if (decimal) 
        // {
        //     System.out.println("yes it is the octal and number 8");
        // } 
        // else 
        // {
        //     System.out.println("Invalid octal number.");
        // }

        // sc.close();

        // octal to decimal conversion
        int decimalValue = 0;
        int base = 1; // 8^0

        for (int i = octal.length() - 1; i >= 0; i--) 
        {
            int digit = octal.charAt(i) - '0';
            decimalValue += digit * base;
            base *= 8;
        }
        System.out.println("The decimal equivalent is: " + decimalValue);





    }
}
 