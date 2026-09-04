import java.util.Scanner;

public class Calculatorapp
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== CALCULATOR =====");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 6) {
            System.out.println("Calculator closed");
            return;
        }

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result;

        switch (choice) 
        {

            case 1:
                result = num1 + num2;
                System.out.println("Addition = " + result);
                break;

            case 2:
                result = num1 - num2;
                System.out.println("Subtraction = " + result);
                break;

            case 3:
                result = num1 * num2;
                System.out.println("Multiplication = " + result);
                break;

            case 4:
                if (num2 != 0) 
                    {
                    result = num1 / num2;
                    System.out.println("Division = " + result);
                    } 
                else 
                    {
                    System.out.println("Cannot divide by zero");
                    }
                break;

            case 5:
                result = num1 % num2;
                System.out.println("Modulus = " + result);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}