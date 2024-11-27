public class RecursionPower {
    public static int Power(int x ,int n){

        // base case
        if( n == 0){
            return 1;
        }

        // formula of x^n is
        return x * Power(x, n-1);
    }
    public static void main(String args[]){
        System.out.println(Power(2,10));
    }
}
