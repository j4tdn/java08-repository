package Random;

import java.util.Random;

public class Ex02Array {

	public static void main(String[] args) {

		
		
		  String[] students = {"Lan", " Hoa", "Đào", " Cúc "}; Random rd = new
		  Random();
		  
		  String first = students[rd.nextInt(4)]; String second =
		  students[rd.nextInt(4)]; while(second.equals(first)) { second =
		  students[rd.nextInt(4)]; }
		  
		  System.out.println(first ); System.out.println(second);
		 
 		System.out.println("==================");
 		for(int i =1 ; i<students.length;i++) {
 			
 			if(i==4)
 			{
 				continue;
 			}
 			System.out.println("i : "+ students[i]);
 			
 		}
 		//for each 
 		for(String student:students)
 		{
 			System.out.println(student);
 		}
 

}
}