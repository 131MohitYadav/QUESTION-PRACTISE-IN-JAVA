public class StringCompareTo {
    public static void main(String [] args){
       // String s1 = "HELLO";
       // String s2 = "HELLO";
        String s3 = "naman";
        String s4 = "madam";
       // int x = s1.compareTo(s2);
        int x = s3.compareTo(s4);
       // System.out.println(x);

        // compareTo()=> it return always positive and negative and zero
        System.out.println("Hello".compareTo("Hello"));

        if ( x > 0){
            System.out.println(s3 + " is Greater");

        }

        else if( x < 0){
            System.out.println( s4 + " is Greater");
        }
        else if( x == 0){
            System.out.println("Both string is equal");
        }
    }
}
