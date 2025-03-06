public class Stringequals {
    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Mohit";
        String s4 = "Rohit";
        // equals() -> it return boolean value
        System.out.println(s1.equals(s2));// true
        System.out.println(s3.equals(s4));// false
        System.out.println("1".equals("2")); // false
        System.out.println("4".equals("4"));// true
    }
}
