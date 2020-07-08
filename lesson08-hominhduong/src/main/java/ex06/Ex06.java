package ex06;

public class Ex06 {
	public static void main(String[] args) {
		// Un = U1 _ (n-1)d, n>=2, d: cong sai
		int position = 100;
		String numbers = "";
		int i = 1;
		while (numbers.length() < position) {
			numbers += String.valueOf(i);
			i++;
		}
		if (numbers.length() > position) {
			numbers.substring(0, position);
		}
		System.out.println(numbers);
		System.out.println(numbers.charAt(position - 1));
	}
}
