package exercises;

public class Ex02 {

	public static void main(String[] args) {
		String s = "aDam Le vAN john Son";
		s = s.toLowerCase();
		String[] result = s.split(" ");
		for (int i = 0; i < result.length; i++) {
			result[i] = result[i].substring(0, 1).toUpperCase() + result[i].substring(1);
			System.out.print(result[i] + " ");
		}
		
	}

}
