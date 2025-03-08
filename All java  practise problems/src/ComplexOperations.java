import java.util.Scanner;

class Complex {
    private double real, imag;

    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }

    Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imag * other.imag;
        double imagPart = this.real * other.imag + this.imag * other.real;
        return new Complex(realPart, imagPart);
    }

    void display() {
        System.out.println(real + (imag >= 0 ? " + " : " ") + imag + "i");
    }
}

public class ComplexOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter real and imaginary part of first complex number: ");
        Complex num1 = new Complex(scanner.nextDouble(), scanner.nextDouble());
        System.out.print("Enter real and imaginary part of second complex number: ");
        Complex num2 = new Complex(scanner.nextDouble(), scanner.nextDouble());
        System.out.print("Sum: ");
        num1.add(num2).display();
        System.out.print("Difference: ");
        num1.subtract(num2).display();
        System.out.print("Product: ");
        num1.multiply(num2).display();
        scanner.close();
    }
}
