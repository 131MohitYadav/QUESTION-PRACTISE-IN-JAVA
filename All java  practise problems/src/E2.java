
// Exception handling example
public class E2 {

    public static void main(String args[]){


        System.out.println("Hello...hi");
        int a,b,d = 0;
        int e = 0;
        float x , y , z = 0;
        x = 4.2f;
        y = 6.2f;
        a = 10;
        b = 0;

        System.out.println("Before try Exception");
        try{
            System.out.println("Enter try");
            d= a / b;
            e = a * b;
             z = x / y;

            System.out.println("Exit try");
        }catch(ArithmeticException aefd){
            System.out.println("This is Catch block");
            System.out.println("Denominator should not be zero");
        }
        System.out.println("Division: " + d);
        System.out.println("Multi: " + e);
        System.out.println("Hello..Bye");
        System.out.println(z);


    }
}
