public class instamethod 
{
    // demo of instance method  (create object access instance method)

    int max(int x, int y) // instance method
    {
        if (x>y) // compare two numbers x = 10, y = 20
            return x; // return x = 10
        else
            return y;// return y = 20
    }  

    // Method to display values
    public static void main(String[] args) 
    {
        int a = 10, b = 20;
        instamethod m = new instamethod();

        int c = m.max(a, b); // calling instance method using object
        System.err.println("maximum: "+ c); // maximum: 20

    }
}
