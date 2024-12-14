
// Write a java program to check given sentence is title case or not

import java.util.Scanner;
public class TitleCase {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER ANY STRING: ");
        String s = sc.nextLine();

        String words [] = s.split(" ");
    String result = "";
        for( String word : words){

           String FirstLetter = word.substring(0,1).toUpperCase();
           String RemainingLetter = word.substring(1).toLowerCase();

             result += FirstLetter + RemainingLetter + " ";

        }

        System.out.println(result);
    }
}
