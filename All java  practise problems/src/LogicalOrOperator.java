public class LogicalOrOperator {
    public static void main(String args[]){

        int a , b , c , d;
        int x , y , z , w;
        x = 7;
        y = 3;
        z = x & y;
        w = x ^ y;
        a = 10;
        b = 20;
        c = 30;
        d = 40;

        System.out.println( ! ( a > b ||  c< d));// false
        System.out.println( z);
        System.out.println(w);


    }
}
