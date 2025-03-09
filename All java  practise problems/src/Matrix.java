import java.util.Scanner;

class Matrix {
    int rows;
    int cols;
    int[][] elements;

    Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.elements = new int[rows][cols];
    }

    void inputElements() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                elements[i][j] = scanner.nextInt();
            }
        }
    }

    void displayMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        Matrix matrix = new Matrix(rows, cols);
        matrix.inputElements();
        matrix.displayMatrix();
    }
}
