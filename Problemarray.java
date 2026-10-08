import java.util.Scanner;

public class Problemarray
{

    static void getComparisonOfNumbers(int arrary[], int key)

    {
        if (arrary.length == 0)
        {
            System.out.println("The array is empty");
            return;
        }   
        else
        {
            for(int index = 0; index < arrary.length; index++)
            {
                if(key > arrary[index])
                {
                System.out.println(key + " > " + arrary[index]);
                }
                else if(key < arrary[index])
                {
                System.out.println(key + " < " + arrary[index]);
                }
                else
                {
                System.out.println(key + " = " + arrary[index]);
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        int arrary [] = {20, 10, 30, 50, 40};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key: ");
        int key = sc.nextInt();

        getComparisonOfNumbers(arrary, key);
    }
    
}
