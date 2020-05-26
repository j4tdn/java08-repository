package Bai01;

public class Bai01 {
public static void main(String[] args) {
	
	int[] A= {3,5,21,4,2};
	
	
}
public static int[] getUniqueNumbers(int[] A) {
	int tmp;
	for (int i = 0; i <A.length-1; i++) {
		for(int j=i+1;j<A.length;j++) {
			if(A[i]>A[j])
			{
				tmp=A[j];
				A[j]=A[i];
				A[i]=A[j];
				
			}
			   
		}System.out.println(A);
	}	
	return A;
	
}
}
