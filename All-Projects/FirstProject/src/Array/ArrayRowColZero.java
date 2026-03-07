package Array;

public class ArrayRowColZero {

	static int[][] arr = new int[3][3];
	static {
		arr[0][0] = 3;
		arr[0][1] = 4;
		arr[0][2] = 7;
		
		arr[1][0] = 5;
		arr[1][1] = 0;
		arr[1][2] = 8;
		
		arr[2][0] = 7;
		arr[2][1] = 2;
		arr[2][2] = 9;
	}
	public static void main(String[] args) {
		System.out.println("Current Array: ");
		print2DArray(arr);
		boolean[] row = new boolean[arr.length];
		boolean[] col = new boolean[arr[0].length];
		
		for (int i = 0; i < arr.length; i++) 
			for (int j = 0; j < arr[0].length; j++)
				if (arr[i][j]==0) {
					row[i] = true;
					col[j] = true;
				}
		
		for (int i = 0; i < arr.length; i++) if (row[i]) for (int j = 0; j < arr[0].length; j++) arr[i][j] = 0;
		for (int j = 0; j < arr[0].length; j++) if (col[j]) for (int i = 0; i < arr.length; i++) arr[i][j] = 0;
		System.out.println("Modified Array:");
		print2DArray(arr);
	}

	public static void print2DArray(int[][] arr2D) {
		if (arr2D!=null) for(int[] arr1D: arr2D) {
			for (int element: arr1D) System.out.print(element + " ");
			System.out.println();
		}
	}
	
}
