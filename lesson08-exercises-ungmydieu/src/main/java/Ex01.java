
public class Ex01 {
	public static void main(String[] args) {
		String str = "họ Tên ngày sinh";
		String upperCaseRegex = "ĂÂÁẮẤÀẰẦẢẲẨÃẴẪẠẶẬÊÉẾÈỀẺỂẼỄẸỆIÍÌỈĨỊÔƠÓỐỚÒỒỜỎỔỞÕỖỠỌỘỢƯÚỨÙỪỦỬŨỮỤỰÝỲỶỸỴ";
		String lowerCaseRegex = upperCaseRegex.toLowerCase();
		String regex = "[" + upperCaseRegex + lowerCaseRegex + "\\s]";		
		
		StringBuilder chars = new StringBuilder();
		
		StringBuilder word = new StringBuilder();

		System.out.println("Vietnamese characters:");
		for (String i : str.split("[A-Za-z0-9]+")) {
			chars.append(i);
			System.out.println(i);
		}
		
		System.out.println("Words:");
		for (String i : str.split("[\\s]+")) {
			word.append(i + " ");
			System.out.println(i);			
		}
		System.out.println("=====================");
		System.out.println("Chars reverse: " + chars.reverse());
		System.out.println("Word reverse: " + word.reverse());
	}
}
