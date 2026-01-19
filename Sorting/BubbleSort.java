import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		int[] arr = {1, 5, 7, 3, 9};
		
		BubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void BubbleSort(int[] arr) {
	    boolean swapped;
	    for (int i = 0; i < arr.length - 1; i++) {
	        swapped = false;
	        for (int j = 0 ; j < arr.length - i - 1; j++) {
	            
	            if (arr[j] > arr[j+1]) {
	                
	                int temp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = temp;
	                swapped = true;
	            } 
	        }
	        // If you did not swapped for the particular value of i , that means that your array is sorted.
	        if(!swapped) {
	            break;
	        }
	    }
	}
	
	
}
