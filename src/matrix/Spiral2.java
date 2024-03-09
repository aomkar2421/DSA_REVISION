package matrix;

public class Spiral2 {
	public static void main(String[] args) {
		
		int n = 5;
		int [][] arr = new int [n][n];
		
		int leftColumn = 0;
		int rightColumn = arr[0].length-1;
		int topRow = 0;
		int bottomRow = arr.length-1;
		int counter = 1;
		int a = n*n;
		while (counter <= a) {
			for(int i=leftColumn; i<=rightColumn; i++) {
				System.out.println(counter);
				arr[topRow][i]=counter++;
			}
			topRow++;
			
			for(int i=topRow; i<=bottomRow; i++) {
				System.out.println(counter);
				arr[i][rightColumn]=counter++;
			}
			rightColumn--;
			
			for(int i=rightColumn; i>=leftColumn; i--) {
				System.out.println(counter);
				arr[bottomRow][i]=counter++;
			}
			bottomRow--;
			
			for(int i=bottomRow; i>=topRow; i--) {
				System.out.println(counter);
				arr[i][leftColumn]=counter++;
			}
			leftColumn++;
			
		}
		Print.printArray(arr);
	}
}
