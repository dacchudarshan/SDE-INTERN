// public class NumberSystem
// {
//     public static void main(String[] args)
//     {
//         String s1 = "10";   //binary                                                 
//         String s2 = "123";  //octal
//         String s3 = "329";  //hexadecimal
//         String s4 = "14";   //decimal

//         int binary      = Integer.parseInt(s1, 2);  //output: 2^1*1 + 2^0*0 = 2
//         int octal       = Integer.parseInt(s2, 8);  //output: 8^2*1 + 8^1*2 + 8^0*3 = 64 + 16 + 3 = 83
//         int hexadecimal = Integer.parseInt(s3, 16); //output: 16^2*3 + 16^1*2 + 16^0*9 = 768 + 32 + 9 = 809
//         int decimal     = Integer.parseInt(s4, 10); //output: 10^1*1 + 10^0*4 = 14

//         System.out.println("Binary = " + binary);
//         System.out.println("Octal = " + octal);
//         System.out.println("Hexadecimal = " + hexadecimal);
//         System.out.println("Decimal = " + decimal);
//     }
// }

// import java.util.Scanner;
// class NumberSystems
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Choose Number System:");
//         System.out.println("1. Binary");
//         System.out.println("2. Octal");
//         System.out.println("3. Decimal");
//         System.out.println("4. Hexadecimal");

//         System.out.print("Enter your choice: ");
//         int choice = sc.nextInt();

//         System.out.print("Enter the number: ");
//         String number = sc.next();

//         int result;

//         if (choice == 1)
//         {
//             result = Integer.parseInt(number, 2);
//             System.out.println("Decimal = " + result);
//         }
//         else if (choice == 2)
//         {
//             result = Integer.parseInt(number, 8);
//             System.out.println("Decimal = " + result);
//         }
//         else if (choice == 3)
//         {
//             result = Integer.parseInt(number, 10);
//             System.out.println("Decimal = " + result);
//         }
//         else if (choice == 4)
//         {
//             result = Integer.parseInt(number, 16);
//             System.out.println("Decimal = " + result);
//         }
//         else
//         {
//             System.out.println("Invalid choice");
//         }

//         sc.close();
//     }
// }

import java.util.Scanner;

class NumberSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        if (decimal >= 0)
        {
            String binary = Integer.toBinaryString(decimal);

            System.out.println("Decimal = " + decimal);
            System.out.println("Binary = " + binary);
        }
        else
        {
            System.out.println("Please enter a positive decimal number.");
        }

        sc.close();
    }
}