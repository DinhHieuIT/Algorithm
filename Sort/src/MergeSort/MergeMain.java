package MergeSort;

public class MergeMain {
	
	   public static void printArr(int[] arr) {
		   for (int i=0; i<arr.length;i++) {
			   System.out.print(arr[i]+ " ");
		   }
	   }
      
	   public static int[] breakArr(int[] arr) {
		   if(arr.length<=1) {
			   return arr;
		   }
		   
		   int midpoint = arr.length/2;
		   int[] left = new int[midpoint];
		   int[] right;
		  
		   if(arr.length % 2 == 0) {
			   right = new int[midpoint];
		   }else {
			   right = new int[midpoint+1];
		   }
		   
		   for(int i=0;i<midpoint; i++) {
			   left[i]=arr[i];
		   }
		   
		   for(int j=0;j<right.length;j++) {
			   right[j] = arr[midpoint +j];
		   }
		   
		   left = breakArr(left);
		   right = breakArr(right);
		  int[] result = new int[arr.length];
		  result = mergeArr(left,right);
		  
		  return result;
	   }
	   
	    public static int[] mergeArr(int[] left, int[] right) {
	    	
	    	int[] result = new int[left.length+right.length];
	    	int i,j,r;
	    	i=j=r=0;
	   
	    	while(i<left.length || j<right.length) {
	    		if(i<left.length && j<right.length) {
	    		if(left[i]<right[j]) {
	    			result[r] =left[i];
	    			r=r+1;
	    			i=i+1;
	    		}else {
	    			result[r]=right[j];
	    			r=r+1;
	    			j=j+1;
	    		}
	    		
	    		} else if (j<right.length) {
	    			result[r] =right[j];
	    			r=r+1;
	    			j=j+1;
	    		}else if (i<left.length) {
	    			result[r]=left[i];
	    			r=r+1;
	    			i=i+1;
	    		}
	    	}
	    	
	    	return result;
	    	
	    }
		
		public static void main(String args[]) {
			
			// Initial array with print out.
			int[] array = { 5, 4, 3, 2, 1 };
			System.out.println("Array before align :");
			printArr(array);
			System.out.println();
			System.out.println("Array after align :");
			int[] arr= breakArr(array);
			printArr(arr);
			
		}

}
