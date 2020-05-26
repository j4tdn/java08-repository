package view;

public class Ex04 {

	public static void main(String[] args) {
		int A[] = { 1, 2, 3, 4, 5, 7 };
		System.out.println(getLeastCommonMultiple(A));
	}
	
	public static int LeastCommonMultiple(int a, int b) {
		return (a*b/greatestcommondivisor(a,b));
	}

	private static int greatestcommondivisor(int a, int b) {
		if (a == b)
			return a;
		    if(a>b) 
		       return greatestcommondivisor(a-b,b);
		    else
		       return greatestcommondivisor(a,b-a);
	}

	public static int getLeastCommonMultiple(int[] A) {
		int temp = LeastCommonMultiple(A[0],A[1]);
		for(int i=0; i< A.length; i++) {
			temp = LeastCommonMultiple(temp,A[i]);
		}
		return temp;
	}

}
