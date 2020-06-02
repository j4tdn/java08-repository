package lesson05.exam;

public class Test01 {
	public static void main(String[] args) {
		int[] arr= {4,6,9,4,9,2};
		int[]arrB= new int[arr.length];
		getUniqueNumbers(arr, arrB);
		shotArr(arrB);
		printfArray(arrB);
	}
	
	public static int[] getUniqueNumbers(int[] arr,int[] arrB) {
		int a=0;
		for(int i=0; i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]&&arr[i]!=-1) {
					count++;
					arr[j]=-1;
				}
			}
			if(count==1) {	
				arrB[a++]=arr[i];
			}
		}
		return arr;
	}
	
	public static int[] shotArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int tem=0;			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					tem=arr[i];
					arr[i]=arr[j];
					arr[j]=tem;
				}
			}
		}
		return arr;
	}
	
	public static void printfArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=-1&&arr[i]!=0) {
				System.out.print(arr[i]+", ");
			}
		}
	}

}
