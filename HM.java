public class HM 
{
    public static void main(String[] args) 
    {
        // //1.reverse a number twice to get the original number

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter number: ");
        // int num = sc.nextInt();

        // int reverse = 0;

        // // First reverse: 54321 -> 12345
        // while (num > 0) {
        //     int digit = num % 10;
        //     reverse = reverse * 10 + digit;
        //     num = num / 10;
        // }

        // int original = 0;

        // // Second reverse: 12345 -> 54321
        // while (reverse > 0) {
        //     int digit = reverse % 10;
        //     original = original * 10 + digit;
        //     reverse = reverse / 10;
        // }

        // System.out.println("Output: " + original);


        // //2. Another approach to reverse a number twice to get the original number
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter number: ");
        // int num = sc.nextInt();

        // int reverse = 0;

        // for (int n = num; n > 0; n = n / 10) 
        // {
        //     int digit = n % 10;
        //     reverse = reverse * 10 + digit;
        // }

        // int result = 0;

        // for (int n = reverse; n > 0; n = n / 10) 
        // {
        //     int digit = n % 10;
        //     result = result * 10 + digit;
        // }

        // System.out.println("Output: " + result);

        // //3. using while loop to reverse a number twice to get the original number

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter number: ");
        // int num = sc.nextInt();

        // int reverse = 0;

        // while (num > 0) {
        //     int digit = num % 10;
        //     reverse = reverse * 10 + digit;
        //     num = num / 10;
        // }

        // int result = 0;

        // while (reverse > 0) {
        //     int digit = reverse % 10;
        //     result = result * 10 + digit;
        //     reverse = reverse / 10;
        // }

        // System.out.println("Output: " + result);

        // //4.armstrong number
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter number: ");
        // int num = sc.nextInt();

        // int original = num;
        // int sum = 0;

        // while (num > 0) 
        // {

        //     int digit = num % 10;

        //     sum = sum + (digit * digit * digit);

        //     num = num / 10;
        // }

        // if (sum == original) {
        //     System.out.println("Armstrong Number");
        // } 
        // else 
        //     {
        //     System.out.println("Not Armstrong Number");



        // //5. print 1 to 10 stop at 5 using break statement
        //  for (int i = 1; i <= 10; i++) 
        // {
        //     if (i == 5) 
        //     {
        //         break;
        //     }
        //     System.out.println(i);
        // }

        // // 6. print a to z using break statement
        // for (char ch = 'a'; ch <= 'z'; ch++)
        // {
        //     if (ch == 'z')
        //     {
        //         break;
        //     }
        //     System.out.println(ch);
        //     }

    // //7. print even 1 to 20
    // for (int i = 1; i <= 20; i++) 
    // {
    //     if (i % 2 != 0) 
    //     {
    //         continue;
    //     }
    //     System.out.println(i);
    // }

    // //8.print odd 1 to 20
    // for (int i = 1; i <= 20; i++)
    // {
    //     if (i % 2 == 0)
    //     {
    //         continue;

    //     }
    //     System.out.println(i);
    // }
    
    // //9. print *** AAA 123 
    // System.out.println("***");
    // System.out.println("AAA");
    // System.out.println("123");
    //    String a = "***";
    //     String b = "AAA";
    //     String c = "123";
    //System.out.println(a + "\n" + b + "\n" + c);  




    //  do while pratice problems 


    for (int i = 1; i <= 3; i++) 
    {
        for (int j = 1; j <= 3; j++) 
        {
            if (j == 2) 
            {
                continue;
            }
            System.out.print(j + " ");
        }
        System.out.println();
    }

}

}
