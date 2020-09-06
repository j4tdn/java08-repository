package app;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex02 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String name = sc.nextLine();
		
		while ( name.matches("^[a-z A-Z]{1,50}$")== false) {
			System.out.println("Please input again ! [A-Za-z]");
			name = sc.nextLine();
		}
		
		name = name.trim().replaceAll("[ ]+", " ").toLowerCase();
		//System.out.println(name);
		
		StringBuilder b = new StringBuilder( name); 
		int i = 0; 
		do { 
		    b.replace(i, i + 1, b.substring(i,i + 1).toUpperCase()); 
		    i = b.indexOf(" ", i) + 1; 
		} while (i > 0 && i < b.length()); 

		System.out.println(b.toString()); 
	}
	
}
