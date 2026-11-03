public class evenCount
{
    boolean evenDigits(int num)
    {
        int digitCount = 0;
        while(num != 0)
        {
            digitCount++;
            num /= 10;
        }
        return (digitCount & 1)== 0;
    }  

    public int findNumbers(int[] nums) 
    {
        int evenCount = 0;
        for(int num: nums)
        {
            if (evenDigits(num))
            {
                 evenCount++;
            }
        }
        return evenCount;
    }
}