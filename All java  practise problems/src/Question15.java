import java.util.Scanner;
public class Question15{
    public static void main(String[] args) {
        // Declare variables to store two binary numbers and the product
        long binary1, binary2, multiply = 0;

        // Initialize digit and factor variables for processing binary2
        int digit, factor = 1;

        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to input the first binary number
        System.out.print("Input the first binary number: ");
        binary1 = in.nextLong();

        // Prompt the user to input the second binary number
        System.out.print("Input the second binary number: ");
        binary2 = in.nextLong();

        // Process binary2 to calculate the product
        while (binary2 != 0) {
            digit = (int)(binary2 % 10);
            if (digit == 1) {
                binary1 = binary1 * factor;
                multiply = binaryproduct((int) binary1, (int) multiply);
            } else {
                binary1 = binary1 * factor;
            }
            binary2 = binary2 / 10;
            factor = 10;
        }

        // Display the product of the two binary numbers
        System.out.print("Product of two binary numbers: " + multiply + "\n");
    }

    // Method to calculate the product of two binary numbers
    static int binaryproduct(int binary1, int binary2) {
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        int binary_prod_result = 0;

        while (binary1 != 0 || binary2 != 0) {
            sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
            remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }

        if (remainder != 0) {
            sum[i++] = remainder;
        }

        --i;

        while (i >= 0) {
            binary_prod_result = binary_prod_result * 10 + sum[i--];
        }

        return binary_prod_result;
    }
}

 // EXPLANATION //
 // Initialize variables to store the two binary numbers ('binary1' and 'binary2'), the result 'multiply', and other necessary variables.
  // Take two binary numbers from the user using the Scanner class.
 // Next, it enters a loop to perform binary multiplication by considering the digits of the second binary number one by one from right to left.
// For each digit in 'binary2', if it's 1, it multiplies 'binary1' by a factor. It computes the product using the "binaryproduct()" function.
 // The helper function "binaryproduct()" calculates the binary product of two numbers and returns the result.
// If the digit in binary2 is 0, it still multiplies 'binary1' by the factor but doesn't perform the product calculation.
 //It updates 'binary2' by moving to the next digit (right to left) and adjusting the factor.
// After the loop, it prints the product of the two binary numbers, which is stored in the multiply variable.