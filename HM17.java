public class HM17 
{
    // // 1) write a method to add two numbers (static using)
    // static int add(int a, int b) 
    // {
    //     return a + b;
    // }

    // public static void main(String[] args) 
    // {
    //     //call static method using class name
    //     int sum = add(10, 40);
    //     System.out.println(" static sum: "+ sum); //50
    // }   


    // // 1.1) write a method to add two numbers (instance using)
    // int add(int a, int b) 
    // {
    //     return a + b;
    // }   
 
    // public static void main(String[] args) 
    // {
    //     //call instance method using object
    //     HM17 darshu = new HM17(); // create object of class

    //     int sum = darshu.add(70, 20);
    //     System.out.println("instance sum: "+ sum); //90
    // }

//--------------------------------------------------------------------------------------------------------------------------
    // // 2) write a method to return type  square of numbers (static using)
    // static int square(int a) 
    // {
    //     return a * a;  //10*10=100
    // } 

    // public static void main(String[] args) 
    // {
    //     //call static method using class name
    //     int square = square(10); 
    //     System.out.println("Static square: "+ square); //100
    // }


    // // 2.1) write a method to return type  square of numbers (instance using)
    // int square(int a) 
    // {
    //     return a * a;  //10*10=100
    // }

    // public static void main(String[] args) 
    // {
    //     //call instance method using object
    //     HM17 darshu = new HM17(); // create object of class

    //     int sq = darshu.square(10);
    //     System.out.println("instance square: "+ sq);
    // }

//--------------------------------------------------------------------------------------------------------------------------
    // // 3) even or odd number (static using)
    // static void EvenOdd(int a)
    // {
    //     if(a%2==0)
    //         System.out.println(a+" is even number");
    //     else
    //         System.out.println(a+" is odd number"); 

    // }
    // public static void main(String[] args) 
    // {
    //     //call static method using class name
    //     EvenOdd(10); //10 is even number
    //     EvenOdd(15); //15 is odd number
    // }


    // // 3.1) even or odd number (instance using)
    // void EvenOdd(int a)
    // {
    //     if(a%2==0)
    //         System.out.println(a+" is even number");
    //     else
    //         System.out.println(a+" is odd number"); 

    // }
    // public static void main(String[] args) 
    // {
    //     //call instance method using object
    //     HM17 darshu = new HM17(); // create object of class 
        
    //     darshu.EvenOdd(10); //10 is even number
    //     darshu.EvenOdd(15); //15 is odd number
    // }

//----------------------------------------------------------------------------------------------------------------------
    // // 4) max of three numbers (static using)
    // static int maxOfThree(int a, int b, int c) 
    // {
    //     if(a>b && a>c)
    //         return a;
    //     else if(b>c)
    //         return b;
    //     else
    //         return c;
    // }
    // public static void main(String[] args) 
    // {
    //     //call static method using class name
    //     int max = maxOfThree(40, 20, 5);
    //     System.out.println("Static max of three numbers: "+ max); //40
        
    // }


    // // 4.1) max of three numbers (instance using)
    // int maxOfThree(int a, int b, int c) 
    // {
    //     if(a>b && a>c)
    //         return a;
    //     else if(b>c)
    //         return b;
    //     else
    //         return c;
    // }
    // public static void main(String[] args) 
    // {
    //     //call instance method using object
    //     HM17 darshu = new HM17(); // create object of class 

    //     int max = darshu.maxOfThree(40, 20, 5);
    //     System.out.println("Instance max of three numbers: "+ max); //40
    // }
//----------------------------------------------------------------------------------------------------------------------
    // // 5) count number of digits in a number (static using)
    // static int countDigits(int n) 
    // {
    //     int count = 0;
    //     while(n!=0)
    //     {
    //         n = n/10;
    //         count++;
    //     }
    //     return count;
    // }
    // public static void main(String[] args) 
    // {
    //     //call static method using class name
    //     int count = countDigits(12345);
    //     System.out.println("Static count of digits: "+ count); //5
    // }


    // // 5.1) count number of digits in a number (instance using)
    // int countDigits(int n) 
    // {
    //     int count = 0;
    //     while(n!=0)
    //     {
    //         n = n/10;
    //         count++;
    //     }
    //     return count;
    // }
    // public static void main(String[] args) 
    // {
    //     //call instance method using object
    //     HM17 darshu = new HM17(); // create object of class

    //     int count = darshu.countDigits(12345);
    // //     System.out.println("Instance count of digits: "+ count); //5
    // }
//----------------------------------------------------------------------------------------------------------------------
    // // 6) palindrome number check (static using)
    // static boolean isPalindrome(int n)
    // {
    //     int original = n; // store the original number
    //     int reverse = 0; // store the reverse number
    //     while(n!=0) // loop until n becomes 0
    //     {
    //         int digit = n % 10;      // get the last digit
    //         reverse = reverse * 10 + digit; // append the digit to reverse
    //         n = n / 10; // remove the last digit from n
    //     }
    //     return original == reverse; // check if original number is equal to reverse number
    // }
    // public static void main(String[] args) 
    // {

    //     //call static method using class name
    //     // int number = 12321;  //hard code

    //     //using scanner
    //     System.err.println("enter a number: ");
    //     Scanner sc = new Scanner(System.in); // create object
    //     int number = sc.nextInt();

    //     if(isPalindrome(number))
    //         System.out.println(number+" is a palindrome number");
    //     else
    //         System.out.println(number+" is not a palindrome number");
        
    // }


    // // 6.1) palindrome number check (instance using)
    // void isPalindrome(int n)
    // {
    //     int original = n; // store the original number
    //     int reverse = 0; // store the reverse number
    //     while(n != 0) // loop until n becomes 0 
    //     {
    //         int digit = n % 10;      // get the last digit
    //         reverse = reverse * 10 + digit; // append the digit to reverse
    //         n = n / 10; // remove the last digit from n
    //     }
    //     //return original == reverse; // check if original number is equal to reverse number
    
    //     if(original==reverse)
    //         System.out.println( " is a palindrome number");
    //     else
    //         System.out.println( " is not a palindrome number");
    // }

    // public static void main(String[] args) 
    //     {
    //         //call instance method using object
    //         HM17 darshu = new HM17(); // create object of class 
    //         System.err.println("enter a number: ");

    //         Scanner sc = new Scanner(System.in); // create object
    //         int n = sc.nextInt();

    //         darshu.isPalindrome(n);
    //     }
}
//----------------------------------------------------------------------------------------------------------------------

