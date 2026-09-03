import java.util.Scanner;
public class calculator 
{
    public static void main(String[] args) 
    {
        System.out.println("Simple Calculator");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);  

        int sum = 0;
        int difference = 0;
        int product = 0;
        double quotient = 0.0;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
    
}
