//package array;
//
//public class RemoveDuplicates {
//	public static void main(String[] args) {
//		int [] arr = {3 ,9 ,11 ,2 ,350 ,57 ,9 ,11 ,56 ,3 ,23 ,57};
//		
//		int a = findDuplicates(arr);
//		int [] arr2 = new int [arr.length-a+1];
//		
//		arr2 = removeDupli(arr,arr2);
//		printArray(arr2);
//	}
//
//	static int [] removeDupli(int[] arr, int[] arr2) {
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					int index = i;
//					
//					for (int i1 = 0; i1 < index; i1++) {
//						arr2[i1] = arr[i1];
//					}
//					
//					for (int i1 = index; i1 < arr2.length; i1++) {
//						arr2[i1] = arre[i1+1];
//					}
//					
//				}
//			}
//		}
//		return arr2;
//	}
//
//	static int findDuplicates(int[] arr) {
//		int count = 0;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					count ++;
//				}
//			}
//		}
//		return count;
//	}
//	
//	static void printArray(int [] arr){
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//	}
//	
//}
