package BinarySearch;

public class BinarySeachSolve {
	
	  int binarySearch(int arr[], int low, int high, int number) {
		  if(high>=low) {
		  int midpoint = low +(high-low)/2;
		  
		  if(arr[midpoint] == number) {
			  return midpoint;
		  }else if (arr[midpoint] >number) {
			  return binarySearch(arr,midpoint +1,high,number);
		  }else if(arr[midpoint]<number) {
			  return binarySearch(arr,low,midpoint-1,number);
		  }
		  }
		  
		  return -1;
	  
	    } 

	public static void main(String[] args) {
		BinarySeachSolve ob = new BinarySeachSolve(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int x =ob.binarySearch(arr, 0, arr.length-1, 4);
        System.out.println("Vị trí xuất hiện số 4 là " + x);
       
    } 
	}


