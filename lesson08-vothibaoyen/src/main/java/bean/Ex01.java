package bean;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Moi nhap chuoi ky tu ");
        String s = scanner.nextLine();
       
     
        //in ky tu tren 1 dong
        for(int i=0;i<s.length();i++) {
        	System.out.println(s.charAt(i));
        }
        
        System.out.println("=================");
        
        // in ra moi tu tren 1 dong
        String[] s1=s.split("[\\s]+");
        for(String item:s1) {
        	System.out.println(item);
        }
        
        System.out.println("=================");
        
        // dao nguoc theo ky tu
        for(int i=s.length()-1;i>=0;i--) {
        	System.out.println(s.charAt(i));
        }
        
        System.out.println("=================");
        
        // dao nguoc theo tu
        for(int i=s1.length-1;i>=0;i--) {
        	System.out.println(s1[i]);
        }
        
        
	}
}

