package view;

import dao.FunctionDaoImpl;

public class FunctionView {
	public static void main(String[] args) {
		int result = new FunctionDaoImpl().getSum(10);
		System.out.println("sum: " + result);
	}
}
