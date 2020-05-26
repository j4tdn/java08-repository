package view;

import java.awt.List;
import java.util.ArrayList;

public class Bai1 {

	public static void main(String[] args) {
		int[] array = {1,9,6,6,8,4,1,0,5,9};
		int[] output = getUniqueNumbers(array);
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}
	
	public static int[] getUniqueNumbers(int[] array) {
		int length = 0;
		boolean duplicate = false;
        for (int i = 0; i < array.length; i++) { 
        	duplicate = false;
            for (int j = 0; j < array.length; j++) {
            	if (array[i] == array[j] && i != j) {  
            		duplicate = true;
            		break;
            	}
            }
            if (duplicate == false) {
            	length++;
            }
        }
        int[] output = new int[length];
        int index = 0;
        for (int i = 0; i < array.length; i++) { 
        	duplicate = false;
            for (int j = 0; j < array.length; j++) {
            	if (array[i] == array[j] && i != j) {  
            		duplicate = true;
            		break;
            	}
            }
            if (duplicate == false) {
            	output[index] = array[i];
            	index++;
            }
        }
        return output;
	}

}
