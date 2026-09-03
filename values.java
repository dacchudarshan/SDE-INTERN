public class values 
{
    public static void main(String[] args) 
    {
        int num1 = 10;// values
        int num2 = 10;// values 

        //if (num1 == num2) // works for primitive data types
        // if (num.equals(num2)) object invokting 
        {
            System.out.println("Both numbers are equal.");
        } 
        else 
        {
            System.out.println("Numbers are not equal.");
        }
    

        //int day = "saturday"; incompatible types: String cannot be converted to int

        String day = "saturday";
        if (day.equals(day)) // works for objects and strings is class that 
        {
            System.out.println("Today is Saturday.");
        } 
        else 
        {
            System.out.println("Today is not Saturday.");
        }

        if (0)
        {
            System.err.println("hello");
        }
    }    

}
