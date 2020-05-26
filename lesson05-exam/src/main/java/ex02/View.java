package ex02;

public class View {

	public static void main(String[] args) {
		int[] arrayNumber = {1,2,3,4,5,6,8,9,10};
		MissNumber missNumber = new MissNumber();
		System.out.println(missNumber.getMissingNumber(arrayNumber));
	}

}
