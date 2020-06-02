package lesson05.exam;

public class Test03 {
	public static void main(String[] args) {
		int a=8;
		int b=2;
		System.out.println(isPowerOf(a, b));
	}

	public static boolean isPowerOf(int a, int b) {
		boolean check = true;
		while (check) {
			if (a != 0 && b!=1) {
				if (a % b == 0 && a>b) {
					a = a / b;
					check = true;
				} else {
					if(a==b) {
						check=true;
						break;
					}else {
						check=false;
					}
				}
			}

		}
		return check;
	}

}
