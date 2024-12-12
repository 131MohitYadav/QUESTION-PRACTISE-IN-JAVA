// Write a java program to count the total number of character in a string

import java.util.Scanner;
public class StringCount {

    public  static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER ANY STRING: ");
        String input = sc.nextLine();

        int count = 0;

        for ( int i = 0; i < input.length(); i++){
            // it does not include space
            if ( input.charAt(i) != ' ')
                count++;
        }

        System.out.println("Total number of Character: " + count);
    }
}
