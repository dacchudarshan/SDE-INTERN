import java.util.*;

public class Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Number System:");
        System.out.println("1. Binary");
        System.out.println("2. Octal");
        System.out.println("3. Decimal");
        System.out.println("4. Hexadecimal");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter the number: ");
        String number = sc.next();

        int decimal;

        if (choice == 1)
        {
            decimal = Integer.parseInt(number, 2);
            System.out.println("Selected: Binary");
        }

        else if (choice == 2)
        {
            decimal = Integer.parseInt(number, 8);
            System.out.println("Selected: Octal");
        }

        else if (choice == 3)
        {
            decimal = Integer.parseInt(number, 10);
            System.out.println("Selected: Decimal");
        }

        else if (choice == 4)
        {
            decimal = Integer.parseInt(number, 16);
            System.out.println("Selected: Hexadecimal");
        }

        else
        {
            System.out.println("Invalid choice");
           sc.close();
           return;
        }
         
        String binary = Integer.toBinaryString(decimal);

        System.out.println("Decimal = " + decimal);
        System.out.println("Binary = " + binary);

        sc.close();
    }
}