import java.util.Scanner;
public class EvenOdd 
{
    // // even or odd number (static using) statice void
    // static void EvenOdd(int a)
    // {
    //     if(a%2==0)
    //         System.out.println(a+" is even number");
    //     else
    //         System.out.println(a+" is odd number");
    // }   


    // public static void main(String[] args) 
    // {
    //    Scanner sc = new Scanner(System.in);
    //    System.out.println("Enter a number: ");
    //    int a = sc.nextInt();

    //    EvenOdd(a);
  
    // }

    
    // // even or odd number (void return type) instance using
    
    // static boolean EvenOdd(int a)
    // {
    //     return a%2==0; //true or false
    // }

    // public static void main(String[] args) 
    // {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a number: ");
    //     int a = sc.nextInt();

    //     boolean isEven = EvenOdd(a);

    //     //printing the result
    //     if(isEven)//true

    //         System.out.println(a+" is even number");
    //     else
    //         System.out.println(a+" is odd number");
    // }



    // instance method using
    void checkEvenOdd(int a)
    {
        if(a%2==0)
            System.out.println(a+" is even number");
        else
            System.out.println(a+" is odd number");
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        EvenOdd darshu = new EvenOdd(); //create object of class

        darshu.checkEvenOdd(n);
    }
}
