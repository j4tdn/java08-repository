package execution;

public class Ex06 {
	public static void main(String[] args) {
		int age = 20;
		int weight = 15;
		try {
			System.out.println(validate(age, weight));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Back to normal!!");
	}

	private static boolean validate(int age, int weight) throws WeightException {
		if (age == 20 && weight < 20) {
			throw new WeightException("Weight is not suitable with Age");
		}
		return true;
	}
}
