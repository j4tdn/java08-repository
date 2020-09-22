package declaration;

import bean.Iteam;

public class Ex01 {
	public static void main(String[] args) {
		int[] a = new int[5];
		String[] b = new String[5];
		String[] c= {"a","b","c"};
		
		//array is an object
		
		System.out.println("c class: "+c.getClass());
		System.out.println("a class: "+a.getClass());
		
		Iteam[] iteam=new Iteam[3];
		iteam[0].setId(10);
		iteam[0].setName("Fan");
		
	}
}
