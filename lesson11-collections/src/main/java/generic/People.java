package generic;

import Bean.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class People<T> {
	private List<People> arList;
	public People(){
		this.arList = new ArrayList<>();
	}
	public void saveThis(){
		arList.add(this);
	}
	public static void main(String[] args) {
		System.out.println("hello world");

	}
	public void printArr() {
		this.arList.forEach(t -> System.out.println(t.toString()));
	}
	public void add(People t) {
		this.arList.add(t);
	}
}
