package immuatable;

public class StringUtils {
	private StringUtils() {
		
	}
	
	public static StringClass countString(String s1) {
		
		char[] arr = s1.toCharArray();
		
		int demHoa = 0; 
		int demThuong = 0;
		int demSo = 0;
		
		for(char el : arr) {
			
			if(Character.isDigit(el)) {
				demSo ++ ;
			}
			else if(Character.isUpperCase(el)) {
				demHoa ++ ;
			}
			else if(Character.isLowerCase(el)) {
				demThuong++;
			}
			
			
			
			
		}
		
		
		
		
		
		return new StringClass(demHoa,demThuong,demSo) ;
	}
}
