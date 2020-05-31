package execution;

public class Ex06 {
	public static void main(String[] args) {
		int age=21;
		int weight =33;
		try {
		System.out.println(validate(age, weight));
		}catch (WeightException e) {
			System.out.println(e.getMessage());
			System.out.println("back to normal");
		}
		
	}
	
	public static boolean validate(int age, int weight) throws WeightException{
		if(age>20 && weight<35) {
			throw new WeightException("Weight is not sutable with age");
		}else {
			return true;
		}
		
	}
}
