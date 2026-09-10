import java.util.Scanner;
public class condition 
{
    public static void main(String [] args)
    {
        // byte a = 20;
        // byte b = 12;
        // if (a<=b)
        // {
        //     System.out.println(a + " Is Smaller");
        // }
        // else
        // {
        //     System.out.println(b+ " Is Smaller");
        // }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        String num=sc.next(); // "127" --> word
        boolean binary = true; // assume that the number is octal 
        boolean octal = true;
        boolean decimal = true;
        boolean hexa = true;

        for(int i = 0; i <= num.length() - 1; i++)
        {
            char ch = num.charAt(i);

            if (ch < '0' || ch > '1')
            {
                binary = false;
            }
                if (ch < '0' || ch > '7')
                {
                    octal = false;
                }
                    if ( ch < '0' || ch > '9')
                    {
                        decimal = false;
                    }
                        if ((ch < '0' || ch > '9') && (ch < 'A' || ch > 'F') && (ch < 'a' || ch > 'f'))
                        {
                            hexa = false;
                        }
            // else 
            // {
            //     System.out.println("00000");
            // }
        }
        if(binary)
        {
            System.out.println("Yes Binary radix = 2 ");
        }
        else if (octal)
        {
            System.out.println("Yes Octal radix = 8");
        }
        else if (decimal)
        {
            System.out.println("Yes Decimal radix = 10");
        }
        else if (hexa)
        {
            System.out.println("Yes Hexadecimal radix = 16");
        }
        else 
        {
            System.out.println("Not a Valid Input");
        }
        sc.close();

    }
}


