class Triangle {
    int a, b, c;
    double area, perimeter;

    Triangle() {
        a = 3;
        b = 4;
        c = 5;
        perimeter = a + b + c;
        double s = perimeter / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Triangle obj = new Triangle();

        System.out.println("Perimeter: " + obj.perimeter);
        System.out.println("Area: " + obj.area);
    }
}
