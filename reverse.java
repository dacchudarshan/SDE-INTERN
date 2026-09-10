public class reverse 
{
    public static void main(String[] args) 
    {
    
        int number = -123; // Number to be reversed
        int reversedNumber = 0;

        while (number != 0) 
        {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit
            number /= 10; // Remove the last digit from the original number
        }

        System.out.println("Reversed Number: " + reversedNumber);
    }
    
}
