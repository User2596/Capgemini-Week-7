package Array;

import java.util.Scanner;

public class Array2DUserInput {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter nxn 2D array row/column size: ");
		int n = sc.nextInt();
		int arr[][] = scan2DArray(n, n);
		
		
		System.out.println("User given 2D Array: ");
		print2DArray(arr);
	}
	
	public static void print2DArray(int[][] arr2D) {
		for(int[] arr1D: arr2D) {
			for (int element: arr1D) System.out.print(element + " ");
			System.out.println();
		}
	}
	
	public static int[][] scan2DArray(int m, int n) {
		int[][] arr = new int[m][n];
		System.out.print("Enter 2D array elements: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}
	
}
