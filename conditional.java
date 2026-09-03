import java.util.*;
public class conditional 
{
    public static void main(String[] args) 
    {
//     //     Scanner sc = new Scanner(System.in);

//     //     System.out.print("Enter your age: ");
//     //     int age = sc.nextInt();

//     //     if (age == 18)
//     //     {
//     //         System.out.println("Eligible to vote");
//     //     }
//     //     else if (age < 18 && age > 0)
//     //     {
//     //         System.out.println("not eligible to vote");
//     //     }
//     //     else
//     //     {
//     //         System.out.println("child is not eligible to vote");
//     //     }
//     //    sc.close();

//         //     Scanner sc = new Scanner(System.in);

//         //     System.out.print("Enter your age: ");
//         //     int age = sc.nextInt();

//         //     System.out.print("Are you a citizen?:yes/no: ");
//         //     boolean citizen = sc.nextBoolean();
            
//         //     if (age >= 18)
//         //     {
//         //         if (citizen)
//         //         {
//         //             System.out.println("Eligible to vote");
//         //         }
//         //         else
//         //         {

//         //             System.out.println("Not eligible to vote");
//         //         }
//         //     }
//         //     else
//         //     {
//         //         System.out.println("Child is not eligible to vote");
//         // }
// {
//     public static void main(String[] args) 
//     
//     // switch case
            
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you day of the week (1-7): ");
        int day = sc.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}

// class conditional 
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your age: ");
//         int age = sc.nextInt();

//         String result = (age >= 18) ? "YES" : "NO";

//         switch (result)
//         {
//             case "YES":
//                 System.out.println("You are eligible to vote.");
//                 break;
//             case "NO":
//                 System.out.println("You are not eligible to vote.");
//                 break;
//         }
//     }
// }

// class conditional 
// {
//     public static void main(String[] args) 
//     {
//         System.out.println("combine the conditions : ");

//         int age = 25;
//         boolean citizen = true;

//         if (age >= 18 && citizen)
//         {
//             System.out.println("Eligible to vote");
//         }
//         else
//         {
//             System.out.println("Not eligible to vote");
//         }
//     }
// }
