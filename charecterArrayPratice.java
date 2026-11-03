
class characterArrayPractice 
{

    // 1. Count vowels and consonants
    static int[] countVowelsConsonants(char[] arr) 
    {
        int vowels = 0, consonants = 0;

        if (arr == null) return new int[]{0, 0};

        for (char ch : arr) 
            {
            if (isLetter(ch)) 
                {
                ch = toLower(ch);

                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    // 2. Count occurrences of a character
    static int countCharacter(char[] arr, char target) 
    {
        int count = 0;

        if (arr == null) return 0;

        for (char ch : arr) 
            {
            if (ch == target) count++;
            }
        return count;
    }

    // 3. Convert all letters to capitals
    static char[] toCapitals(char[] arr) 
    {
        if (arr == null) return new char[0];

        char[] result = new char[arr.length];

        for (int i = 0; i < arr.length; i++) 
            {
            char ch = arr[i];

            if (ch >= 'a' && ch <= 'z')
                ch = (char) (ch - 32);

            result[i] = ch;
        }
        return result;
    }

    // 4. Check whether the array contains a digit
    static boolean containsDigit(char[] arr) 
    {
        if (arr == null) return false;

        for (char ch : arr) 
            {
            if (isDigit(ch)) return true;
            }
        return false;
    }

    // 5. Return first and last characters
    static char[] firstAndLast(char[] arr) 
    {
        if (arr == null || arr.length == 0)
            return new char[0];

        if (arr.length == 1)
            return new char[]{arr[0]};

        return new char[]{arr[0], arr[arr.length - 1]};
    }

    // 6. Count capital letters
    static int countCapitals(char[] arr) 
    {
        int count = 0;

        if (arr == null) return 0;

        for (char ch : arr) 
            {
            if (ch >= 'A' && ch <= 'Z')
                count++;
            }
        return count;
    }

    // 7. Password must have at least 8 characters and one digit
    static boolean checkPassword(char[] arr) 
    {
        if (arr == null || arr.length < 8)
            return false;

        for (char ch : arr) 
            {
            if (isDigit(ch)) return true;
            }
        return false;
    }

    // 8. Replace spaces with underscores
    static char[] replaceSpaces(char[] arr) 
    {
        if (arr == null) return new char[0];

        char[] result = new char[arr.length];

        for (int i = 0; i < arr.length; i++) 
            {
            if (arr[i] == ' ')
                result[i] = '_';
            else
                result[i] = arr[i];
            }
        return result;
    }

    // 9. Count words separated by spaces
    static int countWords(char[] arr) 
    {
        int count = 0;
        boolean insideWord = false;

        if (arr == null) return 0;

        for (char ch : arr) 
            {
            if (ch != ' ' && !insideWord) 
            {
                count++;
                insideWord = true;
            } 
            else if (ch == ' ') 
            {
                insideWord = false;
            }
        }
        return count;
    }

    // 10. Return initials in capitals
    static char[] initials(char[] arr) 
    {
        if (arr == null || arr.length == 0)
            return new char[0];

        int count = 0;
        boolean startOfWord = true;

        for (char ch : arr) 
            {
            if (ch == ' ') 
            {
                startOfWord = true;
            }
            else
            {
                if (startOfWord && isLetter(ch))
                    count++;

                startOfWord = false;
            }
        }

        char[] result = new char[count];
        int index = 0;
        startOfWord = true;

        for (char ch : arr) 
            {
            if (ch == ' ') 
                {
                startOfWord = true;
            }
            else 
            {
                if (startOfWord && isLetter(ch)) 
                    {
                    if (ch >= 'a' && ch <= 'z')
                        ch = (char) (ch - 32);

                    result[index++] = ch;
                }
                startOfWord = false;
            }
        }
        return result;
    }

    // 11. Remove all vowels
    static char[] removeVowels(char[] arr) 
    {
        if (arr == null) return new char[0];

        int count = 0;

        for (char ch : arr) 
            {
            if (!isVowel(ch)) count++;
            }

        char[] result = new char[count];
        int index = 0;

        for (char ch : arr) 
            {
            if (!isVowel(ch))
                result[index++] = ch;
            }
        return result;
    }

    // 12. Find the alphabetically last letter
    static char lastAlphabetical(char[] arr) 
    {
        if (arr == null || arr.length == 0)
            return '\0';

        char largest = '\0';
        boolean found = false;

        for (char ch : arr) 
            {
            if (isLetter(ch)) 
                {
                ch = toLower(ch);

                if (!found || ch > largest) 
                    {
                    largest = ch;
                    found = true;
                    }
                }
            }   
        return largest;
    }

    // 13. Count students who got grade A
    static int countGradeA(char[] arr) 
    {
        int count = 0;

        if (arr == null) return 0;

        for (char ch : arr) 
        {
            if (ch == 'A') count++;
        }
        return count;
    }

    // 14. Sum all digit characters
    static int sumDigits(char[] arr) 
    {
        int sum = 0;

        if (arr == null) return 0;

        for (char ch : arr) 
        {
            if (isDigit(ch))
                sum += ch - '0';
        }
        return sum;
    }

    // 15. Count red, green and yellow signals
    static int[] countSignals(char[] arr) 
    {
        int red = 0, green = 0, yellow = 0;

        if (arr == null) return new int[]{0, 0, 0};

        for (char ch : arr) 
        {
            if (ch == 'R')
                red++;
            else if (ch == 'G')
                green++;
            else if (ch == 'Y')
                yellow++;
        }
        return new int[]{red, green, yellow};
    }

    // 16. Check a 10-digit mobile number
    static boolean checkMobile(char[] arr) 
    {
        if (arr == null || arr.length != 10)
            return false;

        for (char ch : arr) 
        {
            if (!isDigit(ch))
                return false;
        }
        return true;
    }

    // 17. Move each letter one step forward
    static char[] nextLetters(char[] arr) 
    {
        if (arr == null) return new char[0];

        char[] result = new char[arr.length];

        for (int i = 0; i < arr.length; i++) 
        {
            char ch = arr[i];

            if (ch >= 'a' && ch < 'z')
                ch++;
            else if (ch == 'z')
                ch = 'a';
            else if (ch >= 'A' && ch < 'Z')
                ch++;
            else if (ch == 'Z')
                ch = 'A';

            result[i] = ch;
        }
        return result;
    }

    // 18. Return indexes where a character appears
    static int[] findPositions(char[] arr, char target) 
    {
        if (arr == null) return new int[0];

        int count = 0;

        for (char ch : arr) {
            if (ch == target) count++;
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == target)
                result[index++] = i;
        }
        return result;
    }

    // Helper methods
    static boolean isDigit(char ch) 
    {
        return ch >= '0' && ch <= '9';
    }

    static boolean isLetter(char ch) 
    {
        return (ch >= 'a' && ch <= 'z')
                || (ch >= 'A' && ch <= 'Z');
    }

    static char toLower(char ch) 
    {
        if (ch >= 'A' && ch <= 'Z')
            return (char) (ch + 32);

        return ch;
    }

    static boolean isVowel(char ch) 
    {
        ch = toLower(ch);

        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }

    // Print arrays without importing any library
    static void printChars(char[] arr) 
    {
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print("'" + arr[i] + "'");

            if (i < arr.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    static void printInts(int[] arr) 
    {
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]);

            if (i < arr.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    // Test cases
    public static void main(String[] args) 
    {

        System.out.print("1. Vowels and consonants: ");
        printInts(countVowelsConsonants(new char[]{'a', 'p', 'p', 'l', 'e'}));

        System.out.println("2. Character count: "
            + countCharacter(new char[]{'b', 'a', 'n', 'a', 'n', 'a'}, 'a'));

        System.out.print("3. Capitals: ");
            printChars(toCapitals(new char[]{'c', 'o', 'd', 'e'}));

        System.out.println("4. Contains digit: "
                + containsDigit(new char[]{'p', 'a', 's', 's', '1'}));

        System.out.print("5. First and last: ");
        printChars(firstAndLast(new char[]{'m', 'a', 'n', 'g', 'o'}));

        System.out.println("6. Capital letters: "
                + countCapitals(new char[]{'I', 'n', 'd', 'i', 'a', 'N', 'o', '1'}));

        System.out.println("7. Password valid: "
                + checkPassword(new char[]{'s', 'e', 'c', 'r', 'e', 't', '9', 'x'}));

        System.out.print("8. Replace spaces: ");
        printChars(replaceSpaces(new char[]{'h', 'i', ' ', 't', 'h', 'e', 'r', 'e'}));

        System.out.println("9. Word count: "
                + countWords(new char[]{'I', ' ', 'l', 'o', 'v', 'e', ' ', 'J','a', 'v', 'a'}));

        System.out.print("10. Initials: ");
        printChars(initials(new char[]{'r', 'a', 'h', 'u', 'l', ' ','d', 'r', 'a', 'v', 'i', 'd'}));

        System.out.print("11. Remove vowels: ");
        printChars(removeVowels(new char[]{'p', 'r', 'o', 'g', 'r', 'a', 'm'}));

        System.out.println("12. Last alphabetical letter: "
                + lastAlphabetical(new char[]{'d', 'o', 'g', 's'}));

        System.out.println("13. Grade A count: "
                + countGradeA(new char[]{'A', 'B', 'A', 'C', 'A', 'B'}));

        System.out.println("14. Sum of digits: "
                + sumDigits(new char[]{'a', '3', 'b', '7', '2'}));

        System.out.print("15. Traffic signals: ");
        printInts(countSignals(new char[]{'R', 'G', 'G', 'Y', 'R', 'G'}));

        System.out.println("16. Mobile valid: "
                + checkMobile(new char[]{'9', '8', '4', '5', '0', '1', '2', '3', '4', '5'}));

        System.out.print("17. Next letters: ");
        printChars(nextLetters(new char[]{'c', 'a', 't', 'z'}));

        System.out.print("18. Character positions: ");
        printInts(findPositions(new char[]{'h', 'e', 'l', 'l', 'o'}, 'l'));

        // Extra edge-case tests
        System.out.println("\n--- Extra Tests ---");

        System.out.println("Empty password: "+ checkPassword(new char[0]));

        System.out.println("Empty mobile number: "+ checkMobile(new char[0]));

        System.out.println("Empty word count: "+ countWords(new char[0]));

        System.out.print("Single character first/last: ");
        printChars(firstAndLast(new char[]{'x'}));

        System.out.print("Uppercase next letters: ");
        printChars(nextLetters(new char[]{'Y', 'Z'}));

        System.out.print("No matching positions: ");
        printInts(findPositions(new char[]{'a', 'b', 'c'}, 'x'));

        System.out.print("Uppercase vowel removal: ");
        printChars(removeVowels(new char[]{'A', 'b', 'E', 'c'}));
    }
}
