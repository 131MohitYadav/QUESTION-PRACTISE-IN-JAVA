import  java.util.*;
public class OopsRectangle {

    // instance variable or member data  or state
    int l;
    int b;

    void acceptData(){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter length: ");
        l = sc.nextInt();
        System.out.println("enter breadth: ");
        b = sc.nextInt();
    }
    void  showData(){
        System.out.println("Length is: " + l);
        System.out.println("Breadth is: " + b);

    }
    void getArea(){
        System.out.println("Area: " + l*b);
    }
    void getPira(){
        System.out.println("Perimeter: " + 2 * ( l + b));
    }

    // member function , instance method
    public static void main(String args[]){

        // create new object of class
        OopsRectangle or = new OopsRectangle();
        or.acceptData();
        or.showData();
        or.getArea();
        or.getPira();
    }

}
