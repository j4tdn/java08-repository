package polymorphism.method;

public class MathUtils {
	//ham dung private
	private MathUtils() {
		
	}
	/**
	 overloading:
	 + cùng 1 class
	 + cùng tên
	 + phải khác số lượng tham số truyền vào,kiểu dl của tham số truyền vào, kiểu dl trả về
	 */
	public static  int max(int a,int b) {
		return a > b ? a : b;
	}
	// co the ap dung tim ucln, bcnn
	public static  int max(int ...numbers) {
		
		if(numbers.length==0) {
			System.out.println("IndexOutOfBoundException");
			return Integer.MIN_VALUE ;
		}
		int max=numbers[0];
		for(int num:numbers) {
			if(max<num) {
				max=max(max, num);}
			
		}
		return max;
	}

	public static  int max(int a,int b, int c) {
		return max(max(a, b),c);
	}
	
	public static  double max(double a,double b) {
		return a > b ? a : b;
	}
	

}// da hinh trong doi tuong: la doi tuong cua lop cha tro den lop con nay lop con khac nhau khi runtime
