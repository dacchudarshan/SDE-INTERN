class Solution 
{

    public static int[] countOfVowelsConsonants(char[] letters) 
    {
        //test cases
        if (letters == null || letters.length == 0) 
            {
            return new int[]{0, 0};
            }

        int vowels = 0, consonants = 0;

        for (int i = 0; i < letters.length; i++) 
            {
            if ((letters[i] >= 'a' && letters[i] <= 'z') || 
                (letters[i] >= 'A' && letters[i] <= 'Z')) 
                {
                if (letters[i] == 'a' || letters[i] == 'e' ||
                    letters[i] == 'i' || letters[i] == 'o' ||
                    letters[i] == 'u' || letters[i] == 'A' ||
                    letters[i] == 'E' || letters[i] == 'I' ||
                    letters[i] == 'O' || letters[i] == 'U') 

                {
                    vowels++;
                }
            
                else 
                {
                    consonants++;
                }
                }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) 
    { 
        char[] letters = {'A', 'p', 'P', 'l', 'e'};

        int[] result = countOfVowelsConsonants(letters);

        System.out.println("[" + result[0] + " , " + result[1]+ "]");
    }
}