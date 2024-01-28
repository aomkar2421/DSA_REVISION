package matrix;

public class EqualMatrix {
	public static void main(String[] args) {
		int[][] arr1 = {{2, 4, 5}, {8, 1, 3}, {9, 7, 6}};
        int[][] arr2 = {{2, 4, 5}, {8, 1, 3}, {9, 7, 6}};
        int count=0;
        for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				if (arr1[i][j]!=arr2[i][j]) {
					count++;
				}
			}
		}
        
        if (count>=1) {
			System.out.println("Not Same");
		}
        else {
			System.out.println("same");
		}
	}
}
