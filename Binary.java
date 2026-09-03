// public class floa
// {
//     public static void main(String[]args)
//     {
//         float a = 20.5f;
//         float b = 3.5f;

//         System.err.println("values: "+a%b);

//         double c = 20.5f;
//         double d = 3.5f;

//         System.err.println("values: "+a%b);

//         int e= 20;
//         int f = 5;

//         System.err.println("values: "+e%f);


//     }
    
// }


public class Binary
{
    public static void main(String[] args)
    {
        double num = 8.1;

        System.out.println("Decimal: " + num);
        System.out.println("Binary: " + Long.toBinaryString(Double.doubleToRawLongBits(num)));
    }
}