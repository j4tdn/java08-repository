package Ex03;

public class Ex03 {

	
	public static void main(String[] args) {
		String s = "xyz";
		char[] x = s.toCharArray();
		int[] bool = new int[s.length()];//Đánh dấu chưa có phần tử nào sử dụng hết
		char[] str = new char[s.length()];//Lưu hoán vị vào mảng A
		String[] result = new String[10];
		int count = 0;
		
		permutation(0, x, bool, str, result, count);
		
		for (int i = 0; i < count; i++) 
			System.out.println(result[i]);
	}
	
	public static String[] addToStringArray(String[] result, char[] str, int count) {
		StringBuilder builder = new StringBuilder();
		for (char c : str)
			builder.append(c);
		
		System.out.println(builder.toString());
		result[count] = builder.toString();		
		count++;
		
		return result;
	}
	
	public static void permutation(int k, char[] x, int[] bool, char[] str, String[] result, int count) {
		for (int i = 0; i < x.length; i++) {
			if (bool[i] == 0) {
				str[k] = x[i];
				bool[i] = 1;
				if (k == x.length - 1) {
					addToStringArray(result, str, count);
				} 
				else {
					permutation(k + 1, x, bool, str, result, count);
				}
				bool[i] = 0;
			}
		}
	}

}
