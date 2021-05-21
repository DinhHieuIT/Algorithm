package Quicksort;

public class QuicksortMain {
	
	// A utility function to swap two elements
	static void swap(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	 
	public static int breakArr (int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = (low -1);
		for (int j=low;j<=high-1;j++) {
			if(arr[j]<pivot) {
				i=i+1;
				swap(arr,i,j);	
			}
		}
		swap(arr,i+1,high);
		return (i+1);
	}
	 
	static void quickSort(int[] arr, int low, int high) {
		if (low <high) {
		int pi= breakArr(arr,low,high);
		quickSort(arr,low,pi-1);
		quickSort(arr,pi+1,high);
	}
	}
	// Function to print an array
	static void printArray(int[] arr, int size)
	{
	    for(int i = 0; i < size; i++)
	        System.out.print(arr[i] + " ");
	         
	    System.out.println();
	}
	 
	// Driver Code
	public static void main(String[] args)
	{
	    int[] arr = { 10, 7, 8, 9, 1, 5 };
	    int n = arr.length;
	    
	    quickSort(arr,0,n-1);
	    printArray(arr,n);
	  
	}
}
