public class RecursionFact {
    public static int fact(int n){

        // Base case
        if( n == 0){
            return 1;

        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }
    public  static void main(String args[]){
        int n = 6 ;
        System.out.println(fact(n));
    }
}
