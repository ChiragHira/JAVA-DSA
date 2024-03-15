package TwoDimensionalArray;

public class SpiralMatrix {
    public static void printSpiral(int[][] matrix,int r,int c){
        int startRow = 0;
        int endRow = r-1;
        int startColumn = 0;
        int endColumn = c-1;

        while (startRow<=endRow && startColumn<=endColumn){
            //print top element
            for (int j = startColumn; j <= endColumn; j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            //print right most element
            for (int i = startRow+1; i <= endRow; i++){
                System.out.print(matrix[i][endColumn]+" ");
            }

            //print bottom element
            for (int j = endColumn-1; j>=startColumn; j--){
                if (startRow==endRow)
                    break;

                System.out.print(matrix[endRow][j]+" ");
            }

            //print left most element
            for (int i = endRow-1; i>=startRow+1; i--){
                if (startColumn==endColumn)
                    break;
                System.out.print(matrix[i][startColumn]+" ");
            }

            startRow++;
            endRow--;
            startColumn++;
            endColumn--;
        }
    }

    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};
        printSpiral(matrix,3,3);
    }
}
