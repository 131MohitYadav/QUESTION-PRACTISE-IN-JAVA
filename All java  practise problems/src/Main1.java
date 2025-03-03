class Rectangle {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea() {
        return length * breadth;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(5, 8);
        System.out.println("Area of first rectangle: " + r1.getArea());
        System.out.println("Area of second rectangle: " + r2.getArea());
    }
}
