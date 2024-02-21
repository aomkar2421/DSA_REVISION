package matrix;

public class Spiral {
	public static void main(String[] args) {
		
        int[][] arr = {{11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}, {26,27,28,29,30}, {31,32,33,34,35}, };

        Print.printArray(arr);
        
        int topRow = 0;
        int bottomRow = arr.length-1;
        int leftColumn = 0;
        int rightColumn = arr[0].length;

        
        while (1==1) {
			
        	for (int i = leftColumn; i < rightColumn; i++) {
				System.out.println(arr[topRow][i]);
			}
        	
        	for (int i = topRow; i < bottomRow; i++) {
				System.out.println(arr[i][rightColumn]);
			}
        	
        	for (int i = rightColumn; i < leftColumn; i--) {
				System.out.println(arr[bottomRow][i]);
			}
        	
        	for (int i = leftColumn; i < rightColumn; i++) {
				System.out.println(arr[bottomRow][i]);
			}
        	
        	for (int i = leftColumn; i < rightColumn; i++) {
				System.out.println(arr[0][i]);
			}
        	
        	
		}
		
	}
}
