public class Question13 {

    public static void main(String[] args) {
        // Create an array to store lines of an ASCII art representation
        String[] arr= new String[5];

        // Populate the array with lines to form an ASCII art representation of a simple face
        arr[0] = " +\"\"\"\"\"+ ";
        arr[1] = "[| o o |]";
        arr[2] = " |  ^  |";
        arr[3] = " | '-' |";
        arr[4] = " +-----+";

        // Use a loop to print each line of the ASCII art representation
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}

