public class day13 
{
    public static void main(String[] args) 
    {
        System.err.println("--------------------------------------------------");
        
        System.err.println("Scenario 1: both string literals ");
        String s1 = "java";
        String s2 = "java";

        System.err.println("S1 == S2: "+ (s1 == s2));
        System.err.println("S1.equals(S2): "+ (s1.equals(s2)));

        System.err.println("--------------------------------------------------");

        System.err.println("Scenario 2: both using new ");
        String s3 = new String("java");
        String s4 = new String("java");

        System.err.println("S3 == S4: "+ (s3 == s4));
        System.err.println("S3.equals(S4): "+ (s3.equals(s4)));

        System.err.println("--------------------------------------------------");

        System.err.println("Scenario 3: one string literal and one using new ");
        String s5 = "java";
        String s6 = new String("java");

        System.err.println("S5 == S6: "+ (s5 == s6));
        System.err.println("S5.equals(S6): "+ (s5.equals(s6)));

    }
    
}
