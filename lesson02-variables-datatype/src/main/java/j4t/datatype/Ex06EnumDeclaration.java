package j4t.datatype;

import j4t.common.Operator;

public class Ex06EnumDeclaration {
	
	/*
	 * private static final char SUM ='+'; private static final char SUB ='-';
	 * private static final char MUL ='*'; private static final char DIV ='/';
	 * private static final char MOD ='%';
	 */
	
	
	
	public static void main(String[] args) {
		//System.out.println("result:\t"+operator(10, 5, '_')); //hard code
		Operator [] operators = Operator.values();
		for (int i = 0; i < operators.length; i++) {
			System.out.println(i+"\t:\t"+operators[i].ordinal());
			System.out.println("result:\t"+operator(10, 5, operators[i]));
		}
				
	}

	private static int operator(int a, int b, Operator operator) {
		switch (operator) {
		case SUM:
			return a + b;
		case SUB:
			return a - b;
		case MUL:
			return a * b;
		case DIV:
			return a / b;
		case MOD:
			return a % b;
		}
			return 0;
		
	}
}
