package Ex02;

import java.util.Scanner;

public class Ex02 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		
		String test = "T";
		System.out.println(isValid(test));
		System.out.print("name: ");
		String name = " ";
		do {
			name = ip.nextLine();
			
			if (!isValid (name)) {
				System.out.println("Input again!");
				continue;
			}
			break;
		} while (true);

		String wordInNames[] = name.split("[\\s]+");
		for (String word: wordInNames) {
			System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ");
		}
	}
	
	public static boolean isValid(String s){
        return s.matches("[a-z A-Z]{1,50}");
    }
}
