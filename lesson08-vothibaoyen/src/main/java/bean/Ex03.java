package bean;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;



public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi nhap chuoi ky tu ");
		String s = scanner.nextLine();
		System.out.println(StringUtils.unAccent(s));
		
				
	}
	public static class StringUtils{
		public static String unAccent(String s) {
		        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
		        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		        return pattern.matcher(temp).replaceAll("");
		}
		}

	

}
