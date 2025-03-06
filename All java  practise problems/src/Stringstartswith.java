public class Stringstartswith {

    public static  void main(String [] args){
        String s1 = "Welcome to Bhopal";
        System.out.println(s1.startsWith("to"));// false
        System.out.println("wel".startsWith("Wel"));// false
        System.out.println(s1.startsWith("Wel"));// true

    }
}
