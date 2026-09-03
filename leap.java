import java.util.Scanner;
//  Check the given number system
public class leap 
{
    
    public static void main(String[] args) 
    {

        System.err.println("1. Check the given number system: ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.next();

        if (num.matches("[01]+")) {
            System.out.println("Binary");
        }
        else if (num.matches("[0-7]+")) {
            System.out.println("Octal");
        }
        else if (num.matches("[0-9]+")) {
            System.out.println("Decimal");
        }
        else if (num.matches("[0-9A-Fa-f]+")) {
            System.out.println("Hexadecimal");
        }
        else {
            System.out.println("Invalid number");
        }

        sc.close();
    }
}
    
// }


//Check whether a year is a Leap Year using Nested if
// class Leapyear 
// {
//     public static void main(String[] args) 
//     {
//         System.err.println("2. Check whether a year is a Leap Year using Nested if: ");
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter year: ");
//         int year = sc.nextInt();

//         if (year % 4 == 0) {

//             if (year % 100 == 0) 
//                 {

//                 if (year % 400 == 0) 
//                 {
//                     System.out.println(year + " is a Leap Year");
//                 }
//                 else 
//                 {
//                     System.out.println(year + " is Not a Leap Year");
//                 }

//                 }
//                  else 
//                 {
//                     System.out.println(year + " is a Leap Year");
//                 }

//                 }
//                 else 
//                 {
//                     System.out.println(year + " is Not a Leap Year");
//                 }

//                 sc.close();
//     }
// }

//Given two strings, check whether they contain the same characters with the 
//same count, but the order can be different.

// class AnagramCheck 
// {
//     public static void main(String[] args)
//     {
//         System.err.println("3. question is about Anagrams: ");
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first string: ");
//         String str1 = sc.nextLine();

//         System.out.print("Enter second string: ");
//         String str2 = sc.nextLine();

//         if (str1.length() != str2.length()) 
//             {
//             System.out.println("They are not same");
//             }
        
//             else 
//             {

//             char[] a = str1.toCharArray();
//             char[] b = str2.toCharArray();

//             java.util.Arrays.sort(a);
//             java.util.Arrays.sort(b);

//             if (java.util.Arrays.equals(a, b)) 
//                 {
//                 System.out.println("They are same (Anagram)");
//                 }
//             else 
//                 {
//                 System.out.println("They are not same");
//                 }
//             }

//         sc.close();
//     }
// }