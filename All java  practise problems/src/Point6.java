
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



}
