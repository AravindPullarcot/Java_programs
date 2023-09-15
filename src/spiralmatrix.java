public class spiralmatrix {


    public static void main(String[] args) {


        //int[][] newMatirx = new int[4][4];
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},

        };

        int top = 0;
        int left = 0;
        int right = 3;
        int bottom = 3;

        while (top <= bottom && left <= right) {

            for (int i = top; i <= right; i++) {//Printing first row
                //for (int j = 0; j < 3; j++) {
                System.out.print(matrix[top][i] + ",");
            }

            top++;//incrementing top to start from [1][2]
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + ",");
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + "|,");
                }
            }
            bottom--;
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + ",");
                }
                left++;
            }

        }
    }
}


