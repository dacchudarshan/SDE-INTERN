public class methods 
{
    // static void display()
    // {
    //     System.err.println("hello darshan");
    // }
    // public static void main(String[]args)
    // {
    //     display();
    // }


    // demo of non void return type
    static int max(int x,int y) //a=10, b=15. recive data - formal parameter
    {

        System.err.println("x: "+ x);
        System.err.println("y: "+ y);
        if(x>y)
            return x;
        else
            return y;

        // scope checking - local variable
        // System.err.println(a); // a is not defined in this scope

    }
    public static void main(String[] args) 
    {
        int a = 10, b = 15;  // x = 10, y = 15 -- parameter passing - send data
        // calling the method 
        int result = max (a,b);
        // System.err.println(x); // x is not defined in this scope
        System.err.println("max value is: "+ result);
    }
}
