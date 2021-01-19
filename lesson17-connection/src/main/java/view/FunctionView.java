package view;

import dao.FunctionDaoImpl;

public class FunctionView {
public static void main(String[] args) {
	System.out.println(new FunctionDaoImpl().getSum(20));
}
}
