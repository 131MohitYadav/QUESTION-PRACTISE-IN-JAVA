
// Example of Exception by using finally block

public class E3 {

    public static void main(String args[]){

        int a , b , c = 0;
 a = 10;
//  b = 2;
        b = 0;
        System.out.println("before exception..");
        try{

            System.out.println("Enter Try");
            c = a / b;
            System.out.println("Exit try");
        }finally {
            System.out.println("This is finally block");

            System.out.println(c);
            System.out.println("After Exception");

        }

    }
}
