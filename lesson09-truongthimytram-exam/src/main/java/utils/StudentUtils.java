package utils;

import java.util.Arrays;

import ex01.Student;

public class StudentUtils {
	private StudentUtils() {
	}
	
	public static Student[] getStudentsRegistingOnce(Student[] students) {
		Student[] st = new Student[students.length];
		int index = 0;
		for (int i = 0; i <= students.length - 1; i++) {
			for (int j = 1; j < students.length; j++) {
				if(students[i].getId() == students[j].getId()) {
					continue;
				}
				else {
					st[index] = students[i];
					index++;
				}
							
			}
		
	   }
	   return Arrays.copyOfRange(st, 0, index);	
		
	}
	 
	public static Student[] getStudentsOnceA(Student[] students) {
		Student[] sta;
		int index = 0;
		sta = getStudentsRegistingOnce(students);
		Student[] temp = new Student[sta.length];
		for (int i = 0; i < sta.length; i++) {
			if(sta[i].getRank().equals("A")) {
				temp[index] = sta[i];
				index++;
				
			}
			
		}
		return Arrays.copyOfRange(temp, 0, index);
	}
	
}
