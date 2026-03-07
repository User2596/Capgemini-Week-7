package Array;

public class ColumnMatrixIdentifier {

	public static void main(String[] args) {
		int[][] arr = null;
		System.out.println("Given matrix:");
		print2DArray(arr);
		if (isColumnMatrix(arr)) System.out.println("It is a column matrix!");
		else System.out.println("It is not a column matrix!");
	}

	public static boolean isColumnMatrix(int[][] arr2D) {
		if (arr2D==null || arr2D.length<1) return false;
		for (int[] arr1D : arr2D) if (arr1D.length!=1) return false;
		return true;
	}
	public static void print2DArray(int[][] arr2D) {
		if (arr2D!=null) for(int[] arr1D: arr2D) {
			for (int element: arr1D) System.out.print(element + " ");
			System.out.println();
		}
	}
}