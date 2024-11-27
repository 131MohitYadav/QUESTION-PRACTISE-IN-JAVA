import java.util.*;
public class Question14 {
    public static void main(String args[]){
        // DECLARE VARIABLE TO STORE A SUM OF BINARY NUMBER
        int binary1,binary2;
        int i =0,remainder=0;

        // CREATE A ARRAY TO STORE THE BINARY DIGIT SUM
        int [] sum = new int[20];

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A FIRST  BINARY NUMBER: ");
        binary1 = sc.nextInt();

        System.out.println("ENTER A SECOND BINARY NUMBER: ");
        binary2 = sc.nextInt();

        // Perform binary addition while there are digits in the binary numbers
        while (binary1 != 0 || binary2 != 0)
        {
            // Calculate the sum of binary digits and update the remainder
            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }

        // If there is a remaining carry, add it to the sum
        if (remainder != 0) {
            sum[i++] = remainder;
        }

        // Decrement the index to prepare for printing
        --i;

        // Display the sum of the two binary numbers
        System.out.print("SUM OF TWO BINARY NUMBER: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
// \n used for the end of the program;
       // System.out.print("\n");
        sc.close();
    }
}
