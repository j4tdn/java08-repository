package execution;
public class Ex06 {

	public static void main(String[] args) {
		int age = 20;
		int weight = 15;
		try {
			System.out.println(validate(age, weight));
		} catch (WeightException e) {
			System.out.println(e.getMessage());
		}	
		System.out.println("back to normal");

	}
	private static boolean validate(int age, int weight) {
		if(age == 20 && weight < 20) {
			//throw depends on condition
			throw new WeightException("weight is not suitable with age");
		}
		return true;
	}

}
