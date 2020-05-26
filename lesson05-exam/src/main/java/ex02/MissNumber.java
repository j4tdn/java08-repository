package ex02;

public class MissNumber {
	public int getMissingNumber(int[] a) {
		int tam;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[j] < a[i]) {
					tam = a[i];
					a[i] = a[j];
					a[i] = tam;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length - 1; j++) {
				if(a[j]-a[i] >= 2) {
					return a[j]-1;
				}
				else {
					break;
				}
			}
		}
		return 0;
	}
}
