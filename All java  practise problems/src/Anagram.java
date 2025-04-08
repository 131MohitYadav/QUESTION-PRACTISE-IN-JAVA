
// check anagram or not

import  java.util.*;
public class Anagram {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string 1: ");
        String s1 = sc.nextLine();
        System.out.println("Enter string 2; ");
        String s2 = sc.nextLine();

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean result = Arrays.equals(arr1 , arr2);

        if ( result){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");

        }
    }


}
