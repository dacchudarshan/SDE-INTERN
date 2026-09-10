public class loopinsideloop 
{
    public static void main(String []args)
    {
    //     //1).  while inside while
    //     System.err.println("");
    //     System.out.println("1).  while inside while");
    //     int i = 1;
    //     while (i <= 4)
    //     {
    //         int j = 1;
    //         while (j <= 4)
    //         {
    //             System.out.print( "A" + j + " ");
    //             j++;
    //         }
    //         System.out.println();
    //         i++;
    //     }

        // //2). do while inside do while
        //  System.err.println("");
        // System.out.println("2). do while inside do while");
        // int i = 1;
        // do
        // {
        //     int j = 1;
        //     do
        //     {
        //         System.out.print( " * ");
        //         j++;
        //     } while (j <= 4);
        //     System.out.println();
        //     i++;
        // } while (i <= 4);
        
        // //3). for inside while 
        //  System.err.println("");
        // System.out.println("3). for inside while");
        // int i = 1;
        // while (i <= 4)
        // {
        //     for (int j = 1; j <= 4; j++)
        //     {
        //         System.out.print( " * ");
        //     }
        //     System.out.println();
        //     i++;
        // }

        // //4). for inside do while 
        // System.err.println("");
        // System.out.println("4). for inside do while");
        // int i = 1;
        // do
        // {
        //     for (int j = 1; j <= 4; j++)
        //     {
        //         System.out.print( " * ");
        //     }
        //     System.out.println();
        //     i++;
        // } while (i <= 4); 

        // // 5). do while inside for
        // System.err.println("");
        // System.out.println("5). do while inside for");
        // for (int i = 1; i <= 4; i++)
        // {
        //     int j = 1;
        //     do
        //     {
        //         System.out.print( " * ");
        //         j++;
        //     } while (j <= 4);
        //     System.out.println();
        // }

    
        // 6). while inside do while
        System.err.println("");
        System.out.println("6). while inside do while");
        int i = 1;
        do
        {
            int j = 1;
            while (j <= 4)
            {
                System.out.print( " * ");
                j++; 
            }   
            System.out.println();
            i++;
        } while (i <= 4);
    }
}