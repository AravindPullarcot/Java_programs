public class spiralmatrixfor3X3 {

    public static void main(String[] args) {


        //int[][] newMatirx = new int[4][4];
        // primitive and non-primitive ( arrays, class, interfaces, objects

        // float, int, char, double, short, long, boolean, byte

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6 },
                {7, 8, 9},

        };

        int top = 0;
        int left = 0;
        int right = 2 ;
        int bottom = 2;

       /* for (int i = 0; i <4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }*/
        //while (


            for (int i = top; i <= right; i++) {//Printing first row
                //for (int j = 0; j < 3; j++) {
                System.out.print(matrix[top][i] + ",");
            }
            top++;//incrementing top to start from [1][2]
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + ",");
            }
            right--;
            for (int i = right; i >= left; i--) {
                System.out.print(matrix[bottom][i] + "|,");
            }
            bottom--;
            for (int i = left; i <= top; i++) {
                System.out.print(matrix[bottom][i] + ",");
            }
            left++;
       // }
    }

}

