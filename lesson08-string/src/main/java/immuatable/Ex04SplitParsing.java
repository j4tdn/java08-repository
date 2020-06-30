package immuatable;

import java.util.function.Consumer;

import StringUtils.StringUtils;

public class Ex04SplitParsing {
	public static void main(String[] args) {
		String languages = "PHP + C  ;;;;  JAVA  ;  React :   Angular";
		
		
		
		String[] languageArray = languages.trim().split("[\\s;:]+");
		
		
		
		
		//anonymous class  => anonymous function  ( lambda expression);
		// Lambda use replace for and instance of functional interface ( interface have only 1 abstract function) 
		
		//lambda has 3 parts 
		// 1. ( parameters) = parameters in Fucntional Interface abstract method ;
		// 2 -> 
		//3. body = body of Function interface 
		
		
		
		
		
		
	
		// hoac co the bo vao truc tiep 
		StringUtils.forEach(languageArray, el -> System.out.println(el));
		
		
		String replaceResult = languages.trim().replaceAll("[\\s;:]+", " ");
		
		System.out.println(languages);
		
	}
	
	
	
		// FINAL LA BAT BIEN O STACK 
		// IMUTABLE LA BAT BIEN O HEAP 
}
