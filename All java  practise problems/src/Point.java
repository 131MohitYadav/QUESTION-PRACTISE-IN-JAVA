public class Point {


    public int x;
    public int y;
    public int z = 101;

    public Point(){
        System.out.println("Point class Default constructor  is called");
    }
    public Point(int x , int y){
        this.x = x; //it point current class of object
        this.y = y;
        System.out.println("Point class Parameterized constructor is called");
    }
    void showData(){
        System.out.println("X_co: " + x);
        System.out.println("Y_co: " + y);
    }
    void hi(){
        System.out.println("Hii... Method is called");

        int x = 111;
        int y = 222;
//        System.out.println("\n x=%d Y =%d",this.x,this.y);
        System.out.println("x value is: " +x);
    }
    void Add(){
        int x = 12;
        int y = 10;
        System.out.println("Addition is: " + (x +y));
    }
}

// child class
class Circle1 extends Point{
    float r;
    int z = 102;
    public  Circle1(){
        System.out.println("circle class Default constructor is called");

    }

    public  Circle1(int x , int y , float r){
        super(x,y);// call parent class constructor
        this.r=r;
        System.out.println("circle class parameterized constructor is called");

    }
    void  showData(){
        super.hi(); // call parent class member function
        System.out.println("X_co: " + x);
        super.Add();
        System.out.println("Y_co: " + y);
        System.out.println("Radius:  is: " + r);
        System.out.println("circle z: " + z);
        System.out.println("Point class z: " + super.z);

    }
    public static void main(String args[]){
        Circle1 c1 = new Circle1(11,22,5.6f);
        c1.showData();
        c1.Add();

    }


}
