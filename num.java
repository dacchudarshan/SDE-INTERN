import java.util.Scanner;
public class num
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter Decimal Number: ");
        // int decimal = sc.nextInt();

        // System.out.println("Binary      = "     + Integer.toBinaryString(decimal)); // N\2
        // System.out.println("Octal       = "     + Integer.toOctalString(decimal)); // N\8
        // System.out.println("Decimal     = "     + decimal);
        // System.out.println("Hexadecimal = "   + Integer.toHexString(decimal).toUpperCase()); // 16

        // sc.close();

        System.out.println("Select Number System:");
        System.out.println("1. Binary");
        System.out.println("2. Octal");
        System.out.println("3. Decimal");
        System.out.println("4. Hexadecimal");

        System.err.println("select: ");
        int choice = sc.nextInt();

        System.out.println("enter decimal number: ");
        int decimal = sc.nextInt();

        if (choice == 1)
        {
            System.out.println("Binary: "+Integer.toBinaryString(decimal));
        } 
        else if (choice == 2)
        {
            System.out.println("Octal: "+ Integer.toOctalString(decimal));
        }
        else if (choice == 3)
        {
            System.out.println("Decimal: "+ decimal);
        }
        else if (choice == 4)
        {
            System.out.println("Hexadecimal: "+ Integer.toHexString(decimal).toUpperCase());
        }
        else 
        {
            System.out.println("Invalid choice!");
        }
        sc.close();
    }
}