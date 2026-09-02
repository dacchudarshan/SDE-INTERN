
import java.util.Scanner;
// Divide two numbers and print the result as integer and float.    
public class working 
{
    public static void main(String[] args) 
    {
        int num1 = 10;
        int num2 = 5;
        int total1 = num1/num2;

        System.out.println("integer division: " + total1);

        int num3 = 10;
        int num4 = 5;
        float total2 = (float)(num3)/num4;

        System.out.println("float Divison: "+ total2);

    }
}

//add two numbers and print the result as integer.
class working2 
{
    public static void main(String[] args) 
    {
        float num1 = 10;
        float num2 = 5;
        int total1 = (int)num1/(int)num2;

        System.out.println("integer division: " + total1);

        float num3 = 10;
        float num4 = 5;
        float total2 = num3/num4;

        System.out.println("float Divison: "+ total2);

    }
}

// Divide two numbers and print the result as integer and float.
class working1 
{
    public static void main(String[] args) 
    {
        Scanner number = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = number.nextInt();

        System.out.print("Enter num2: ");
        int num2 = number.nextInt();

        System.out.println("Integer division: " + (num1 / num2));
        System.out.println("Float division: " + ((float) num1 / num2));
    }
}

