package encapsulation;

public class EmpDemo {
	public static void main(String[] args) {
		Employee emp = new Employee();
		//emp.setName("James");
		//System.out.println("Name:\t"+ emp.getName());
		emp.setYear(2001);
		System.out.println("Name:\t"+ emp.getAge());
	}
}
