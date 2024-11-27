public class RecursionDec {
    public static void PrintDec(int n){

        //  BASE CASE
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        PrintDec(n -1);
    }
    // MAIN FUNCTION CALL
    public  static void  main (String args[]){
        int n = 10;
        PrintDec(n);
    }
}
