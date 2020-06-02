package execution;

public class Ex06 {
	public static void main(String[] args) {
		int age = 20;
		int weight = 35;
		
		try {
			System.out.println(validate(age, weight));
		} catch (WeightException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("back to normal");
	}

	private static boolean validate(int age, int weight) {
		if (age == 20 && weight < 40) {
			throw new WeightException("Weigh is not suitbe with code");
		}
		
		return true;
	}
}
