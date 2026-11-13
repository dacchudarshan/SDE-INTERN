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
    }
}