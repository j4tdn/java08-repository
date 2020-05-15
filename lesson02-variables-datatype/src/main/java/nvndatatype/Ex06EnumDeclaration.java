package nvndatatype;

import common.Operator;

public class Ex06EnumDeclaration {
	public static void main(String[] args) {
		
		Operator[] operator = Operator.values();
		for (int i=0; i< operator.length; i++) {
			System.out.println(i + " :"+ operator[i].ordinal());
			System.out.println("Result: " + calculate(10, 5, operator[i]));
		}
	}
	private static int calculate(int a, int b , Operator op) {
		
		switch (op) {
		case SUM:
			return a + b;
		case SUB:
			return a - b;
		case MUL:
			return a * b;
		case DIV:
			return a / b;
		case MOD:
			break;
	
		}
		return 0;
	}

}
