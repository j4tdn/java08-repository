package exercises;

public class Ex02 {
	public static void main(String[] args) {
		String str = "aa6b546c6e22h";
		str = str.replaceAll("[a-z]", ",");
		//System.out.println(str);
		String[] item = str.split(",");
		int max =0;
		int b[] =new int[str.length()];
		for (int i = 0; i < item.length; i++) {
            try {
            	b[i] = Integer.parseInt(item[i]);
            	if (max < Integer.parseInt(item[i])) {
            		max = Integer.parseInt(item[i]);
            	}
            	Integer.parseInt(item[i]);
                
               // System.out.println(max);
            } catch (NumberFormatException e) {
            }
        }
		
		System.out.println("Số lớn nhất:" +max);
		sortDESC(b);
		show(b);
	}
	public static void sortDESC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
	public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
