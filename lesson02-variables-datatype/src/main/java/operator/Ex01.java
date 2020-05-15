package operator;

public class Ex01 {
	public static void main(String[] args) {
		int n=7;
		System.out.println(n++);
		System.out.println(n++);
		System.out.println(n);
		System.out.println(++n);
		
		boolean isType = n%2==0; 
		if (isType) { //kieu boolean ==true thi ko can de, !isType => isType==false
			System.out.println("số chẵn");
		}
	}
}
