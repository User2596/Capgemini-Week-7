package Array;

public class MultiArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{9, 4, 7}, {}, {2, 5}};
		int[][] arr1 = new int[2][2];
//		arr[1][0] = 4;
		System.out.println("Max possible elements: " + array2DMax(arr));
		print2DArray(arr);
		System.out.println();
		System.out.println("Max possible elements: " + array2DMax(arr1));
		print2DArray(arr1);
		System.out.println();
		
	}
	
	public static int array2DMax(int[][] arr2D) {
		int count = 0;
		for (int[] arr1D : arr2D) count += arr1D.length;
		return count;
	}
	
	public static void print2DArray(int[][] arr2D) {
		for(int[] arr1D: arr2D) {
			for (int element: arr1D) System.out.print(element + " ");
			System.out.println();
		}
	}
}
