public class opertor 
{
    public static void main(String[] args) 
    {
        int count = 10;
          
        System.err.println("");
        System.err.println("count ++");
        System.err.println("count++: "+ count++);
        System.err.println("count++: "+ count);
        System.err.println("count++: "+ count++);
        System.err.println("count++: "+ count++);
        System.err.println("count++: "+ count);
        
        System.err.println("");
        System.err.println("count --");
        System.err.println("Count--: "+ count--);
        System.err.println("Count--: "+ count);
        System.err.println("Count--: "+ count--);
        System.err.println("Count--: "+ count--);

        System.err.println("");
        System.err.println("++ count");
        System.err.println("++count: "+ ++count);
        System.err.println("++count: "+ count);
        System.err.println("++count: "+ ++count);
        System.err.println("++count: "+ count);
        System.err.println("++count: "+ count);


        System.err.println("");
        System.err.println("-- count");
        System.err.println("--count: "+ --count);
        System.err.println("--count: "+ count);
        System.err.println("--count: "+ --count);
        System.err.println("--count: "+ count);
        System.err.println("--count: "+ count);
            
        System.err.println("");
        System.err.println("ASSIGNMENT");
        int store = count;
        store++;
        System.err.println("store: "+store);

        System.err.println("");
        int count1 = 12;
        int count2 = count1++;
        System.err.println("count2: "+count2); //12
        System.err.println("count2: "+count1); //13
        
        System.err.println("");
        int a = 13;
        int b = ++a;
        System.err.println("a: "+b);
        System.err.println("a: "+a);
        
        System.err.println("");
        System.err.println("beh expression: ");
        int c = 10;
        System.err.println(c++ +5);
        System.err.println( c);
        System.err.println( ++c +5);
         
        System.err.println("");
        System.err.println("confusing beh experession: ");
        int num = 10;
        System.err.println(num++ + num++);
        
        System.err.println("");
        System.err.println("confus beh expression");
        int num1 = 11;
        System.err.println(num1++ + num++);

        System.err.println("");
        System.err.println("subtrack");
        int num2 = 12;
        System.err.println(num2++ - ++num2);

        System.err.println("");
        System.err.println("pre");
        int num3 = 20;
        System.err.println(++num3 + --num3);

        System.err.println("");
        int x = 5;
        int y = 10;
        System.err.println(x++ + ++y);
        System.err.println("a: "+x);
        System.err.println("b: "+y);

        System.err.println("");
        int p = 4;
        System.err.println(++p + p++);
        System.err.println("p: "+p);


    }
}
