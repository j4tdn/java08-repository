package j4t.datatype;

import common.Operator;

public class Ex06EnumDeclaration {

	public static void main(String[] args) {
		Operator[] operator = Operator.values();
		for (int i = 0; i < operator.length; i++) {
			System.out.println( i + " : " + operator[i].ordinal() );
			System.out.println("result : " + operate(10, 5, operator[i])); // hard code
		}
	}

	private static int operate(int a, int b, Operator operator) {
		switch (operator) {
		case SUM:
			return (a + b);
		case SUB:
			return (a - b);
		case MUL:
			return (a * b);
		case DIV:
			return (a / b);
		case MOD:
			return (a % b);
		}
		return 0;
	}
}
