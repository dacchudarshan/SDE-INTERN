public class patrn 
{
    public static void main(String[]args)
    {
        // 1). 5 cross 5 magic box pattern 
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                System.out.print( i+j + " ");
            }
            System.out.println();
        }


    // 2) count patterns
        int count = 0;
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                ++count;
                // normal print
                // System.out.print(count + " ");

                // formated zero padding
                System.out.printf("%02d ", count);
                
            }
            System.out.println(" ");
        }

    // 3) 5 cross 5 box print 1 coloum all and second coloum all and so on
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                // System.out.print(j + " ");  
                System.out.print(j + " * ");
    }   
            System.out.println();
        }

    // 4) 5 cross 5 box print 1 coloum all and second coloum 1 less and so on
       int count = 0;
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {   
                count++;
                System.out.print(i+j + " ");  
            }   
            System.out.println();
        
        }

    // 5). question
       for (int i = 1; i <= 5; i++)
       {
           for (int j = 1; j <= 5-i+1; j++)
           {
               System.out.print(i + " ");
           }
           System.out.println();
       }
       

    //6).
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= 5; j++)
        {
            if (j>=i)
            {
                System.out.print(" * ");
            }
            else
            {
                System.out.print("   ");
            }
        }
        System.out.println();
    }
}
}

