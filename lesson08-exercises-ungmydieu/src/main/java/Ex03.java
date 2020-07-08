
public class Ex03 {
	public static void main(String[] args) {
		String s = "Em có yêu anh không anh để anh biết còn chờ\r\n" + 
				"Em xin lỗi em đã có thái độ không đúng với anh";

		String upperCaseRegex = "ĂÂÁẮẤÀẰẦẢẲẨÃẴẪẠẶẬÊÉẾÈỀẺỂẼỄẸỆIÍÌỈĨỊÔƠÓỐỚÒỒỜỎỔỞÕỖỠỌỘỢƯÚỨÙỪỦỬŨỮỤỰÝỲỶỸỴ";
		String lowerCaseRegex = upperCaseRegex.toLowerCase();

		s = s.replaceAll("[ăâáắấàằầảẳẩãẵẫạặậ]", "a");
		s = s.replaceAll("[êéếèềẻểẽễẹệ]", "e");
		s = s.replaceAll("[iíìỉĩị]", "i");
		s = s.replaceAll("[ôơóốớòồờỏổởõỗỡọộợ]", "o");
		s = s.replaceAll("[ưúứùừủửũữụự]", "u");
		s = s.replaceAll("[ýỳỷỹỵ]", "y");
		
		System.out.println(s);
	}
}
