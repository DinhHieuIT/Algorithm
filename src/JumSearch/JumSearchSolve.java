package JumSearch;

public class JumSearchSolve {
	
	public static int jumpSearch(int[] arr, int number) 
    { 
	int step = (int) Math.floor(Math.sqrt(arr.length));
	int indexEndArr = step-1;
	
	while(arr[indexEndArr]<number && indexEndArr<arr.length) {
		indexEndArr = indexEndArr +step;
	}
	
	int indexStartArr = indexEndArr-step+1;
	
	for(int i = indexStartArr; i<=indexEndArr; i++) {
		 if (arr[i] == number) {
			 return i;
		 }
	}
	return -1;

   }
    // Driver program to test function 
    public static void main(String [ ] args) 
    { 
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8,9}; 
        int x = 4; 
  
        // Find the index of 'x' using Jump Search 
        int index = jumpSearch(arr, x); 
  
        // Print the index where 'x' is located 
        System.out.println("\nNumber " + x + 
                            " is at index " + index); 
    } 
 } 


