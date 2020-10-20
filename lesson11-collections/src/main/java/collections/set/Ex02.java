package collections.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import bean.Iteam;

public class Ex02 {
	public static void main(String[] args) {
		Iteam IteamA=new Iteam(11,"A");
		Iteam IteamB=new Iteam(8,"B");
		Iteam IteamC=new Iteam(17,"C");
		Iteam IteamD=new Iteam(7,"D");
		
		Comparator<Iteam> com=Comparator.nullsLast(Comparator.comparing(Iteam::getId));
		Set<Iteam> iteams=new TreeSet<Iteam>(com);
		iteams.add(IteamA);
		iteams.add(IteamB);
		iteams.add(null);
		iteams.add(IteamD);
		
		System.out.println("size: "+iteams.size());
		iteams.forEach(item->System.out.println(item));
	}
}
