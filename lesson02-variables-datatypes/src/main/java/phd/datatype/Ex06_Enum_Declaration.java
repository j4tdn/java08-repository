package phd.datatype;

import common.Operator;

public class Ex06_Enum_Declaration {

	public static void main(String[] args) {
		//System.out.println(operate(10,5,'_'));//hard code 
		Operator[] operators = Operator.values();
		for(int i =0;i<operators.length;i++)
		{
			System.out.println(i+":"+operators[i].ordinal());
			System.out.println("result :" +operate(10,5,operators[i]));
		}
		
		
	}
	private static int operate(int a, int b, Operator operator)
	{
		switch(operator) {
		case DIV:
			return a/b;
		case MOD:
			return a%b;
		case MUL:
			return a*b;
		case SUB:
			return a-b;
		case SUM:
			return a+b;
		default:
			break;
		
	}
		return 0;
}
}
