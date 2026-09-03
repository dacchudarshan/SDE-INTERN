import java.util.Scanner;
class sunday
{
    public static void main(String[] args)
    {
        String day = "sunday";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day: ");
        day = sc.nextLine();

        switch (day) 
        {
            case "sunday":
                System.out.println("Today is Sunday.");
                break;
            default:
                System.out.println("Today is not Sunday.");
        }
    }
 }

// login check 
// import java.util.Scanner;
// class login
// {
//     public static void main(String[] args)
//     {
//         String username = "admin";
//         String password = "password123";

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter username: ");
//         String inputUsername = sc.nextLine();

//         System.out.print("Enter password: ");
//         String inputPassword = sc.nextLine();

//         if (inputUsername.equals(username) && inputPassword.equals(password)) 
//         {
//             System.out.println("Login successful darshan !");
//         } 
//         else 
//         {
//             System.out.println("Invalid username & password darshan.");
//         }
//     }
// }