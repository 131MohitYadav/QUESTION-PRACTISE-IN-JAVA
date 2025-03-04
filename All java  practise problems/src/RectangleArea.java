import java.util.Scanner;

class Area {
    private double length, breadth;

    void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea() {
        return length * breadth;
    }
}

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Area rectangle = new Area();
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = scanner.nextDouble();
        rectangle.setDim(length, breadth);
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        scanner.close();
    }
}
