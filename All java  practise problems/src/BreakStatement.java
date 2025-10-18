import java.util.Scanner;

public class BreakStatement {

    public static void main(String args[]){

        for(int i = 0; i <= 10; i++){
            if ( i == 5){ // 0 , 1 , 2 , 3 , 4
                break; // if we exit from the loop then  we shoutld break statemetn
            }
            System.out.println(i);
        }
    }
}
