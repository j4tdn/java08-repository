package ex;

import utils.StringUtils;

public class Ex03 {
	public static void main(String[] args) {
		String input = "Em có yêu anh không anh để anh biết còn chờ\r\n" + 
				"Em xin lỗi em đã có thái độ không đúng với anh"; 
				System.out.println("Output: "+ StringUtils.removeDiacritic(input));
	}
}
