import java.util.Scanner;

public class ifelse
{
    public static void main(String[] args)
    {
        PositiveNegative.check();
        UppercaseCheck.check();
        EvenOdd.check();
        LargestTwo.check();
        LargestThree.check();
        AgeCategory.check();
        Scholarship.check();
        Calculator.check();
    }
}


// 1. Positive or Negative

class PositiveNegative
{
    static void check()
    {
        System.out.println();
        System.out.println("1. Positive or Negative: ");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num > 0)
            System.out.println("Positive");
        else if (num < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}


// 2. Check Uppercase
class UppercaseCheck
{
    static void check()
    {
        System.out.println();
        System.out.println("2. Check Uppercase: ");
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z')
            System.out.println("Uppercase");
        else
            System.out.println("Not Uppercase");
    }
}


// 3. Even or Odd
class EvenOdd
{
    static void check()
    {
        System.out.println();
        System.out.println("3. Even or Odd: ");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}


// 4. Largest of Two Numbers
class LargestTwo
{
    static void check()
    {
        System.out.println();
        System.out.println("4. Largest of Two Numbers: ");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b)
            System.out.println("Largest = " + a);
        else if (b > a)
            System.out.println("Largest = " + b);
        else
            System.out.println("Both are equal");
    }
}


// 5. Largest of Three Numbers if-else-if
class LargestThree
{
    static void check()
    {
        System.out.println();
        System.out.println("5. Largest of Three Numbers if-else-if: ");


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a >= b && a >= c)
            System.out.println("Largest = " + a);
        else if (b >= a && b >= c)
            System.out.println("Largest = " + b);
        else
            System.out.println("Largest = " + c);
    }
}


// 6. Age Category
class AgeCategory
{
    static void check()
    {
        System.out.println();
        System.out.println("6. Age Category: ");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 0 && age <= 12)
            System.out.println("Child");
        else if (age <= 19)
            System.out.println("Teenager");
        else if (age <= 59)
            System.out.println("Adult");
        else
            System.out.println("Senior Citizen");
    }
}


// 7. Nested If - Scholarship
class Scholarship
{
    static void check()
    {
        System.out.println();
        System.out.println("7. Nested If - Scholarship: ");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter family income: ");
        int income = sc.nextInt();

        if (marks >= 80)
        {
            if (income <= 300000)
                System.out.println("Eligible for Scholarship");
            else
                System.out.println("Not Eligible: Income is too high");
        }
        else
        {
            System.out.println("Not Eligible: Marks are too low");
        }
    }
}


// 8. Switch Calculator
class Calculator
{
    static void check()
    {
        System.out.println();
        System.out.println("8. Switch Calculator: ");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("Result = " + (a + b));
                break;

            case 2:
                System.out.println("Result = " + (a - b));
                break;

            case 3:
                System.out.println("Result = " + (a * b));
                break;

            case 4:
                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Cannot divide by zero");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}