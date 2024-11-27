public class RecursionTilling {

    public static int TillingProblem(int n ){

        //base case
        if(n == 0 || n == 1){
            return 1;
        }

        // vertical choice
        int fnm1 = TillingProblem(n-1);

        // horizontal choice
        int fnm2 = TillingProblem(n-2);

        int totalway = fnm1 + fnm2;
        return  totalway;
    }
    public static void main(String args[]){
        System.out.println(TillingProblem(4));
    }
}
