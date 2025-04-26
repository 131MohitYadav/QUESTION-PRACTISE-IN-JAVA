
// Exception handling example
public class E2 {

    public static void main(String args[]){


        System.out.println("Hello...hi");
        int a, b , c = 0;
        a = 10;
        b = 2;
        System.out.println("Before try Exception");
        try{
            System.out.println("Enter try");
            c = a/b;

            System.out.println("Exit try");
        }catch(ArithmeticException ae){
            System.out.println("This is Catch block");
        }
        System.out.println(c);


    }
}
