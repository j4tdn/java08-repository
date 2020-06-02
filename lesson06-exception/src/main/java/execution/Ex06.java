package execution;

public class Ex06 {

	public static void main(String[] args) {
		int age = 20;
		int weight = 15;
		try {
			validate(age, weight);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Back to nomal !!!");
		
	}
	
	private static boolean validate(int age , int weight) throws weightException  {
		if(age == 20 && weight < 20) {
			throw new weightException("Weight is not suitable with Age!");
		}
		return true;
	}

}
