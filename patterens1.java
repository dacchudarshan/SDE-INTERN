import java.util.Scanner;
public class patterens1 
{
    public static void main(String[] args) 
    {
        // print the number in reverse order
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        while (num>0)// 54321
        {
            int digit = num % 10; 
            num = num / 10;
            System.out.println(digit);
        }
        System.err.println("");
        System.out.println(num);
        System.out.println("loop ends if num = 0");

        // count the number of digits in a number
        int count = 0;
        while (num>0)
        {
            num = num / 10;
            count++;
        }
        System.out.println("The number of digits in the number is: " + count);

        // using % and /
        int count1 = 0;
        int num1 = sc.nextInt();
        while (num1>0)
        {
            int num2 = (num1 % 10);
            count1++;
            num1 = num1 / 10;
        }
        System.out.println("The number of digits in the number is: " + count1);


    }
}
    


