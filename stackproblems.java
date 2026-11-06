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
        if(ch =='(')
        {
            myStack.push(ch);
            continue;
        }
        else if(ch == ')')
        {
            if(myStack.peek() == -1)
            {
                isBalanced = false;
                break;
            }
            myStack.pop();
        }
        }
    return isBalanced;
    }
}


