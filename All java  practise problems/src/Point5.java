// static example 2

public class Point5 {

    int x;
    int y;
    static int count;

    // deafult constructor

    public Point5(){
        count++;
    }
    public static  int getCtr(){
        return count;
    }

    public static void main(String args[]){

        Point5 p1 = new Point5();
        Point5 p2 = new Point5();
        Point5 p3 = new Point5();
        Point5 p4 = new Point5();

        // how access method
        // classname.methodname

        System.out.println(p1.count);
        System.out.println("Number of object is created: " + count);
        System.out.println("Number of object is created: " + Point5.count);

        System.out.println("static method is called ......");
        System.out.println("No. of object is created : " + p1.getCtr());
        System.out.println("No. of object is created : " + Point5.getCtr());

    }
}
