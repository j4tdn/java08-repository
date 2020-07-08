package ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		String name = "aDam Le vAN john Son";
		Scanner sc = new Scanner(System.in);
		//Validate name only space and letter
		while (!name.matches("^[a-zA-Z\\s]*$")) {
			System.out.print("Name should string, enter again! ");
			name = sc.nextLine();
		} 
		//to UpperCase
		name = name.trim().replaceAll("[\\s]+", " ").toLowerCase();
		String result = "";
		for (int i = 0; i < name.length(); i++) {
			if (i == 0 || name.charAt(i - 1) == ' ') {
				result = result + name.toUpperCase().charAt(i);
			} else {
				result = result + name.charAt(i);
			}
		}
		System.out.println(result);
	}

}
