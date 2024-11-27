// WRITE  A PROGRAMM TO COUNT LETTER , SPACE , NUMBER, OTHERS
import java.util.*;
 public class Question26 {
     public static void main(String args[]){

         String test = "My name is mohit yadav1342342 #!3erfewk";
         count(test);

     }
     public static void count(String x){
         // convert the input string to character Array
         char [] ch = x.toCharArray();
         // initialize the letter,space,number,others
         int letter = 0;
         int space = 0;
         int num = 0;
         int other = 0;

         // iterate through the character array to categrize
         for(int i = 0;i<x.length();i++){
             //check if the character is letter
             if(Character.isLetter(ch[i])){
                 letter++;
             }

             // check if the character is space
             if(Character.isSpaceChar(ch[i])){
                 space++;
             }
             // check if the character is number
             if(Character.isDigit(ch[i])){
                 num++;
             }
             else{
                 other++;
             }
         }
         //display the original string
         System.out.println("The Sting is: My name is mohit yadav1342342 #!3erfewk");

         System.out.println("letter: " + letter);
         System.out.println("space: " + space);
         System.out.println("number: " + num);
         System.out.println("other: " + other);
     }

     }


