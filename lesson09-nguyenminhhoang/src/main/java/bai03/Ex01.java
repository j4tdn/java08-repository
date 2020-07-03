package bai03;

public class Ex01 {
	public static void main(String[] args) {
		// hàm tách string thành mảng char : arayChar(string s)
		//xử lý tạo các hoán vị của mảng và in ra
		
		
	}

	public static char[] arrayChar(String s) {
		char[] cs = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			cs[i] = s.charAt(i);
		}
		return cs;
	}
}
