// Write a java program to count the total number of punctuation Character exists in a string

import java.util.Scanner;
public class StringPunctuation {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER ANY STRING WITH SPECIAL CHARACTER: ");
        String s = sc.nextLine();

        for ( int i = 0; i<s.length(); i++){
            if ( s.charAt(i) == '.' || s.charAt(i) == ',')
        }
    }
}
