public class MyArray
    {
        int [] array; //stores elemets 
        int length; // totoal size of the array
        int rightIndex; // pointing at empty code 

        public MyArray()
        {
            length = 5;
            array = new int[length]; //[0][0][0][0][0]-> intial arrray
            rightIndex = 0;

        }

        //insert at end 
        public void insertATEnd(int value)
        {
            if(rightIndex == length)
            {
                System.out.println("Array is Full");
                return;
            }
            array[rightIndex] = value;
            rightIndex++;

        }

        //insert at start 
        public void insertAtStart(int value)
        {
            if (rightIndex == length)
            {
                System.err.println("Array is full");
                return;
            }
            else
            {
               // shift element 1 position to right 
                for(int i = rightIndex-1; i>=0; i--) 
                {
                    array[i+1] = array[i];
                }
            }
            //insert 
            array[0] = value;
            rightIndex++;
        }

        //insert at any position
        public void InsertAtAnyPosition(int position, int value)
        {
            if(rightIndex == length)
            {
                System.err.println("Array is full");
                return;
            }
            if(position<0 || position>rightIndex)
                {
                System.err.println("Invalid position");
                return;
            }
        
        //shift and insert
        for(int i = rightIndex-1; i>= position; i--)
        {
            array[i+1] = array[i];
        }
        array[position] = value;
        rightIndex++;
        }

        //print elements 
        public void printElements()
        {
            System.err.println("index\tvalue");
            for(int i = 0; i < rightIndex; i++)
            {
                System.err.println(i + "\t" + array[i]);
            }
        }
}
    
