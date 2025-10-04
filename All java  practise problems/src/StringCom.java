import java.util.Scanner;

public class StringCom {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // input test cases
        int t = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        // loop for each test case
        for (int i = 0; i < t; i++) {
            String input = sc.nextLine();
            String compressed = compressString(input);

            // Print the result for each test case
            System.out.println(compressed);
        }

        sc.close();
    }

    // function to compress string
    public static String compressString(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        char currentChar = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                result.append(currentChar).append(count);
                currentChar = str.charAt(i);
                count = 1;
            }
        }

        // append last character and count
        result.append(currentChar).append(count);
        return result.toString();
    }
}
