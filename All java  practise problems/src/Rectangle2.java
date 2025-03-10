public class Rectangle2 {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle2() {
    }

    public Rectangle2(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle2[length=" + length + ", width=" + width + "]";
    }

    public static void main(String[] args) {
        Rectangle2 rect1 = new Rectangle2();
        Rectangle2 rect2 = new Rectangle2(4.5f, 3.2f);

        System.out.println("Rectangle2 1 - " + rect1.toString());
        System.out.println("Rectangle2 2 - " + rect2.toString());
        System.out.println("Rectangle2 2 Area: " + rect2.getArea());
        System.out.println("Rectangle2 2 Perimeter: " + rect2.getPerimeter());
    }
}
