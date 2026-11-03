
public class a {

    class asciiReturn {

        static char[] convertLowercaseToUppercase(char[] arr) {
            char[] result = new char[arr.length];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 'a' && arr[i] <= 'z') {
                    result[i] = (char) (arr[i] - 32);
                } else {
                    result[i] = arr[i];
                }
            }

            return result;
        }

        public static void main(String[] args) {
            char[] arr = {'c', 'o',
                'd', 'e'};

            char[] result = convertLowercaseToUppercase(arr);

            System.out.print("[");

            for (int i = 0; i < result.length; i++) {
                System.out
                        .print("' " + result[i] + "'");

                if (i < result.length - 1) {
                    System.out
                            .print(", ");
                }
            }

            System.out
                    .println("]");
        }
    }

}
