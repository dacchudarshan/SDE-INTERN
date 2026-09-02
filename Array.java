import java.util.Arrays;

public class Array 
{
    public static void main(String[]args)
    {
       // int arr[5]; wrong
    //    int arr[]= new int[5];

    //    System.err.println("arr: "+arr); // hash value
    //    System.err.println("arr: "+Arrays.toString(arr));// defeault value 00

       int arr1[] = {10, 20 ,30};

       System.err.println("arr: "+arr1); // hash value
       System.err.println("arr: "+Arrays.toString(arr1));// defeault value 00


        int arr2[] =  new int[]{11, 2 ,5};

       System.err.println("arr: "+arr2); // hash value
       System.err.println("arr: "+Arrays.toString(arr2));// defeault value 00


    }
    
}


class Array1
{
    static void A()
    {
        B();
    }
    static void B()
    {
        C();
    }
    static void C()
    {
        System.err.println("hello");
    }
    public static void main(String[] args) 
    {
       A();
    }

}


class operators
{
    public static void main(String[] args)
    {
        System.err.println("");
        int a = 10;
        int b = 20;
        int c = 30;

        System.err.println("operators: "+ a);
        System.err.println("operators: "+ b);
        System.err.println("operators: "+ c);

        System.err.println();

        System.err.println("Arithmatic operator: ");

        System.err.println("Addition: "      +(a+b));
        System.err.println("Subtraction: "   +(a-b));
        System.err.println("Multiplication: "+(a*b));
        System.err.println("Division: "      +a/b);
        System.err.println("Modulus: "       +a%b);
     
        System.err.println();

        //multiple operators
        int number1 = (10+5*2);
        int number2 = ((10+5)*2);
        int number3 = (20-5+2);
        int number4 = ((20)-5+2);

        System.err.println("Precdence: ");
        System.err.println("Number1: "+ number1); 
        System.err.println("Number1: "+ number2);
        System.err.println("Number1: "+ number3);
        System.err.println("Number1: "+ number4);


        // Boolean operations
        System.err.println("");

        System.err.println("boolean Operation: ");

        boolean x = true;
        boolean y = false;

        // System.out.println(" : " +   (x * y));
        // System.out.println(": " +    ( x + y));
        // System.out.println(" : " + (x-y));
        // System.out.println(" : " + (x/y));
        // System.out.println(" : " + (x%y));

        // Float to int

        System.err.println("");

        System.err.println("float convert int: ");

        float f = 25.75f;
        int i = (int) f;

        System.out.println("Float: " + f);
        System.out.println("Float to Int: " + i);

        // Unary Operators
        System.err.println(""); 

        System.err.println("Unary values:");

        System.out.println("Unary +a : " + (+a));
        System.out.println("Unary -a : " + (-a));
        System.out.println("++a      : " + (++a));
        System.out.println("--b      : " + (--b));

        // Binary Operators

        System.err.println("");

        System.err.println("Binary values:");

        System.out.println("a + b    : " + (a + b));
        System.out.println("b - c    : " + (b - c));
        System.out.println("a * c    : " + (a * c));
        System.out.println("c / a    : " + (c / a));
        System.out.println("c % a    : " + (c % a));
    }

    
}