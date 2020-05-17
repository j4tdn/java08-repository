package phuoctam.com.lesson03_nguyenphuoctam.exe01;

import java.util.Scanner;

public class View {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("input position circle : ");
		Position tamDuongTron = inputPosition();
		System.out.println("input radius : ");
		double banKinh = Double.parseDouble(ip.nextLine());
		System.out.println("input position A");
		Position diemA = inputPosition();
		
		if(checkInCircel(tamDuongTron, banKinh, diemA)){
			System.out.println("input position out circle : ");
		}else{
			System.out.println("input position in circle : ");
		}
		
	}

	private static Position inputPosition() {
		Position Position = new Position();
		Scanner ip = new Scanner(System.in);
		System.out.print("position x = ");
		int x = Integer.parseInt(ip.nextLine());
		System.out.print("position y = ");
		int y = Integer.parseInt(ip.nextLine());
		return Position = new Position(x, y);
	}

	private static double distance(Position a, Position b) {
		int x = Math.abs(a.getPositionX() - b.getPositionX());
		int y = Math.abs(a.getPositionY() - b.getPositionY());
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	private static boolean checkInCircel(Position tamDuongTron,double banKinh,Position diemA) {
		if(distance(tamDuongTron,diemA)>banKinh){
			return false;
		}
		return true;
	}

}
