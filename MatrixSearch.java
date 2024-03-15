package TwoDimensionalArray;

public class MatrixSearch {
    public static boolean search(int [][] matrix,int target){
        int row = 0;
        int column = matrix[0].length-1;

        while (row < matrix.length && column>=0){
            if (matrix[row][column]==target)
                return true;

            else if (target>matrix[row][column])
                row++;

            else
                column--;
        }

        return false;
    }

    public static void main(String[] args) {
        int [][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.print(search(matrix,50));
    }
}
