public class DemoStrArr 
{
    public static void main(String[] args) 
    {
        // print text as it is
        char [] temp = {'A', 'B'};
        System.out.println( temp);

        // string also prints text as it object
        String name = "Darshan";
        System.out.println(name);

        //int array gives address as per the length of the array
        int [] arr = {1, 2, 3};
        System.out.println(arr);

        //emoji length
        String emoji = "\uD83D\uDE00";
        System.out.println(emoji.length());
    }
}
