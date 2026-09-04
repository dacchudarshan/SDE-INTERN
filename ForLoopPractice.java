public class ForLoopPractice 
{

    public static void main(String[] args) 
    {

        // 1) Incrementing by 3
        System.out.println("1) Incrementing by 3:");

        for (int i = 1; i <= 20; i = i + 3) {
            System.out.println(i);
        }


        // 2) Decrementing by 5
        System.out.println("\n2) Decrementing by 5:");

        for (int i = 50; i >= 1; i = i - 5) {
            System.out.println(i);
        }


        // 3) Reverse alphabet
        System.out.println("\n3) Reverse Alphabet:");

        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.println(ch);
        }


        // 4) Print 1 to 100
        System.out.println("\n4) Print 1 to 100:");

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }


        // 5) Print multiples of 5
        System.out.println("\n5) Multiples of 5:");

        for (int i = 5; i <= 100; i = i + 5) {
            System.out.println(i);
        }


        // 6) Square of numbers 1 to 10
        System.out.println("\n6) Square of numbers 1 to 10:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + i + " = " + (i * i));
        }


        // 7) Cube of numbers 1 to 10
        System.out.println("\n7) Cube of numbers 1 to 10:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + i + " * " + i + " = " + (i * i * i));
        }


        // 8) Sum of first N numbers
        System.out.println("\n8) Sum of first N numbers:");

        int n = 10;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }
}