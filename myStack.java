public class myStack 
{
    private int top = -1;
    private int size;
    private int values[];

    public myStack(int sizeOfStack)
    {
        this.values = new int[sizeOfStack];
        this.size = sizeOfStack;
    }

    public void push(int value)
    {
        this.top++;
        this.values[this.top] = value;
    }

    public int peek()
    {
        if (this.top == -1)
        {
            System.out.println("Stack is empty");
            return 0;
        }
        return this.values[this.top];
    }

    public int pop()
    {
        if (this.top == -1)
        {
            System.out.println("Stack is empty ");
            return -1000;
        }
        int value = this.values[this.top];
        this.top--;
        return value;
    }
}
