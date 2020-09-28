package arrays;

import java.util.Arrays;

public class Ex01 
{
    public static void main( String[] args ){
        int[] arrs= {1,2,3,4,3,1};
        removeDuplicate(arrs);
        compareAverageOfElementsInArray(arrs);
        insertionSort(arrs);
        findElement3rdLargestInArray(arrs);
    }
    
    private static void removeDuplicate(int[] arrs) {
    	System.out.println("Remove elements duplicate in array :");
    	
    	Arrays.stream(arrs)
    	.distinct()
    	.forEach(System.out::println);
    	
    	System.out.println("--------------");
    }
    
    private static void compareAverageOfElementsInArray(int[] arrs) {
    	System.out.println("Compare average of elements in array: ");
    	 int i = arrs.length;
    	
    	 double sumfirst =Arrays.stream(arrs)
    			 				.skip(0)
    			 				.limit(5)
    			 				.sum();
    	// System.out.println(sumfirst);
    	 
    	 double sumlast = Arrays.stream(arrs)
    			 				.skip(i-5)
    			 				.limit(i)
    			 				.sum();
    	// System.out.println(sumlast);
    	 
    	 if(sumfirst>sumlast) {
    		 System.out.println("The average value first "+">"+" The average value last" );
    	 }
    	 else if(sumfirst==sumlast)
    	 {
    		 System.out.println("The average value first "+"="+" The average value last" );
    	 }
    	 else
    	 {
    		 System.out.println("The average value first "+"<"+" The average value last" );
    	 }
    	 
    	 System.out.println("------------");
    	 
    }
    private static void insertionSort(int[] arrs) {
    	System.out.println("Insertion sort in array: ");
    	
    	for (int i=1;i<arrs.length;i++) {
    		int val = arrs[i];
    		int index = i;
    		while(index > 0 && arrs[index - 1] > val) {
    			arrs[index] = arrs[index - 1];
    			index --;
    		}
    		arrs[index] = val;
    	}
    	Arrays.stream(arrs).forEach(System.out::println);
    	
    	System.out.println("----------");
    }
    private static void findElement3rdLargestInArray(int[] arrs) {
    	
    	insertionSort(arrs);
    	System.out.println("Element 3rd largest in array: ");
    	int index=1;
    	int max3=arrs[0];
    	for(int i=0;i<arrs.length;i++) {
    		if(max3<arrs[i]) {
    			index++;	
    		}
    		if (index==3) {
				System.out.println(arrs[i]);
				break;
			}
    	}
    	
    }
    
}
