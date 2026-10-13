import java.util.Arrays;

public class IntegerArrayPractice 
{

    // 1. Count odd and even
    int[] oddEven(int[] arr) 
    {
        int odd = 0, even = 0;
        for (int n : arr) 
            {
            if (n % 2 == 0) even++;
            else odd++;
            }
        return new int[]{odd, even};
    }

    // 2. Average marks
    double average(int[] arr) 
    {
        int sum = 0;
        for (int n : arr) sum += n;
        return (double) sum / arr.length;
    }

    // 3. Numbers greater than 50 and less than 100
    int[] filterNumbers(int[] arr) 
    {
        int count = 0;
        for (int n : arr)
            if (n > 50 && n < 100) count++;

        int[] result = new int[count];
        int i = 0;
        for (int n : arr)
            if (n > 50 && n < 100) result[i++] = n;

        return result;
    }

    // 4. Difference between largest and smallest
    int difference(int[] arr) 
    {
        int max = arr[0], min = arr[0];
        for (int n : arr) 
            {
            if (n > max) max = n;
            if (n < min) min = n;
            }
        return max - min;
    }

    // 5. Count students who passed
    int countPassed(int[] arr) 
    {
        int count = 0;
        for (int n : arr)
            if (n >= 35) count++;
        return count;
    }

    // 6. Sum at positions 0, 2, 4...
    int evenPositionSum(int[] arr) 
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i += 2)
            sum += arr[i];
        return sum;
    }

    // 7. Count hotter days
    int hotterDays(int[] arr) 
    {
        int count = 0;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > arr[i - 1]) count++;
        return count;
    }

    // 8. Double odd, halve even
    int[] transform(int[] arr) 
    {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            result[i] = arr[i] % 2 == 0
                    ? arr[i] / 2 : arr[i] * 2;
        return result;
    }

    // 9. Count numbers divisible by both 3 and 5
    int divisibleBy3And5(int[] arr) 
    {
        int count = 0;
        for (int n : arr)
            if (n % 3 == 0 && n % 5 == 0) count++;
        return count;
    }

    // 10. Number closest to average
    int closestToAverage(int[] arr) 
    {
        double sum = 0;
        for (int n : arr) sum += n;

        double avg = sum / arr.length;
        int closest = arr[0];

        for (int n : arr)
            if (Math.abs(n - avg) < Math.abs(closest - avg))
                closest = n;

        return closest;
    }

    // 11. Days above 10000 and best steps
    int[] stepCount(int[] arr) 
    {
        int days = 0, best = arr[0];
        for (int n : arr) {
            if (n > 10000) days++;
            if (n > best) best = n;
        }
        return new int[]{days, best};
    }

    // 12. Replace negative numbers with zero
    int[] replaceNegative(int[] arr) 
    {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            result[i] = arr[i] < 0 ? 0 : arr[i];
        return result;
    }

    // 13. Check strictly increasing order
    boolean isIncreasing(int[] arr) 
    {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] <= arr[i - 1]) return false;
        return true;
    }

    // 14. Sum of first and last numbers
    int firstLastSum(int[] arr) 
    {
        return arr[0] + arr[arr.length - 1];
    }

    // 15. 10% discount if total is above 1000
    double amountToPay(int[] arr) 
    {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum > 1000 ? sum * 0.90 : sum;
    }

    // 16. Count palindrome numbers
    int countPalindromes(int[] arr) 
    {
        int count = 0;
        for (int n : arr) {
            int original = n, reverse = 0;
            while (n > 0) 
                {
                reverse = reverse * 10 + n % 10;
                n /= 10;
                }
            if (original == reverse) count++;
        }
        return count;
    }

    // 17. Sum of digits of each number
    int[] digitSum(int[] arr) 
    {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) 
            {
            int n = Math.abs(arr[i]);
            while (n > 0) 
                {
                result[i] += n % 10;
                n /= 10;
                }
            }
        return result;
    }

    public static void main(String[] args) 
    {
        IntegerArrayPractice obj = new IntegerArrayPractice();

        System.out.println("1. " + Arrays.toString(
            obj.oddEven(new int[]{3, 8, 5, 12, 7})));

        System.out.println("2. " +
            obj.average(new int[]{70, 85, 90, 55}));

        System.out.println("3. " + Arrays.toString(
            obj.filterNumbers(new int[]{45, 67, 100, 52, 99, 120, 50})));

        System.out.println("4. " +
            obj.difference(new int[]{14, 3, 27, 9}));

        System.out.println("5. " +
            obj.countPassed(new int[]{40, 22, 35, 90, 18}));

        System.out.println("6. " +
            obj.evenPositionSum(new int[]{10, 3, 20, 7, 30}));

        System.out.println("7. " +
            obj.hotterDays(new int[]{30, 32, 31, 35, 36, 34, 37}));

        System.out.println("8. " + Arrays.toString(
            obj.transform(new int[]{4, 7, 10, 3})));

        System.out.println("9. " +
            obj.divisibleBy3And5(new int[]{15, 9, 30, 10, 45, 7}));

        System.out.println("10. " +
            obj.closestToAverage(new int[]{2, 9, 4, 15}));

        System.out.println("11. " + Arrays.toString(
            obj.stepCount(new int[]{8000, 12000, 10500, 9000, 15000})));

        System.out.println("12. " + Arrays.toString(
            obj.replaceNegative(new int[]{5, -3, 8, -1, 0})));

        System.out.println("13. " +
            obj.isIncreasing(new int[]{2, 5, 9, 14}));

        System.out.println("14. " +
            obj.firstLastSum(new int[]{7, 3, 9, 4}));

        System.out.println("15. " +
            obj.amountToPay(new int[]{400, 350, 450}));

        System.out.println("16. " +
            obj.countPalindromes(new int[]{121, 45, 7, 1331, 80}));

        System.out.println("17. " + Arrays.toString(
            obj.digitSum(new int[]{123, 45, 9})));
    }
}