
//  static block -> stati block is used to intitaliz static variable
// it execute only once when the class is load in memory

public class Point6 {

    // instance variable
    int x;
    int y;
    static int count;

    static {
        count=100;
        System.out.println("This is static block 1 Here");

    }
    // default constructor
    public Point6(){
        count++;

    }
    public static int getCtr(){
        return  count;
    }
    static {
        count=300;
        System.out.println("This is static block 3 here");
    }

    public static void main(String args[]){
        System.out.println("This is main Method here");
        Point6 p1 = new Point6();
        Point6 p2 = new Point6();
        Point6 p3 = new Point6();
        System.out.println(p1.count);//303
        System.out.println("Number of object is created: " + count);// 303
        System.out.println("Number of object is  created: " + Point6.count);// 303
        System.out.println("===========Static method called======");
        System.out.println("No. obj object created: " + p1.getCtr());
        System.out.println("No. obj object created: " + Point6.getCtr());
        System.out.println(count);
    }

    static {
        count=200;
        System.out.println("This is static block 2 here");

    }
    static {
        count=500;
        System.out.println("This is static block 5 here");
    }



}
