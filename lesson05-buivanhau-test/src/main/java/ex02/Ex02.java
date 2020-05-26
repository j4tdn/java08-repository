package ex02;

public class Ex02 {

	public static int getMissingNumber(int[] nums) {
		for (int i = 1; i <= nums[nums.length - 1]; i++) {
			if (nums[i - 1] != i) {
				return i;
			}
		}
		System.out.println("NO MISSING NUMBER");
		return Integer.MIN_VALUE;
	}

}
