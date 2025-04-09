public class RecursionFibo {

    static int n1  = 0 , n2 = 1 , n3 = 0;
    static void printFibo( int count){

        if ( count > 0){
            n3 = n1 + n2;
            n1 = n2; //
            n2 = n3; //

            System.out.print("\t" + n3);
            printFibo(count - 1);
        }
    }
    public static void main(String args[]){
        int term = 5;
        System.out.print(0 + " " + 1);
        printFibo(term - 2);
    }
}
