<<<<<<< Updated upstream
// extra memory using 3 number
public class SwapNumbers 
{
    public static void main(String[] args) 
    {
        System.err.println("Before swalppping : ");
        int a = 10;
        int b = 20;
        int c = 30;
=======

>>>>>>> Stashed changes

        System.err.println("a: "+a);
        System.err.println("b: "+b);
        System.err.println("c: "+c);

<<<<<<< Updated upstream
        System.out.println("Ofter Swapiing: " );
=======
//         System.out.println("After swapping: " );
>>>>>>> Stashed changes
        
        int temp = a;

        a = b;
        b = c;
        c = temp;

        System.err.println("a: "+a);
        System.err.println("b: "+b);
        System.err.println("c: "+c);
    }
}

<<<<<<< Updated upstream
without extra memory 3 number 
public class SwapNumbers 
{
    public static void main(String[] args) 
    {
        System.err.println("Before swalppping : ");
=======
// without extra memory 3 number 
// public class SwapNumbers 
// {
//     public static void main(String[] args) 
//     {
//         System.err.println("Before swapping: ");
>>>>>>> Stashed changes

        int a = 10;
        int b = 20;
        int c = 30;

        System.err.println("a: "+a);
        System.err.println("b: "+b);
        System.err.println("c: "+c);

<<<<<<< Updated upstream
        System.out.println("Ofter Swapiing: " );
=======
//         System.out.println("After swapping: " );
>>>>>>> Stashed changes
        
        a = a + b + c;
        c = a - b - c;
        b = a - b - c;
        a = a - b - c;

        System.err.println("a: "+a);
        System.err.println("b: "+b);
        System.err.println("c: "+c);
    }
}

// four number swapping with extra memory

<<<<<<< Updated upstream
public class SwapNumbers 
{
    public static void main(String[] args) 
    {
        System.err.println("Before swalppping : ");
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.err.println("a: "+a);
        System.err.println("b: "+b);
        System.err.println("c: "+c);
        System.err.println("c: "+d);

        System.out.println("Ofter Swapiing: " );
=======
// public class SwapNumbers 
// {
//     public static void main(String[] args) 
//     {
//         System.err.println("Before swapping: ");
//         int a = 10;
//         int b = 20;
//         int c = 30;
//         int d = 40;

//         System.err.println("a: "+a);
//         System.err.println("b: "+b);
//         System.err.println("c: "+c);
//         System.err.println("d: "+d);

//         System.out.println("After swapping: " );
>>>>>>> Stashed changes
        
        int temp = a;

        a = b;
        b = c;
        c = d;
        d = temp;

<<<<<<< Updated upstream
        System.err.println("a: "+a);
        System.err.println("b: "+b);
        System.err.println("c: "+c);
        System.err.println("c: "+d);
    }
}
=======
//         System.err.println("a: "+a);
//         System.err.println("b: "+b);
//         System.err.println("c: "+c);
//         System.err.println("d: "+d);
//     }
// }
>>>>>>> Stashed changes

// Without extra memory using 4 number 

public class SwapNumbers 
{
    public static void main(String[] args) 
    {
        System.err.println("Before swapping: ");
        int a = 8;
        int b = 15;
        int c = 9;
        int d = 100;

        System.err.println("a: "+a);
        System.err.println("b: "+b);
        System.err.println("c: "+c);
        System.err.println("d: "+d);
        System.out.println("After swapping: " );
        
        a = a + b + c + d;
        d = a - b - c - d;
        c = a - b - c - d;
        b = a - b - c - d;
        a = a - b - c - d;

        System.err.println("a: "+a);
        System.err.println("b: "+b);
        System.err.println("c: "+c);
        System.err.println("d: "+d);
    }
}
