public class ways 
{
    //1). no args no return type
    static void greet()
    {
        System.err.println("Hello darshan");
    }

    // 2). no args but no return type
    static void printSum(int a, int b)
    {
        System.err.println("sum: "+ (a+b));
    }

    // 3). no args but return type
    static int getNumber()
    {
        return 100;
    }

    // 4). args and return type
    static int max(int x, int y)
    {
        if (x>y)
            return x;
        else
            return y;
    }

    public static void main(String[] args) 
    {
        //1) 
        greet();

        //2)
        printSum(10, 20);

        //3)
        int sum = getNumber();
        System.err.println("sum: "+ sum);

        //4)
        int maximum = max(25, 30);
        System.err.println("maximum: "+ maximum);
      
    }
}
