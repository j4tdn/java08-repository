package Bai03;

public class Bai03 {
public static void main(String[] args) {
	int x=4;
	int y=16;
	int z=5;
    isPowerOf(x,y);
    isPowerOf(x,z);

}
public static boolean isPowerOf(int a ,int b) {
	if(a*a==b||b*b==a) {
		System.out.println("true");
		return true;
	}
	System.out.println("false");
	return false;

}
}
