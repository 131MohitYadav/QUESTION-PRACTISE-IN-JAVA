
// default constructor //
public class Point1 {

    // member data
    int x;
    int y;

    public Point1(){

        x = 2;
        y = 3;

        System.out.println("default constructor is called");
    }
    void showData(){
        System.out.println("X is: " + x);
        System.out.println("Y is: " + y);
    }
    void Mul(){
        System.out.println("Multiplication: " + (x * y));
    }
    public static void main(String args[]){
        // create new object of class
        Point1 p1 = new Point1();
        Point1 p2 = new Point1();
        p1.showData();
        Point1 p3 = new Point1();
        p3.Mul();
    }
}
