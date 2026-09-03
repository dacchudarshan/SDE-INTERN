public class loops 
{
    public static void main(String[] args) 
    {
        // // forward 1 step
        // for(int index = 1; index <= 5; index++) 
        // {
        //     System.out.println("Algorithm: " + index);
        // }

        // //infinite loop
        // for(int index = 5; index >= 1;) 
        // {
        //     System.out.println("Algorithm: " + index);
        // }

        // //infinite loop not stopping
        //  for (;;)
        // {
        //     System.err.println("Algorithm: ");
        // }

        // // step forward by 1
        // for (int index = 1; index <= 10; index++)
        // {
        //     System.err.println("Algorithm: "+ index);
        // }

        // System.out.println("==================================");
        // // Step forward by 1-10 oll numbers
        // for (int index = 1; index <= 10; index++)
        // {
        //     System.err.println("Algorithm: "+ index);
        // }   
       
        // System.out.println("==================================");
        // // Step forward by (even numbers) 1-10
        // for (int index1 = 2; index1 <= 10; index1+= 2)
        // {
        //     System.err.println("Algorithm: "+ index1);      
        // }

        // System.out.println("==================================");
        // // Step forward by (odd numbers) 1-10
        // for (int index = 1; index <= 10; index += 2)
        // {
        //     System.err.println("Algorithm: "+ index);
        // }

        // System.out.println("==================================");
        // // start from negative numbers
        // for (int index = -10; index <= 10; index++)
        // {
        //     System.err.println("Algorithm: "+ index);
        // }

        // System.out.println("==================================");
        // // start from positive numbers
        // for (int index = 1; index <= 10; index++)
        // {
        //     if (index % 2 == 0)
        //     {
        //         System.err.println("Algorithm: "+ index); 
        //     }  
        // }

        System.out.println("==================================");
        //infinite loop not stopping
        for (int index = 1; index <= 10;)
        {
            System.err.println("Algorithm: "+ index);
        }

        System.out.println("==================================");
        //infinite
        System.out.println("wrong Direction");
        for (int index = 1; index <= 5; index--)
        {
            System.err.println("Algorithm: "+ index);
        }

        System.out.println("==================================");
        //infinite
        System.out.println("infinite loop");
        for(int index = 5; index >= 1; index++)
        {
            System.err.println("Algorithm: "+ index);
        }
        System.out.println("==================================");
        // intentional infinite loop
        for (;;)
        {
            System.err.println("Algorithm: ");
        }

        //beginner mistake
        // 1) for (int index = 5; index >= 1; index++)
        // 2) for (int index = 5; index >= 1; index++)
        // 3) for (int index = 1; index = 5; index++)
        // 4) wrong updtae for (int index = 1; index <= 10; index+=3)

        // 1) incrementing by 3
        // 2) decrementing by 5
        // 3) revese alphabet
        //4) print 1 to 100
        // 5) print multiples of 5
        // 6) print square of numbers 1 to 10
        // 7) print cube of numbers 1 to 10
        // 8) sum of first n numbers

        // write golden rule of loops
        // 1) initialization
        // 2) condition check
        // 3) code execution
        // 4) update
        // 5) condition check and execution
        // 6) incorrect updatation no to infinite loop

    }
}