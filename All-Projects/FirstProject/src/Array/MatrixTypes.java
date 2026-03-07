package Array;

import java.util.Scanner;

public class MatrixTypes {
	public static void main(String[] args) {
		int[][] arr = {{2}, {3}};
		arr = array2DScanner();
		
		array2DPrinter(arr);
		if (!isArrayMatrix(arr)) {
			System.out.println("Given array is not a matrix");
			return;
		}
				
		System.out.print("Given matrix is a");
		if(squareMat(arr)) {
			System.out.print(" square");
			if(nullMat(arr)) {
				System.out.print(", null");
			}
			if(identityMat(arr)) {
				System.out.print(", identity");
			}
			if(diagonalMat(arr)) {
				System.out.print(", diagonal");
			}
		} else {
			System.out.print(" rectangle");
		}
		
		if(rowMat(arr)) {
			if (colMat(arr)) {
				System.out.print(", singleton");
			}
			System.out.print(", row");
		}
		if(colMat(arr)) {
			System.out.print(", column");
		}
		
		System.out.println(" matrix.");
	}
	
	public static boolean rowMat(int[][] arr) {
		return (arr.length==1);
	}
	
	public static boolean colMat(int[][] arr) {
		return (arr[0].length==1);
	}
	
	public static boolean squareMat(int [][] arr) {
		return (arr.length==arr[0].length);
	}
	
	public static boolean nullMat(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]!=0) return false;
			}
		}
		return true;
	}
	
	public static boolean diagonalMat(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
	        for(int j=0;j<arr[0].length;j++) {
	            if(i==j) {
	                if(arr[i][j] == 0) return false;
	            } else {
	                if(arr[i][j] != 0) return false;
	            }
	        }
	    }
	    return true;
	}
	
	public static boolean identityMat(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(i==j) {
					if(arr[i][j]!=1) return false;
				} else{
					if(arr[i][j]!=0) return false;
				}
			}
		}
		return true;
	}
	
	public static void array2DPrinter(int[][] arr2D) {
		System.out.println("Given array is: ");
		for(int[] arr1D: arr2D) {
			for (int element: arr1D) System.out.print(element + " ");
			System.out.println();
		}
	}
	
	public static int[][] array2DScanner() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows in the matrix: ");
		int r=sc.nextInt();
		System.out.print("Enter number of columns in the matrix: ");
		int c=sc.nextInt();
		int [][] arr=new int[r][c];
		System.out.println("Enter matrix elements: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
		return arr;
	}
	
	public static boolean isArrayMatrix(int[][] arr) {
		if (arr==null) return false;
		if (arr.length==0 || arr[0].length==0) return false;
		for (int i=1; i<arr.length; i++) {
			if (arr[i].length != arr[0].length) return false;
		}
		return true;
	}
}