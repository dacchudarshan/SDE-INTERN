// Insert a new node at the middle of a single linked list
public class singleLinkedListAtMiddle 
{
    // simple single list node class
    static class Node
    {
        int data;
        Node next;
    }

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

    // insert a new node after the kth node in a single linked list
    static Node insertAfterKey(Node head, int key, int value)
    {
        // create a new node and set the values
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;

        // test case -1 head is null or list is empty
        if (head == null)
        {
            head = newNode;
            return head;
        }
        else
            // test case -2 list is not empty or there are one or more nodes
        {
            Node keyNode = head;

            // traverse to the kth node in the list
            while (keyNode != null && keyNode.data != key)
            {
                keyNode = keyNode.next;// move to the next node
            }
            if (keyNode != null)
            {
                newNode.next = keyNode.next;
                keyNode.next = newNode;
            }
        }

        return head;
            
    }
    public static void main(String[] args) 
    {
        Node head = null;
        printList(head);

        head = insertAfterKey(head, 0, 4);
        head = insertAfterKey(head, 4, 5);
        head = insertAfterKey(head, 5, 8);

        // function invocation
        head = insertAfterKey(head, 5, 10);
        
        //terminal output block like this 4 -> 5 -> 10 -> 8 -> null
        printList(head);

    }

}
