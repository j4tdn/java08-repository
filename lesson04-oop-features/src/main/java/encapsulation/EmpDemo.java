package encapsulation;

public class EmpDemo {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setYear(2000);
		
		System.out.println("Age: "+emp.getAge());
	}

}
