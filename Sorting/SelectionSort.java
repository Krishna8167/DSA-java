import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		int[] arr = {2, 5, 6, 7, 0};
		
		SelectionSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void SelectionSort(int[] arr) {
	    
	    for (int i = 0; i < arr.length ; i++) {
	        int last = arr.length - i - 1;
	        
	        for (int j = 0 ; j <= last; j++) {
	            
	            if (arr[j] > arr[last]) {
	                
	                int temp = arr[j];
	                arr[j] = arr[last];
	                arr[last] = temp;
	                
	            } 
	        }
	    }
	}
	
	
}
