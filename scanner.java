import java.util.*;

public class scanner
{
    public static void main(String[] args) 
    {
        System.err.println("addition of two numbes: ");
        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        int result = num1+num2;

        System.err.println("Total numbers: "+ result);

    }
}

class AreaOfTraingle
{
    public static void main(String[] args) 
    {
        System.err.println("area of  traingle: ");

        int h, b;

        Scanner aot = new Scanner(System.in);

        System.out.print("Enter nu1: ");
        h = aot.nextInt();

        System.out.print("Enter num2: ");
        b  = aot.nextInt();

        float result = b * h * 0.5f;
        System.err.println("totale values: "+result);


    }
}