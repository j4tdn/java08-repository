package execution;

public class WeightException extends Exception{

	/**
	 * serlivalize
	 * khi new motj doi duong moi tjii no se tao,moi mot doi tuong, nen lam sao tro de duoc dung ham luu trong heap 
	 * serialVersionUID: key trung gian chu ko phai dia chi cua heap
	 * 
	 * cherry pick, workspace include bai tap
	 */
	private static final long serialVersionUID = 1L;
	public WeightException() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public WeightException(String mes) {
		// TODO Auto-generated constructor stub
		super(mes);
		
	}
	
}
