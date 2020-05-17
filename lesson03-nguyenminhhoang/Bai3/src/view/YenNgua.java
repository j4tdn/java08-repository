package view;

import java.util.Scanner;

import controller.Controller;

public class YenNgua {

	public static void main(String[] args) {
		Controller controller = new Controller();

		int[][] a = controller.taoMang();
		controller.yenNgua(a);
	}
}
