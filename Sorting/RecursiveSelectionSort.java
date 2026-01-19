import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		int[] arr = {22, 19, 15, 3, 5};
		
		SelectionSort(arr, arr.length, 0, 0);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void SelectionSort(int[] arr, int r , int c, int max) {
	    
	    if (r == 0) {
	        return;
	    }
	   
	   if (c < r) {
	       if (arr[c] > arr[max]) {
	           SelectionSort(arr, r, c+1, c);
	       } else {
	           SelectionSort(arr, r, c+1, max);
	       }
	   } else {
	       swap(arr, r-1, max);
	       SelectionSort(arr, r-1, 0, 0);
	   }
	       
	}
	
	static void swap(int[] arr, int first, int second) {
	    
	    int temp = arr[first];
	    arr[first] = arr[second];
	    arr[second] = temp;
	    
	}
	
	
}
