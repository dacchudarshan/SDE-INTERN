public class OneObject 
{
    //1). no args no return type
    void greet()
    {
        System.err.println("Hello darshan");
    }

    // 2). no args but no return type
    void printSum(int a, int b)
    {
        System.err.println("sum: "+ (a+b));
    }

    // 3). no args but return type
    int getNumber()
    {
        return 100;
    }

    // 4). args and return type
    int max(int x, int y)
    {
        if (x>y)
            return x;
        else
            return y;
    }
    
    public static void main(String[] args) 
    {
        // one object can call all the methods of the class.
        //object 1
        OneObject darshu = new OneObject();
        darshu.greet();

        //object 2
        darshu.printSum(10, 20);

        // object 3
        int sum = darshu.getNumber();
        System.err.println("sum: "+ sum);

        //object 4
        int maximum = darshu.max(25, 30);
        System.err.println("maximum: "+ maximum);
    
    }
    
}
