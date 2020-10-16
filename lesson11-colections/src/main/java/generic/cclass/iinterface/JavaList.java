package generic.cclass.iinterface;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;

import colections.list.Condition;

public class JavaList <E> implements Serializable {
	private int capacity;
	private E[] elements;
	public JavaList(Class<E> classType) {
		this.elements = (E[]) Array.newInstance(classType,0);
	}
	
	private E get(int index) {
		if(index<0|| index>=elements.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return elements[index];
	}
	
	private void set(int index, E element) {
		if(index<0|| index>=elements.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		this.elements[index] = element;
	}
	
	public boolean add(E element) {
		int size =  elements.length;
		E[] newElements = Arrays.copyOf(elements,size + 1);
		newElements[size] = element;
		this.elements = newElements;
		return true;
	}
	
	public boolean add(E element, int index) {
		int size =  elements.length;
		
		E[] newElements = Arrays.copyOf(elements,size + 1);
		for(int i = newElements.length-1; i>=index; i--) {
			newElements[i] = newElements[i-1];
		}
		newElements[index] = element;
		
		this.elements = newElements;
		return true;
			
	}
	
	public int getSize() {
		return elements.length;
	}
	
	public  int count(Condition<E> condition) {
		if(elements == null|| elements.length == 0) {
			return 0;
		}
		int value=0;
		for(E element : elements) {
			if(condition.test(element)) {
				value+=1;
			}
		}
		return value;
	}
	
	

}
