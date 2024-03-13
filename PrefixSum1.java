package TwoDimensionalArray;
import java.util.*;

public class PrefixSum1 {
	
	public static int findSumMatrix(int arr[][],int r1,int c1,int r2,int c2) {
		int sum = 0;
		
		for(int i = r1; i<=r2; i++) {
			for(int j = c1; j<=c2; j++) {
				sum+=arr[i][j];
			}
		}
		
		return sum;
	}
	
	public static void prefixSumMatrix(int [][]arr) {
		
		int m = arr.length;
		int n = arr[0].length;
		
		//Traversed the array in row-wise to calculate prefix sum
		for(int i = 0 ; i < m ; i++ ) {
			for(int j = 1 ; j < n ; j++) {
				arr[i][j]+=arr[i][j-1];
			}
		}
		
		//Traversed the array in column-wise to calculate the prefix sum
		for(int j = 0 ; j < n ; j++) {
			for(int i = 1; i < m; i++) {
				arr[i][j]+=arr[i-1][j];
			}
		}
		
	}
	
	public static int sumRegion(int [][]arr,int r1,int c1,int r2,int c2) {
		int sum=0;
		int up=0;
		int left=0;
		int common_region=0;
		
		sum = arr[r2][c2];
		up = arr[r1-1][c2];
		left = arr[r2][c1-1];
		common_region = arr[r1-1][c1-1];
		
		int result = sum-up-left+common_region;
		return result;
		
		
	}

	public static void main(String[] args) {
	 
		    Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of row ");
			int m = sc.nextInt();
			  
			System.out.println("Enter the number of column ");
			int n=sc.nextInt();
			
			int arr[][] = new int[m][n];
			
			for (int i = 0; i < m; i++) 
			{
				for(int j = 0; j < n; j++) {
					
					arr[i][j]=sc.nextInt();
				}
		    }
			
			int r1,c1,r2,c2;
			
			System.out.println("Enter the value of r1");
			r1 = sc.nextInt();
			
			System.out.println("Enter the value of c1");
			c1 = sc.nextInt();
			
			System.out.println("Enter the value of r2");
			r2 = sc.nextInt();
			
			System.out.println("Enter the value of c2");
			c2 = sc.nextInt();
	
			
			//int result = findSumMatrix(arr,r1,c1,r2,c2);
			
			prefixSumMatrix(arr);
			int result = sumRegion(arr,r1,c1,c2,c2);
			
			System.out.println(result);
			
			sc.close();
		   
			
		
		
		
		
		

	}

}
