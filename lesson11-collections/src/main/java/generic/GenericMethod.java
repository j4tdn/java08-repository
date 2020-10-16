package generic;

public class GenericMethod {
	public static void main(String[] args) {
		
		Integer[] digits = { 1,2,3};
		
		Double[] doubles = {1d,2d,3d};
		
		Long[] longs = {1l,2l,3l};
		
		
		String[] strs = {"hello","there"};
		
		
//		show(digits);
//		show(doubles);
		//show(strs);
		
//		show(digits, new Conditional<Integer>() {
//
//			@Override
//			public boolean test(Integer digit) {
//				// TODO Auto-generated method stub
//				return digit %2 != 0 ;
//			}
//		}
//		);
		show(digits, digit -> digit %2 == 0);

//		show(digits, el -> el %2 !=0);
	}
	// khi extends Number thi digit no goi y ra nhung phuong thuc cua Number
	private static  <E extends Number> void show(E[] digits, Conditional<E> condition) {
		for(E digit : digits) {
			if(condition.test(digit)) {
				System.out.println(digit);
			}
		}
	}
}
