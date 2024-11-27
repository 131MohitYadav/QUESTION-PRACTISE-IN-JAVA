public class RecursionNatural {
    public static int CalcSum(int n){

        // Base case
        if( n == 1){
            return 1;
        }
        int Snm1 = CalcSum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }
    // main function call
    public static void main(String args[]){
        int n =  5;
        System.out.println(CalcSum(n));
    }
}
