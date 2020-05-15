package encapsulation;

public class EmpDemo {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setYear(1998);
		System.out.println("Age" + employee.getAge());
	}
}
