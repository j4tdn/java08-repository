package Bai04;

public class Bai04 {
public static void main(String[] args) {
	int a=10;
	int b=14;
	int bcnn=0;
	for (int i=Math.max(a, b);i<a*b;i++) {
		if(i%a==0&&i%b==0) {
			bcnn=i;
			break;
		}
	}
	System.out.println("BCNN "+ a+ " và "+b +" là"+ bcnn);
}

}
