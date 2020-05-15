package mchinhng.datatype;

import common.Operator;

public class Ex06EnumDeclaration {

	public static void main(String[] args) {
		Operator[] operators= Operator.values();
		for (int i =0; i<operators.length; i++) {
			System.out.println(i + ":" + operators[i].ordinal()); //ordinal la vi tri
			System.out.println("Result: " + operate(10, 5, operators[i]));
		}
		
		// System.out.println("Result: " + operate(10,5, Operator.valueOf(arg0))); //
		// lay value cua enum
	}

	private static int operate(int a, int b, Operator operator) {
		switch (operator) {
		case SUM:
			return a + b;
		// break; co return roi khong can break;
		case SUB:
			return a - b;
		case MUL:
			return a * b;
		case DIV:
			return a / b;
		case MOD:
			return a % b;
		default:
			break;
		}
		return 0;
	}

}
