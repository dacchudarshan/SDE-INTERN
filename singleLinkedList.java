// single linked list
public class singleLinkedList
{
    public static void main(String[]args)
    {
        // creating a new node
        Node newNode = new Node();
        newNode.data = 101;
        newNode.next = null;

        System.out.println(newNode.data);
        System.err.println(newNode.next);

        System.out.println("Creating a second node");

        // second node
        Node secondNode = new Node();
        secondNode.data = 102;
        secondNode.next = null;

        // connecting the first node to the second node
        newNode.next = secondNode;

        System.out.println(newNode.data);
        System.err.println(newNode.next);
  
    }

} 

