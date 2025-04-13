
// PARAMETERIZED CONSTRUCTOR //
public class Point2 {

    // delcare member data of state or instance class
    int x;
    int y;

    public Point2(int a , int b){
        x = a;
        y = b;
    }
    void showData(){
        System.out.println("X is: " + x);
        System.out.println("Y is: "  + y);
    }
    void add(){
        System.out.println("Addition is: " + (x + y));
    }
    public static void main(String args[]){

        Point2 p1 = new Point2(131 , 151);
        p1.showData();
        Point2 p2 = new Point2( 11, 12);
        p2.add();

    }
}
