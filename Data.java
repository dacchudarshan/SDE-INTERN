/*public class days 
{
    public static void main(String[] args) {
        {
            System.out.println(25);
            System.out.println(3.14);
            System.out.println("A");
            System.err.println("hello");
            System.err.println(3.142857);
            System.err.println("null");
            System.err.println("true");
        }
    }
}*/
// why variable even though we can print value directly 
//because for feature use if i want you change data then i cant change all the 100 entires so we need variable then below is the code demonsatrate 
/*public class days
{
    public static void main(String[] args) 
    {
        int age = 3;
        System.out.println(age);
        System.out.println(age);
        System.out.println(age);
        System.out.println(age);
        System.out.println(age);
        System.out.println(age);
        System.out.println(age);
        System.out.println(age);
    }
}*/
// integer types can be represented in diff number systems
/*class days
{
    public static void main(String[] args) 
    {
        byte b1 = 10; // decimal value
        byte b2 = 0b1010; // binary value
        byte b3 = 012; // octal value
        byte b4 = 0xA; // hexadecimal value

        System.out.println(b1+"\n"+b2+"\n"+b3+"\n"+b4);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

    }   
}*/
// java demonstrates the use of diff number system 
public class Data 
{
    static byte a; // decimal value
    static short b; // binary value
    static int c; // octal value
    static long d; // hexadecimal value
    static float e; // decimal value
    static double f; // binary value
    static char g; // octal value
    static boolean h; // hexadecimal value

    public static void main(String[] args) {

        System.out.println("========Data Types in Java:=========");
        System.out.println("byte    = " + a);
        System.out.println("short   = " + b);
        System.out.println("int     = " + c);
        System.out.println("long    = " + d);
        System.out.println("float   = " + e);
        System.out.println("double  = " + f);
        System.out.println("char    = " + (int)g);
        System.out.println("boolean = " + h);
    }
}