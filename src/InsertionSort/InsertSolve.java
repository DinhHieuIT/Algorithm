package InsertionSort;

public class InsertSolve {
	
	/*Function to sort array using insertion sort*/
    void sort(int arr[])
    {
       int valueToCompare;
       int arrLengthCompare;
       
       for(int i=1;i<arr.length;i++) {
    	   valueToCompare = arr[i];
    	   arrLengthCompare = i-1;
    	   while(arrLengthCompare>=0 && arr[arrLengthCompare] > valueToCompare ) {
    		   arr[arrLengthCompare +1] = arr[arrLengthCompare];
    		   arrLengthCompare--;
    	   }
    	   arr[arrLengthCompare +1]=valueToCompare;
       }
    }
    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
 
    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6 };
 
        InsertSolve ob = new InsertSolve();
        ob.sort(arr);
 
        printArray(arr);
    }

}
