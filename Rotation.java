package TwoDimensionalArray;
import java.util.*;


public class Rotation {
	
	public static void rotatedMatrix(int[][] array) {
		
		//Step 1 : Transport the 2D array
		int m = array.length;         //Row
		int n = array[0].length;      //Column
		
		for(int i = 0; i < m; i++) {
			for(int j = i; j < n; j++) {
				int temp = array[i][j];
				array[i][j]=array[j][i];
				array[j][i]=temp;
				
			}
		}
		
		//Step 2: Interchange first and last column
		
		for(int i = 0; i <m; i++) {
			int li = 0;
			int ri = m-1;
			
			while(li < ri) {
			   int temp = array[i][li];
			   array[i][li] = array[i][ri];
			   array[i][ri] = temp;
			   li++;
			   ri--;
			   
			}
		}
		
	}

	public static void main(String[] args) {
		//Rotation of the 2D array
		
		int Matrix [][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		rotatedMatrix(Matrix);
		
		for(var mat:Matrix) {
			System.out.println(Arrays.toString(mat));
		}
		
	}

}
