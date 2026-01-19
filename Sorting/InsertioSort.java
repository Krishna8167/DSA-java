import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		int[] arr = {2, 5, 6, 7, 0};
		
		InsertionSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void InsertionSort(int[] arr) {
	    
	    for (int i = 1; i < arr.length - 1; i++) {
	        for (int j = i + 1; j > 0; j--) {
	            
	            if (arr[j] < arr[j-1]) {
	                //swap
	                int temp = arr[j];
	                arr[j] = arr[j-1];
	                arr[j-1] = temp;
	                
	            } else { 
	                break;
	            }
	        }
	    }
	}
	
	
}
