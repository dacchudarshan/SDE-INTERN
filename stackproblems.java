public class stackproblems 
{
    public static void main(String[] args)
    {

    }

    boolean isBalancedExpression(String exp)
    {
       if (exp == null)
           return false;
       
       myStack myStack = new myStack(exp.length());
       boolean isBalanced = true;

       for (int i = 0; i < exp.length(); i++)
       {
        char ch = exp.charAt(i);
        if(ch =='(' || ch == '{' || ch == '[')
        {
            myStack.push(ch);
        }
        else if(ch == ')' || ch == '}' || ch == ']')
        {
            if(myStack.peek() == 0)
            {
                isBalanced = false;
                break;
            }
            char topChar = (char)myStack.pop();
            if((ch == ')' && topChar != '(') ||
               (ch == '}' && topChar != '{') ||
               (ch == ']' && topChar != '['))
            {
                isBalanced = false;
                break;
            }
        }
       }
       return isBalanced;
    }
}

