public class Main {
    public static void main(String[] args) {


        int[][] MatrixA = {{12, 2, 4,}, {10, 1, 1}};
        int[][] MatrixB = {{2, 2,}, {1, 2}, {1, 1}};
        int R1 = 2;// number of rows for matrix A
        int R2 = 3;  // number of rows for matrix B
        int C1 = 3; // number of columns for matrixA
        int C2 = 2;// number of columns for matrix B


        MatrixMultiplication(MatrixA, MatrixB, R1, C1, R2, C2);
    }

    public static void MatrixMultiplication(int[][] MatrixA, int[][] MatrixB, int mARows, int mAColumns, int mBRows, int mBColumns) {
        if (mARows != mBColumns) {
            throw new IllegalArgumentException(" ");

        }
        int[][] MatrixC = new int[mARows][mBColumns];

        /*
         *  so with matrix multiplication, the first row of the first element
         * is convolved with the   1... n of the  columns in the second matrix .
         * that is exactly what this loop does , the first loop  ensures  we are within the
         * constraint of the   length of the row in the first matrix, the second loop ensures we
         * are within the constraints of the column length in the second matrix  and finally the
         * last loop ensures we are within the constraints of the Column length in A which is essentially
         *  number of rows in A.
         *
         * */

        for (int i = 0; i < mARows; i++) {
            for (int j = 0; j < mBColumns; j++) {
                for (int k = 0; k < mAColumns; k++) {
                    MatrixC[i][j] += MatrixA[i][k] * MatrixB[k][j];
                }
            }

        }
        DisplayMatrix(MatrixC, mARows, mBColumns);

    }




    /**
     * method that prints the matrix when called and given the appropriate arguments.
     *
     * @param Matrix
     * @param row
     * @param column
     */
    public static void DisplayMatrix(int[][] Matrix, int row, int column) {

        /*
         *  since the resultant matrix   we end up with  is a matrix with a row and colum, we
         *  iterate through  the row with i and the column with j and print them out .
         */
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < row; i++) {
            System.out.print("|");
            for (int j = 0; j < column; j++) {

                System.out.print(Matrix[i][j] + " ");


            }
            System.out.print("|");
            System.out.println();
        }

    }

}

