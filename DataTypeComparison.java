public class DataTypeComparison
{
    public static void main(String[] args) 
    {
        byte b  = 10;               
        short s = 20;              
        int i = 30;                 
        long l = 40L;               
        float f = 50.5f;           
        double d = 60.5;            
        char c = 65; // 'A'= 65 in both ASCII & Unicode value   

        // 1. byte compared with all

        System.out.println("");

        System.out.println("=====BYTE + ALL=====");

        System.out.println("byte + short   = " + (b + s));
        System.out.println("byte + int     = " + (b + i));
        System.out.println("byte + long    = " + (b + l));
        System.out.println("byte + float   = " + (b + f));
        System.out.println("byte + double  = " + (b + d));
        System.out.println("byte + char    = " + (b + c));
        
        System.out.println("COMPLETED BYTE WITH ALL SUCCESSFULLY");

        System.out.println(" ");

        // 2. short compared with all

        System.out.println("=====SHORT + ALL=====");

        System.out.println("short + byte   = " + (s + b));
        System.out.println("short + int    = " + (s + i));
        System.out.println("short + long   = " + (s + l));
        System.out.println("short + float  = " + (s + f));
        System.out.println("short + double = " + (s + d));
        System.out.println("short + char   = " + (s + c));

        System.out.println("COMPLETED SHORT WITH ALL SUCCESSFULLY");

        System.out.println("");

        // 3. int compared with all

        System.out.println("=====INT + ALL=====");

        System.out.println("int + byte     = " + (i + b));
        System.out.println("int + short    = " + (i + s));
        System.out.println("int + long     = " + (i + l));
        System.out.println("int + float    = " + (i + f));
        System.out.println("int + double   = " + (i + d));
        System.out.println("int + char     = " + (i + c));

        System.out.println("COMPLETED INT WITH ALL SUCCESSFULLY");

        System.out.println("");

        // 4. long compared with all

        System.out.println("=====LONG + ALL=====");

        System.out.println("long + byte    = " + (l + b));
        System.out.println("long + short   = " + (l + s));
        System.out.println("long + int     = " + (l + i));
        System.out.println("long + float   = " + (l + f));
        System.out.println("long + double  = " + (l + d));
        System.out.println("long + char    = " + (l + c));

        System.out.println("COMPLETED LONG WITH ALL SUCCESSFULLY");

        System.out.println("");

        // 5. float compared with all

        System.out.println("=====FLOAT + ALL=====");

        System.out.println("float + byte   = " + (f + b));
        System.out.println("float + short  = " + (f + s));
        System.out.println("float + int    = " + (f + i));
        System.out.println("float + long   = " + (f + l));
        System.out.println("float + double = " + (f + d));
        System.out.println("float + char   = " + (f + c));

        System.out.println("COMPLETED FLOAT WITH ALL SUCCESSFULLY");

        System.out.println("");

        // 6. double compared with all

        System.out.println("=====DOUBLE + ALL=====");

        System.out.println("double + byte  = " + (d + b));
        System.out.println("double + short = " + (d + s));
        System.out.println("double + int   = " + (d + i));
        System.out.println("double + long  = " + (d + l));
        System.out.println("double + float = " + (d + f));
        System.out.println("double + char  = " + (d + c));

        System.out.println("COMPLETED DOUBLE WITH ALL SUCCESSFULLY");

        System.out.println("");

        // 7. char compared with all

        System.out.println("=====CHAR + ALL=====");

        System.out.println("char + byte    = " + (c + b));
        System.out.println("char + short   = " + (c + s));
        System.out.println("char + int     = " + (c + i));
        System.out.println("char + long    = " + (c + l));
        System.out.println("char + float   = " + (c + f));
        System.out.println("char + double  = " + (c + d));
        
        System.out.println("COMPLETED CHAR WITH ALL SUCCESSFULLY");
    }
}