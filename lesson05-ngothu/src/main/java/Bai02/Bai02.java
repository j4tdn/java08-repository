package Bai02;

public class Bai02 {
public static void main(String[] args) {
	int a=0;
	int[] A= {1,2,3,4,5,6,7,8,10};
	for(int i=0;i<A.length;i++) {
		a++;
		if(a!=A[i]) {
			System.out.println(a);
			a++;
		}
	}
}
}
