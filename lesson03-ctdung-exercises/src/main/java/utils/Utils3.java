package utils;

public class Utils3 {
	
	
	public static void yenNgua(int[][] Array) {
		int soDong = Array.length;
		int soCot = Array[0].length;
		int k;
		for (int i = 0; i< soDong; i++) {
			int min = Array[i][0], col = 0;
			for (int j =1; j < soDong; j++) {
				if (min > Array[i][j]) {
					min = Array[i][j];
					col	=	j;
				}
			}
			for ( k = 0 ; k < soDong ; k++) {
				if (Array[k][col] > Array[i][col]) {
					break;
				}
			
			}
		
			if ( k == soDong) {
				System.out.println("Phần tử yên ngựa: [" + i + "," + col + "] = " + min);
				return;
			}
		}
		System.out.println("Không có phần tử yên ngựa");
	}
	public static void inMang(int[][] Array) {
		int soDong = Array.length;
		int soCot= Array[0].length;
		System.out.println("Mảng vừa nhập có kích thước "+ soDong+"X"+soCot+":");
	    for (int i = 0; i < soDong; i++) {
	        for (int j = 0; j < soCot; j++) {
	            System.out.print(Array[i][j] + "\t");
	        }
	        System.out.println("\n");
	    }
	}

}
