package j4t.datatype;

import common.Operator;

public class Ex06EnumDeclaration {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		
		for(Operator operator:Operator.values()) {
			System.out.println(operator.ordinal());
			System.out.println("result: " + operate(a, b, operator));
		}
	}
	
	private static int operate(int a, int b, Operator operator) {
		switch(operator) {
		case DIV:
			return a / b;
		case MOD:
			return a % b;
		case MUL:
			return a * b;
		case SUB:
			return a - b;
		case SUM:
			return a + b;
		
		}
		return 0;
	}
}
