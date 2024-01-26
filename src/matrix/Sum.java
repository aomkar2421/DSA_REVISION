package matrix;

public class Sum {
	public static void main(String[] args) {
		
		int [][] arr1 = {{2,4,5},{8,1,3},{9,7,6}}; 
		int [][] arr2 = {{4,7,3},{9,27,45},{19,70,26}}; 		
		int [][] sum = new int[3][3];
		
		sum = addArray(arr1, arr2, sum);
		printArray(sum);
		
	}
	private static void printArray(int[][] sum) {
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
	static int[][] addArray(int [][] arr1, int [][] arr2, int [][] sum) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				sum[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return sum;
	}
}
