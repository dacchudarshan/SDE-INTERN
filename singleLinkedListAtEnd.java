public class singleLinkedListAtEnd 
{
    // simple single list node class
    Node head= null;

    static void printList(Node head)
    {
        // print the list
        Node current = head;
        System.err.print("head -> ");
        while (current != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    static Node insertAtEnd(Node head, int value)
    {
        // create a new node and set the values
        Node lastNode = new Node();
        lastNode.data = value;
        lastNode.next = null;

        // test case -1 head is null or list is empty
        if (head == null)
        {
            head = lastNode;
            return head;
        }
        else
            // test case -2 list is not empty or there are one or more nodes
        {
            Node current = head;
            // traverse to the end of the list
            while (current.next != null)
            {
                current = current.next;// move to the next node
            }
            current.next = lastNode;
            return head;
        }
    }
    public static void main(String[] args) 
    {

        Node head = null;
        printList(head);

        head = insertAtEnd(head, 101);
        printList(head);
        head = insertAtEnd(head, 102);
        printList(head);
        head = insertAtEnd(head, 103);
        printList(head);
        head = insertAtEnd(head, 104);
        printList(head);
        
    }
}
