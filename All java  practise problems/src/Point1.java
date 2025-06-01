
// default constructor //
public class Point1 {

    // member data
    int x;
    int y;
    int a , b;


    public Point1(){

        x = 2;
        y = 3;
        a = 23;
        b = 23;

        System.out.println("default constructor is called");
    }
    void showData(){
        System.out.println("X is: " + x);
        System.out.println("Y is: " + y);
    }
    void addData(){
        System.out.println("Addition of a and b: " + ( a + b));
    }
    void Mul(){
        System.out.println("Multiplication: " + (x * y));
        System.out.println("Multiplicate of a and b: " + ( a  * b));
    }
    void Add(){
        System.out.println("Addition is: " + ( x + y));
    }
    void Sub(){
        System.out.println("Subtraction is: " +  ( x - y));
    }
    void div(){
        System.out.println("Division: " + ( x / y) );

    }

    public static void main(String args[]){
        // create new object of class
        Point1 p1 = new Point1();
        Point1 p2 = new Point1();
        p1.showData();
        p1.addData();
        Point1 p3 = new Point1();
        p3.Mul();
        p3.Add();
        p3.div();
    }
}
