
import java.util.Scanner;
public class palindrome 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a palindrome: ");
        int number = scanner.nextInt(); // Read the number from user input
        
        // int number = 12321; // Number to be checked
        int originalNumber = number; // Store the original number
        int reversedNumber = 0;

        while (number != 0) 
        {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit
            number /= 10; // Remove the last digit from the original number
        }

        if (originalNumber == reversedNumber) 
        {
            System.out.println(originalNumber + " is a palindrome.");
        } 
        else 
        {
            System.out.println(originalNumber + " is not a palindrome.");
        }
        
    }
}
