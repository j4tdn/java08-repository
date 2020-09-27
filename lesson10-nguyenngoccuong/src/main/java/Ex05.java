import bean.Student;
import sorting.Sort;

public class Ex05 {

	public static void main(String[] args) {
		int[] numbers = {65,19,21,95,2,62,0,51,62,51};
		Student[] students = getStudents();
		
//		printf(Sort.selectionSort(numbers));
//		printf(Sort.bubbleSort(numbers));
//		printf(Sort.insertionSort(numbers));
//		printf(Sort.shellSort(numbers));
//		Sort.mergeSort(numbers, 0, numbers.length - 1);
//		Sort.quickSort(numbers, 0, numbers.length - 1);
		printf(numbers);
		Sort.objectSort(students);
		printf(students);
	}
	
	private static Student[] getStudents() {
        return new Student[]{
                new Student(1, "F", 15),
                new Student(1, "A", 18),
                new Student(1, "C", 20),
                new Student(1, "S", 10),
                new Student(1, "Y", 25),
                new Student(1, "U", 21),
                new Student(1, "S", 22),
                new Student(1, "M", 10),
                new Student(1, "J", 13),
                new Student(1, "Q", 15),
        };
    }

	private static void printf(int[] arr) {
		for (int number : arr) {
			System.out.print(number + " ");
		}
		System.out.println();
	}
	
	private static void printf(Student[] arr) {
		for (Student student : arr) {
			System.out.println(student);
		}
	}
}
