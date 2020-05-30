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
		System.out.println("back!!!!!");

	}

	private static boolean validate(int age, int weight) throws WeightException {
		if (age == 20 && weight < 20)// ngoai le phu thuoc vao su dieu khien cua minh
		{
			throw new WeightException("Age and weight is not suitable!!!!!!!!");
		}
		return true;
	}
}// throws : bat ky dong code nao co loi deu dua loi ra
// throw: theo dk do mà co loi thi dua loi ra
