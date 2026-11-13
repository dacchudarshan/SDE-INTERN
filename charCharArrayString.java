//-----------------------------------------------------------------------------------------------
// task 1
// create char array of size 5
// dont initinlize anything 
// //print default values

// task 2
// create & initialize char array
// //print those char

// task 3
//find length of char array
//create and get the length

// task 4
// demostrate ascii values stored as charecters
// char[] temp = {65, 66, 67, 68, 69};
// print temp[i];

//task 5
//demonstrate partial initialization of char array

//task 6
//String name = "Darshan"
//print name 
//print length 

//task 7
// A -> B 

//task 8
// B -> A

//task 9 (capital to small)
// A -> a

//task 10 (small to capital)
// a -> A

//task 11
// given char is upper case

//questions
// 1) print charcter at even indices (char ,string) input = {JAVA} output = {J, V}
// 2) print middle character if the string length is odd otherwise print two middle characters

//extra question practice (date: 13/11/2026)
//1) print odd indices character (char , string)
//2) print ASCII values of digits from 0 to 9 (char , string)
//3) count vowels (char , string)
//4) count uppper case letters (char , string)
//5) count digits (char , string)
//-----------------------------------------------------------------------------------------------

//using methods to perform all the above tasks
class charCharArrayString
{
    //task 1
    public static void printDefaultValues() 
    {
        char[] charArray = new char[5];
        for (int i = 0; i < charArray.length; i++) 
            {
            System.out.println("Default value at index " + i + ": " + charArray[i]);
            }
    }

    //task 2
    public static void printInitializedValues()
    {
        char[] charArray = {'A', 'B', 'C', 'D', 'E'};
        for (int i = 0; i < charArray.length; i++)
        {
            System.out.println("Initialized value at index " + i + ": " + charArray[i]);
        }
    }

    //task 3
    public static void printLength()
    {
        char[] charArray = {'A', 'B', 'C', 'D', 'E'};
        System.out.println("Length of the char array: " + charArray.length);
    }

    //task 4
    public static void printAsciiValues()
    {
        char[] temp = {65, 66, 67, 68, 69};
        for (int i = 0; i < temp.length; i++)
        {
            System.out.println("ASCII value at index " + i + ": " + temp[i]);
        }
    }

    //task 5
    public static void partialInitialization()
    {
        char[] charArray = new char[5];
        charArray[0] = 'A';
        charArray[1] = 'B';

        // The rest of the array will have default values (null characters)
        for (int i = 0; i < charArray.length; i++)
        {
            System.out.println("Value at index " + i + ": " + charArray[i]);
        }
    }

    //task 6
    public static void printStringInfo()
    {
        String name = "Darshan";
        System.out.println("Name: " + name);
        System.out.println("Length of the name: " + name.length());
    }
    //task 7
    public static void convertAToB()
    {
        char ch = 'A';
        ch = (char)(ch + 1); // Convert A to B
        System.out.println("Converted A -> B: " + ch);  //B
    }

    //task 8
    public static void convertBToA()
    {
        char ch = 'B';
        ch = (char)(ch - 1); // Convert B to A
        System.out.println("Converted B -> A: " + ch);  //A
    }

    //task 9
    public static void convertUpperAToLowerCase()
    {
        char ch = 'A';
        ch = (char)(ch + 32); // Convert A to a
        System.out.println("Converted A -> a: " + ch);  //a
    }

    //task 10
    public static void convertLowerAToUpperCase()
    {
        char ch = 'a';
        ch = (char)(ch - 32); // Convert a to A
        System.out.println("Converted a -> A: " + ch);  //A
    }

    //task 11 (is upper case)
    public static void isUpperCase(char ch)
    {
        if (ch >= 'A' && ch <= 'Z') 
        {
            System.out.println(ch + " is an uppercase letter.");
        }
        else
        {
            System.out.println(ch + " is not an uppercase letter.");
        }
    }

    //1.Question character at even indices
    public static void printEvenIndices()
    {
        String temp = "Java";
        System.out.print("Characters at even indices: ");
        for (int i = 0; i < temp.length(); i ++)
        {
           if (i % 2 == 0) 
           {
               System.out.print("\nindex " + i + ": " + temp.charAt(i) + " ");
           }    
        }
        System.out.println();
    }

    // 1.1 Question String at even indices
    public static void printEvenIndicesString(String temp)
    {
        System.out.print("String at even indices: ");
        for (int i = 0; i < temp.length(); i++)
        {
            if (i % 2 == 0)
            {
                System.out.print("\nindex " + i + ": " + temp.charAt(i) + " ");
            }
        }
        System.out.println();
    }

    // 2. Question using character
    public static void printMiddleCharacter(String temp)
    {
        int length = temp.length();
        if (length % 2 == 1) 
        {
            // Odd length, print the middle character
            char middleChar = temp.charAt(length / 2);
            System.out.println("Middle character: " + middleChar);
        } 
        else 
        {
            // Even length, print the two middle characters
            char middleChar1 = temp.charAt((length / 2) - 1);
            char middleChar2 = temp.charAt(length / 2);
            System.out.println("character at middle: " + middleChar1 + ", " + middleChar2);
        }
    }

    //2.1 Question using string
    public static void printMiddleCharacterString(String temp)
    {
        int length = temp.length();
        if (length % 2 == 1)
        {
            // Odd length, print the middle character
            char middleChar = temp.charAt(length / 2);
            System.out.println("Middle character: " + middleChar);
        }
        else
        {
            // Even length, print the two middle characters
            char middleChar1 = temp.charAt((length / 2) - 1);
            char middleChar2 = temp.charAt(length / 2);
            System.out.println("String at middle: " + middleChar1 + ", " + middleChar2);
        }
    }
    public static void main(String[] args)
    {
        printDefaultValues();

        System.out.println();
        printInitializedValues();

        System.out.println();
        printLength();

        System.out.println();
        printAsciiValues();

        System.out.println();
        partialInitialization();

        System.out.println();
        printStringInfo();

        System.out.println();
        convertAToB();

        System.out.println();
        convertBToA();

        System.out.println();
        convertUpperAToLowerCase();

        System.out.println();
        convertLowerAToUpperCase();

        System.out.println();
        isUpperCase('A');

        System.out.println();
        printEvenIndices();

        System.out.println();
        printEvenIndicesString("Java");

        System.out.println();
        printMiddleCharacter("JAVA");

        System.out.println();
        printMiddleCharacterString("JAVA");
    }
}