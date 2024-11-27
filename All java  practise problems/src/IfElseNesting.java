
import java.util.Scanner;
public class IfElseNesting {

    public static void main(String args [] ){

        Scanner sc = new Scanner(System.in);

        int a , b , c;

        System.out.print("ENTER NUMBER 1: ");
        a = sc.nextInt();
        System.out.print("ENTER NUMBER 2: ");
        b = sc.nextInt();
        System.out.print("ENTER NUMBER 3: ");
        c = sc.nextInt();
System.out.println("largest Value is: ");  
        if( a > b){

            if(a > c){
                System.out.println(a); // statement 1
            }
            else{
                System.out.println(c); // statement 2
            }
        }
        else{ // statement 3
            if (c > b){
                System.out.println(c);
            }
            else {
                System.out.println(b);
            }
        }
        //System.out.println("largest Value is: ");
    }
}
