public class ArrayDemo
{
    public static void main(String[] args) 
    {
        MyArray myArray = new MyArray();
        System.err.println("initial Array");
        myArray.printElements();
        myArray.insertATEnd(10);
        myArray.insertATEnd(20);

        System.err.println("After Inserting: ");
        myArray.printElements();

        myArray.insertAtStart(5);

        System.err.println("After inserting 5 at last: ");
        myArray.printElements();

        myArray.InsertAtAnyPosition(2,15);
        System.err.println("After inserting 15 at last position 2: ");
        myArray.printElements();

        // invalid position
        myArray.insertAtStart(-1,99 );
    }
}
