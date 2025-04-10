import  java.util.*;
public class OopsRectangle {

    // instance variable or member data  or state
    int l;
    int b;
    double r;

    void acceptData(){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter length: ");
        l = sc.nextInt();
        System.out.println("enter breadth: ");
        b = sc.nextInt();
        System.out.println("enter radius: ");
        r = sc.nextDouble();
    }
    void  showData(){
        System.out.println("Length is: " + l);
        System.out.println("Breadth is: " + b);
        System.out.println("Radius is; " + r);

    }
    void getArea(){
        System.out.println("Area: " + l*b);
    }
    void getPira(){
        System.out.println("Perimeter: " + 2 * ( l + b));
    }

    void  getCir(){
        System.out.println("Circumference of circle; " + 2 * 3.14 * r);
    }
    void getACir(){
        System.out.println("Area of circle: " + 3.14 * r * r);
    }
    // member function , instance method
    public static void main(String args[]){

        // create new object of class
        OopsRectangle or = new OopsRectangle();
        or.acceptData();
        or.showData();
        or.getArea();
        or.getPira();
        or.getCir();
        or.getACir();
    }

}
