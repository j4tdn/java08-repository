package utils;

public class YenNguaUtils {
	

	public static void Show(int arr[][]) {
		System.out.println("Hien thi ma tran");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public static void ktYenNgua(int arr[][])
	{
		int minrow[] = new int[arr.length];
        int maxcolum[] = new int[arr[0].length];
        int dem=0,diemyenngua=0;
        for (int i=0; i<arr.length; i++) {
            minrow[i] = arr[i][0];
            for(int j=0; j<arr[0].length; j++) {
                if (minrow[i] > arr[i][j]) {
                    minrow[i] = arr[i][j];
                }
            }
        }

        for (int j=0; j<arr[0].length; j++) {
            maxcolum[j] = arr[0][j];
            for(int i=0; i<arr.length; i++) {
                if (maxcolum[j] < arr[i][j]) {
                    maxcolum[j] = arr[i][j];
                }
            }
        }

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[0].length; j++) {
                if((arr[i][j] == minrow[i]) && (arr[i][j] == maxcolum[j])) {
                    dem=1;
                    diemyenngua=arr[i][j];
                }                              
            }           
        }
        if(dem==1) {
        	System.out.println("Điểm yên ngựa la: "+diemyenngua);
        }
        else
        	System.out.println("Không có điểm yên ngưa");
        
	}
}
