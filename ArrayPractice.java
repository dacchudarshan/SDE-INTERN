public class ArrayPractice
{
    // 1. Find the average of elements
    void average()
    {
        int arr[] = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int i : arr)
        {
            sum = sum + i;
        }

        double avg = (double) sum / arr.length;

        System.out.println("1. Average = " + avg);
    }


    // 2. Count +, - and 0 elements
    void countElements()
    {
        int arr[] = {10, -5, 0, 20, -10, 0, 30};

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i : arr)
        {
            if (i > 0)
            {
                positive++;
            }
            else if (i < 0)
            {
                negative++;
            }
            else
            {
                zero++;
            }
        }

        System.out.println("2. Positive = " + positive);
        System.out.println("   Negative = " + negative);
        System.out.println("   Zero = " + zero);
    }


    // 3. Count how many times a given number occurs
    void countNumber()
    {
        int arr[] = {10, 20, 10, 30, 10, 40, 10};

        int number = 10;
        int count = 0;

        for (int i : arr)
        {
            if (i == number)
            {
                count++;
            }
        }

        System.out.println("3. " + number + " occurs " + count + " times");
    }


    // 4. Print elements divisible by 3
    void divisibleBy3()
    {
        int arr[] = {10, 12, 15, 20, 21, 25, 30};

        System.out.print("4. Divisible by 3: ");

        for (int i : arr)
        {
            if (i % 3 == 0)
            {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }


    // 5. Find second largest using for-each
    void secondLargest()
    {
        int arr[] = {10, 50, 30, 80, 60};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i : arr)
        {
            if (i > largest)
            {
                second = largest;
                largest = i;
            }
            else if (i > second && i != largest)
            {
                second = i;
            }
        }

        System.out.println("5. Second Largest = " + second);
    }


    public static void main(String[] args)
    {
        // Create object
        ArrayPractice obj = new ArrayPractice();

        // Call instance methods
        obj.average();
        obj.countElements();
        obj.countNumber();
        obj.divisibleBy3();
        obj.secondLargest();
    }
}
