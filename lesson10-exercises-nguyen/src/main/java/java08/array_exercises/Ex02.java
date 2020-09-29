package java08.array_exercises;

import java.util.Random;

public class Ex02 
{
    public static void main( String[] args )
    {
    	int[][] array = arrayRandom();
    	
    	printArray(array);
    	System.out.println("=================================");
    	array = digitToZero(array);
    	printArray(array);
        
    }
    
    public static int[][] arrayRandom() {
    	Random rd = new Random();
    	int hang=5,cot=4;
    	int[][] arr= new int[hang][cot];
    	for(int i = 0;i<hang;i++) {
    		for(int j=0;j<cot;j++) {
    			arr[i][j] = rd.nextInt(10);
    		}
    	}
    	
    	return arr;
    }
    public static int[][] digitToZero(int [][] arr){
		int hang=0,cot=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==0) {
					hang=i;
					cot=j;
					for(int k=0;k<arr.length;k++) {
						for(int m=0;m<arr[0].length;m++) {
							if(arr[k][cot]!=0||arr[hang][m]!=0) {
							arr[k][cot]=-1;
							arr[hang][m]=-1;
							}
						}
					}
				}
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==-1) {
					arr[i][j]=0;
				}
			}
		}
		
		return arr;
	}
    
    public static void printArray(int [][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
				if(j==arr[0].length-1) {
					System.out.print("\n");
				}
			}
		}
	}

}
