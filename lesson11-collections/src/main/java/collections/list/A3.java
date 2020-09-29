package collections.list;

import java.util.ArrayList;
import java.util.List;

import bean.Iteam;

public class A3 {
	public static void main(String[] args) {
		
		List<Iteam> iteams=getIteam();
		//remove
		
		iteams.remove(new Iteam(2,"B"));
		iteams.contains(new Iteam(4,"D"));
		
		System.out.println( "size: "+iteams.size());
		System.out.println( "contain: "+iteams.contains(new Iteam(4,"D")));
	}
	private static  List<Iteam> getIteam(){
		List<Iteam> iteams=new ArrayList<Iteam>();
		iteams.add(new Iteam(1,"A"));
		iteams.add(new Iteam(2,"B"));
		iteams.add(new Iteam(3,"C"));
		iteams.add(new Iteam(4,"D"));
		iteams.add(new Iteam(5,"E"));
		iteams.add(new Iteam(6,"F"));
		return iteams;
		
	}
}
