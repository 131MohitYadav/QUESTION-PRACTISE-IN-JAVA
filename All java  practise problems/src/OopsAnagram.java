
// Check Give string is anagram or not by using function ( taking something and return something)

import java.util.*;

public class OopsAnagram {

    boolean Anag( String s1 , String s2){


        // base case condition
        if ( s1.length() != s2.length())
            return  false;

        // operation perform
         s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return  Arrays.equals(arr1, arr2);
    }

    public  static  void main( String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter string 1 : ");
        String s1 = sc.nextLine();
        System.out.println("enter string 2 : ");
        String s2 = sc.nextLine();

        // create new object of class

        OopsAnagram a = new OopsAnagram();
        boolean res = a.Anag(s1,s2);
        if ( res){
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not a Anagram");
        }

    }
}
