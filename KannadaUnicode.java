public class KannadaUnicode {

    public static void main(String[] args) {

        for (int i = 0x0C80; i <= 0x0CFF; i++) {
            System.out.printf("U+%04X = %c%n", i, (char) i);
        }
    }
}