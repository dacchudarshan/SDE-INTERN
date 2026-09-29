// single linked list
public class singleLinkedList
{
    public static void main(String[] args) 
    {
        Node head = null;
        printList(head);

        // funtion invocation
        head = insertAtStart(100, head);
        head = insertAtStart(101, head);
        head = insertAtStart(102, head);
        head = insertAtStart(103, head);
        head = insertAtStart(104, head);
        head = insertAtStart(105, head);

        printList(head.next);
        printList(head.next.next);
        printList(head.next.next.next);
        printList(head.next.next.next.next);
        printList(head.next.next.next.next.next);
        printList(head.next.next.next.next.next.next);
        printList(head);
    
    }
    //funtion definition 
    public static Node insertAtStart(int value, Node currentHead)
    {
        Node newNode = new Node(); //creation a new node and set the values
        newNode.data = value;
        newNode.next = null;

        // test case -1 head is null or list is empty
        // if (currentHead != null)
        // {
        //     return newNode;
        // }
        // else
        // {
        //     //test case -2 list os not empty or there are one more nodes 
        //     newNode.next = currentHead;
        //     return newNode;
        // }

        if (currentHead != null)
            newNode.next = currentHead;
        return newNode;
    }

    // print the list
    public static void printList(Node head)
        {
            Node monkey = head;

            System.out.print(" \nhead -> ");
            while (monkey != null)
            {
                System.out.print(monkey.data + " -> ");
                // System.out.print(" -> ");
                monkey = monkey.next;
            }
            System.out.println("null");

        }
     
}

