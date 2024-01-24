package matrix;

public class Sum {
	public static void main(String[] args) {
		
		int [][] arr1 = {{2,4,5},{8,1,3,5,1},{9,7,6,9}}; 
		int [][] arr2 = {{2,4,5,7},{8,1,3},{9,7,6}}; 
		printArray(arr1);
		
		int [][] sum = 
		
	}
	static void printArray(int [][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
