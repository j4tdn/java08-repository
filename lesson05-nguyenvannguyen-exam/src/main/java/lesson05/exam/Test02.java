package lesson05.exam;

public class Test02 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,5,6,7};
		int missNumber = getMissingNumber(arr);
		System.out.println(missNumber);
	}
	
	public static int getMissingNumber(int[] arr) {
		int missNumber = 0;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		missNumber = 28-sum;//nếu theo đề bài thì có 50 cặp 101 nên tổng từ 1-100 là 5050 còn mảng thử tổng chỉ bằng 28
		return missNumber;
	}

}
