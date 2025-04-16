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

        // how access method
        // classname.methodname

        System.out.println(p1.count);
        System.out.println("Number of object is created: " + count);
    }
}
