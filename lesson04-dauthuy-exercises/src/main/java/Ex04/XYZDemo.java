package Ex04;

public class XYZDemo {
	public static void main(String[] args) {
		
		Director director = new Director();
		Manager manager = new Manager();
		Employee[] employees = new Employee[2];
		
		Ex04Utils.inputDirectory(director);
		Ex04Utils.inputManager(manager);
		Ex04Utils.inputEmployee(employees);
		
		System.out.println("Director: " + director);
		System.out.println("\nManager: " + manager);
		Ex04Utils.export(employees);
	}
}
