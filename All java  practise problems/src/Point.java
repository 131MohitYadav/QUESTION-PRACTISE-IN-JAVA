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
    void hi(){
        System.out.println("Hii... Method is called");

        int x = 111;
        int y = 222;
//        System.out.println("\n x=%d Y =%d",this.x,this.y);
        System.out.println("x value is: " +x);
    }
}
