package Random;

import java.util.Random;

public class Ex03RandomPassword {
	//static de goi trong main()
	private static Random rd = new Random();
	
	public static void main(String[] args) {
		String username = "admin";
		String password = "259";
		
		int i = 0;
		String passwordInputs[] = new String[1000];
		
		String passwordInput = ""; //kieu doi tuong
		while(!passwordInput.equals(password)){
			//passwordInput = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10); 
			passwordInput = randomNumber(3);
			
			if(contains(passwordInputs, passwordInput)) {
				continue; //ko chay code duoi
			}
			
			passwordInputs[i] = passwordInput;
			sleep(200);
			System.out.print(passwordInput + "  "); //passwordInputs[i]
			i++;
			if(i % 14 == 0) { //sau 14 lan in ra passwordInput thi xuong dong
				System.out.println();
			}
		}
		System.out.println("Login successful");
		
	}
	
	private static String randomNumber(int count) {
		String result = "";
		for(int i = 0; i < 3; i++) {
			result += rd.nextInt(10);
		}
		return result;
	}
	private static void sleep(long milisecons) {
		try {
			Thread.sleep(milisecons);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static boolean contains(String elements[], String input) {
		
		for(String element: elements) {
			if(element != null && element.equals(input)) {
				return true;
			}
			
		}
		return false;
	}
	
}
