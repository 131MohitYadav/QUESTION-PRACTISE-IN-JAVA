public class RecursionInc {
    public static void PrintInc(int n ){

        // Base case
        if (n == 1){
            System.out.println(n + " ");
            return;
        }
        PrintInc(n - 1);
        System.out.println(n +" ");


    }
    public static void main(String args[]){
        int n = 10;
        PrintInc(n);
    }
}
