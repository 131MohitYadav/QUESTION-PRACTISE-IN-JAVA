// Check given String is Panagram or not by using function

import java.util.*;
public class OopsPanagram {

    boolean isPana( String s){


        // declare a variable
        int index = 0;
        boolean alphaList[] = new boolean[26];

        for ( int i = 0; i < s.length(); i++){
            if ( s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                index = s.charAt(i) - 'A';
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                index = s.charAt(i) - 'a';

            }
            alphaList[index] = true;
        }
        for ( boolean b : alphaList) {
            if (!b)
                return false;
        }
        return  true;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.nextLine();

        // create new object of class stored into other variable
         OopsPanagram p = new OopsPanagram();

         boolean res = p.isPana(s);
         if ( res){
             System.out.println("This is Panagram String");
         }
         else {
             System.out.println("This is not Panagram String");
         }
    }



}
