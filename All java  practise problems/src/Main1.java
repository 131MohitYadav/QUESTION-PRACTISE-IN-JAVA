class Rect {
    double length, breadth;

    Rect(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea() {
        return length * breadth;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Rect r1 = new Rect(4, 5);
        Rect r2 = new Rect(5, 8);
        System.out.println("Area of first rectangle: " + r1.getArea());
        System.out.println("Area of second rectangle: " + r2.getArea());
    }
}
