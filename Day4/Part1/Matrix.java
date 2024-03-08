import java.util.Scanner;

class Matrix {
    int rows, columns;
    int[][] elements;

    public Matrix(int r, int c) {
        rows = r;
        columns = c;
        elements = new int[r][c];
    }

    int getRows() {
        return rows;
    }

    int getColumns() {
        return columns;
    }

    void setElement(int i, int j, int value) {
        elements[i][j] = value;
    }

    Matrix addMatrices(Matrix m1, Matrix m2) {
        if (m1.getRows() != m2.getRows() || m1.getColumns() != m2.getColumns()) {
            System.out.println("Matrices cannot be added");
            return null;
        }

        Matrix result = new Matrix(m1.getRows(), m1.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.elements[i][j] = m1.elements[i][j] + m2.elements[i][j];
            }
        }
        return result;
    }

    void multiplyMatrices(Matrix m1, Matrix m2) {
        // Implementation for matrix multiplication
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows for matrix 1: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter number of columns for matrix 1: ");
        int columns1 = scanner.nextInt();
        Matrix matrix1 = new Matrix(rows1, columns1);

        System.out.print("Enter number of rows for matrix 2: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter number of columns for matrix 2: ");
        int columns2 = scanner.nextInt();
        Matrix matrix2 = new Matrix(rows2, columns2);

        scanner.close();
    }
}
