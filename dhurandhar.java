public class dhurandhar
{
    public static void print(char[] message)
    {
        for(char ch : message)
        {
            System.out.print(ch);
        }
    }

    //vowels replace *
    public static void encriptionv1(char[] message)
    {
        for(int i = 0; i < message.length; i++)
        {
            if( message[i] == 'a' || message[i] == 'e' ||
                message[i] == 'i' ||message[i] == 'o' ||
                message[i] == 'u' || message[i] == 'A'||
                message[i] == 'E' || message[i] == 'I' ||
                message[i] == 'O'|| message[i] == 'U')
            {
                message[i] = '*';
            }
        }
    }
    
    // encription method
    public static void encriptionv2(char[] message)
    {
        for(int i = 0; i < message.length; i++)
        {
        
            
        }
    }
    // description method
    public static void description(char[] message)
    {
        for(int i = 0; i < message.length; i++)
        {
            if(message[i] == '*')
            {
                message[i] = 'q';
            }
        }
    }

    //encripted
    static String encrypt(String message)
    {
        String result = "";

        for (int i = 0; i < message.length(); i++)
        {
            char ch = message.charAt(i);
            result = result + (char)(ch + 3);
        }

        return result;
    }
    //decripted
    static String decrypt(String message)
    {
        String result = "";

        for (int i = 0; i < message.length(); i++)
        {
            char ch = message.charAt(i);
            result = result + (char)(ch - 3);
        }

        return result;
    }

    //print array
    public static void printArray(char[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]);
        }
    }

    public static void main(String[] args)
    {
        String msg = "Hi Hamza, How are you?";
        char[] message = msg.toCharArray();

        print(message);

        String encrypted = encrypt(msg);

        String Decripted = decrypt(msg);

        System.err.println("\nEncrypted : " + encrypted);
        System.err.println("Decripted : "+ Decripted);
    }
}
