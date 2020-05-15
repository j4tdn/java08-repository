package common;

public enum CirlePosition {
	INSIDE ("Trong đường tròn"),
	ONSIDE ("Trên đường tròn"),
	OUTSIDE ("Ngoài đường tròn");
	
	public String value;
	
	CirlePosition(String value){
		//System.out.println("value: "+ value);
		this.value = value;
	}
}
