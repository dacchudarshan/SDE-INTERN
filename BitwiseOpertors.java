public class BitwiseOpertors 
{
    public static void main(String[] args) 
    {
        int x = 10;
        int y = 6;
        int z;
        System.err.println("AND: "+(x & y));
        System.err.println("OR: "+ (x | y));
        System.err.println("XOR: "+ (x ^ y));
        System.err.println("NOT X: "+ (~x));
        System.err.println("NOT Y: "+ (~y));

        System.err.println("left shift: ");
        int a = 10;
        System.err.println("shift by 1: "+(a << 1));
        System.err.println("shift by 2: "+(a << 2));
        System.err.println("shift by 3: "+(a << 3));

        System.err.println("right shift: ");
        int b = -10;
        System.err.println("Shift by 1: "+ (b >> 1));
        System.err.println("Shift by 2: "+ (b >> 2));
        System.err.println("Shift by 3: "+ (b >> 3));

        System.err.println("unsigned right shift: ");
        int c = 10;
        System.err.println("Shift by 1: "+ (c >>> 1));
        System.err.println("Shift by 2: "+ (c >>> 2));
        System.err.println("Shift by 3: "+ (c >>> 3));

    }
}
