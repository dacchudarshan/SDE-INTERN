public class ObjectForEach 
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
        //object 1
        ObjectForEach obj1 = new ObjectForEach();
        obj1.greet();

        //object 2
        ObjectForEach obj2 = new ObjectForEach();
        obj2.printSum(10, 20);

        //object 3
        ObjectForEach obj3 = new ObjectForEach();
        int sum = obj3.getNumber();
        System.err.println("sum: "+ sum);

        //object 4
        ObjectForEach obj4 = new ObjectForEach();
        int maximum = obj4.max(25, 30);
        System.err.println("maximum: "+ maximum);
    }    

}

