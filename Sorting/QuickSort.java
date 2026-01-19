import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		int[] arr = {22, 19, 15, 3, 5};
		
		QuickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void QuickSort(int[] arr, int low , int hi) {
	    
	    if (low >= hi) {
	        return;
	    }
	  
	  int s = low;
	  int e = hi;
	  
	  int m = s +(e - s) / 2;
	  int pivot = arr[m];
	  
	  while (s <= e) {
	      
	      while (arr[s] < pivot) {
	          s++;
	      }
	      while (arr[e] > pivot) {
	          e--;
	      }
	      // Out of while loop means there is violation and thenn check for is it that start is smaller than end , as beacuse we dont want repeatation of the swapping.
	      if (s <= e) {
	          int temp = arr[s];
	          arr[s] = arr[e];
	          arr[e] = temp;
	          s++;
	          e--;
	      }
	  }
	  //Divide and conquer here;
	  QuickSort(arr, low, e);
	  QuickSort(arr, s, hi);
	}
}
