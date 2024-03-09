package matrix;

public class Spiral {
	public static void main(String[] args) {
		
        int[][] arr = {{11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}, {26,27,28,29,30}, {31,32,33,34,35}, };

        Print.printArray(arr);
        printSpiral(arr);
		
	}
	static void printSpiral(int [][] arr) {
		int topRow = 0;
        int bottomRow = arr.length-1;
        int leftColumn = 0;
        int rightColumn = arr[0].length-1;
        int totalElements = 0;
        int row = arr.length;
        int column = arr[0].length;

        System.out.println("SPIRAL\n");
        
        while (totalElements < row * column) {
        	for (int i = leftColumn; i <= rightColumn; i++) {
				System.out.print(arr[topRow][i]+" ");
				totalElements++;
			}
        	topRow++;
        	
        	for (int i = topRow; i <= bottomRow; i++) {
				System.out.print(arr[i][rightColumn]+" ");
				totalElements++;
			}
        	rightColumn--;
        	
        	for (int i = rightColumn; i >= leftColumn; i--) {
				System.out.print(arr[bottomRow][i]+" ");
				totalElements++;
			}
        	bottomRow--;
        	
        	for (int i = bottomRow; i >= topRow; i--) {
				System.out.print(arr[i][leftColumn]+" ");
				totalElements++;
			}
        	leftColumn++;
		}
	}
}
