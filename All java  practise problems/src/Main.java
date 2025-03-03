class Triangle1 {
    double a, b, c;

    Triangle1(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getPerimeter() {
        return a + b + c;
    }

    double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class Main {
    public static void main(String[] args) {
        Triangle1 t = new Triangle1(3, 4, 5);
        System.out.println("Perimeter: " + t.getPerimeter());
        System.out.println("Area: " + t.getArea());
    }
}
