public class StringEmpty {

    public static void main(String args[]){

        String s1 = "";
        String s2 = "Mohit";
       // String s3 ;
        // isEmpty() -> method always return boolean value
        System.out.println(s1.isEmpty());// true
        System.out.println(s2.isEmpty());// false
        //System.out.println(s3.isEmpty());// compile time error
        System.out.println("Hello Mohit".isEmpty());
    }
}
