package lc;

public class RemoveDupli_2 {
	public static void main(String[] args) {
		int [] arr = {0,0,1,1,1,1,2,3,3};
		Printa.print(arr);
		method(arr);
	}
	
	public static void method(int[] arr) {
		if(arr.length<=2){
			System.out.println("Nothing");
            return;
        }
        int j=0;
        int i;
        
        for(i=0;i<arr.length-2;i++){
            if(arr[i]!=arr[i+2]){
                arr[j] = arr[i];
                j++;
            }
        }
        
        while(i<arr.length){
            arr[j] = arr[i];
            j++;
            i++;
        }

		Printa.print(arr);
    }
}
