public class StringValueof {
    public static void main(String args[]){

        Integer x = 33345;
        String a = String.valueOf(x);
        System.out.println(a.length()); // 5

        float  y = 2343.234f;
        String b = String.valueOf(y);
        System.out.println(b.length()); // 8

        char z = 'M';
        String c = String.valueOf(z);
        System.out.println(c.length());

        String s = "Hello Mohit";
        String w = String.valueOf(s);
        System.out.println(w.length()); // 11

    }
}
