public class RecursionFactorial {

    int fact(int n){

        // base condition
        if ( n == 1){  // n = 5
            return  1;
        }
        else{
            return  n*fact(n-1); // recursive case 5 * ( 5 - 1);
        }
    }
    public static  void main(String args[]){

        RecursionFactorial rf = new RecursionFactorial();
        System.out.println(rf.fact(5));
    }
}
