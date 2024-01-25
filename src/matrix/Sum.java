package matrix;

public class Sum {
	public static void main(String[] args) {
		
		int [][] arr1 = {{2,4,5},{8,1,3,5,1},{9,7,6,9}}; 
		int [][] arr2 = {{2,4,5,7},{8,1,3},{9,7,6}}; 		
		int [][] sum = new int[3][3];
		
		printArray(arr1, arr2, sum);

		
	}
	static void printArray(int [][] arr1, int [][] arr2, int [][] sum) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				sum[i][j] = arr1[i][j] + arr2[i][j];
			}
			System.out.println();
		}
	}
}
