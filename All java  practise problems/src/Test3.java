
// Example of variable argument
public class Test3 {

    public static void add(int y , int...x){

        int sum = 0;
        for ( int a : x){
            sum = sum + a ;

        }
        System.out.println("Sum is : " + sum);
    }
    public static void main(String...args){
        //add();
        add(10);
        add(10,20,33);
        add(1,3,3,2,3,3);
    }
}
