
// Example of Variable argument
public class Test2 {

    public static void add(int...x){

        int sum = 0;
        for ( int a : x){
            sum = sum + a;
        }
        System.out.println("Sum is: " + sum);
    }
    public static void sub(int...x){

        int sum = 0;
        for ( int a : x){
            sum = sum - a;
        }
        System.out.println("Subtraction : " + sum);
    }

    public static void main(String...args){
        add();
        add(2,3);
        add(4,5,3,3,2);
        sub();
        sub(5 , 3);
    }
}
