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
		System.out.println("Back to nomal!!");
	}

	private static boolean validate(int age, int weight) throws Exception	{
		if (age == 20 && weight < 20) {
			throw new WeightException("weight is not suitable with age");
		}
		return true;
	}
}
