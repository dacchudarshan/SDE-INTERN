// import java.util.Scanner;
// class foreachdemo
// {
//     static void display(int a[])
//     {
//         for(int i : a)
//         {
//             System.out.print(i + " ");
//         }
//     }
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int n = sc.nextInt();

//         System.out.println("Enter the elements of the array: ");
//         int a[] = new int[n];
        
//     }
// }

// varargs (variable arguments)

// class VarargsDemo
// {
//     static void show()
//     {
//             System.out.print("no arguments");
//     }
//     static void show(int a)
//     {
//             System.out.print("one argument: " + a);
//     }
//     static void show(int a, int b)
//     {
//             System.out.print("two arguments: " + a + ", " + b);
//     }
//     public static void main(String[] args) 
//     {
//         show();
//         System.out.println();
//         show(10);
//         System.out.println();
//         show(10, 20);
        
//     }

// }


// //  variavle arguments (varargs) in java
// class VarargsDemo
// {
//     static void show(int x , int... a)
//     {
//             System.out.print("no arguments");

//             for(int i = 0; i < a.length; i++)
//             {
//                 System.out.print(a[i] + " , ");
        
//             if (i!= a.length - 1) 
//                 {
//                 System.out.print(a[i]);
//                 }
//             }
           
//     }
//         // static void show(int a, int b)
//         // {
//         //         System.out.print("two arguments: " + a + ", " + b);
//         // }}
//         // static void show(int a)
//         // {
//         //         System.out.print("one argument: " + a);
//     // }
    
//         public static void main(String[] args) 
//         {
//         //show(5);
//         System.out.println();
//         show(10);
//         System.out.println();
//         show(10, 20);
//         System.out.println();
//         show(10, 20, 30, 40, 50);
        
//     }

// }



// // wd
// class parappanaagrahara
// {
//     static int EvenCount(int... nums)
//     {
//         int count = 0;

//         for(int n : nums)
//         {
//             if(n % 2 == 0)
//             {
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) 
//     {
//         System.out.println(EvenCount(10, 20, 30, 40, 50));
//     }
// }


//-----------------------------------------------------------------------------------------

// // using varargs to show team names 
// class TeamNames
// {
//     static void show(String... names)
//     {
//         for(String name : names)
//         {
//             System.out.print(name + " ");
//         }
//     }
//     public static void main(String[] args) 
//     {
//         show("India", "Australia", "England", "New Zealand");
//     }
// }

// using varargs count of key (key = 20)
class KeyCount
{
    static void count(int... keys)
    {
        int count = 0;
        for(int key : keys)
        {
            if(key == 20)
            {
                count++;
            }
        }
        System.out.println("Count of key 20: " + count);
    }
    public static void main(String[] args) 
    {
        count(20, 10, 30, 20, 40, 20);
    }
}