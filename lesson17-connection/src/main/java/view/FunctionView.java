package view;

import dao.FunctionDaoImpl;

public class FunctionView {
	public static void main(String[] args) {
		int sum = new FunctionDaoImpl().getSum(10);
		System.out.println("sum: " + sum);
	}
}