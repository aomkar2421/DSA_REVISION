package array;

import java.util.ArrayList;

public class OddEven {
	public static void main(String[] args) {
		int [] arr = {3,9,10,23,36,57,80,101};

		ArrayList <Integer> al1 = new ArrayList<Integer>();
		ArrayList <Integer> al2 = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				al1.add(arr[i]);
			} else {
				al2.add(arr[i]);
			}
		}
		System.out.println("Even Elements "+al1);
		System.out.println("Odd Elements "+al2);
	}
}
