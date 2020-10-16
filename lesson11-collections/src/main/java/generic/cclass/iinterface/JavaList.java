package generic.cclass.iinterface;

import java.lang.reflect.Array;
import java.util.Arrays;

import generic.method.Condition;

public class JavaList<E>  {
	
	private E[] elements;
	
	@SuppressWarnings("unchecked")
	public JavaList(Class<E> classType){
		this.elements = (E[]) Array.newInstance(classType, 0);
	}
	
	private E get(int index) {
		if (index <0 || index >= elements.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return elements[index];
		
	}
	private void set(int index, E element) {
		if (index < 0  || index >= elements.length){
			throw new ArrayIndexOutOfBoundsException();
		}
		this.elements[index] = element;
	
	}
	public boolean add(E element) {
		int size = elements.length;
		E[]	newElements = Arrays.copyOf(elements, size + 1);
		//E[] newElements = (E[])Array.newInstance(classType, size +1);
		newElements[size] = element;
		this.elements = newElements;
		
		return true;
	}
	
	public boolean add(int index, E element) {
		int size = elements.length;
		E[]	newElements = Arrays.copyOf(elements, size + 1);
		
		//shift right
		for (int i = newElements.length -1 ; i >= index ; i--) {
			newElements[i] = newElements[i-1];
		}
		newElements[index] = element;
		
		this.elements = newElements;
		
		return true;
	}
	public int getSize() {
		return elements.length;
	}
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		
		for (E element: elements) {
			
			result = result.append(element).append(" ");
		}
		return result.toString();
	}
	public int count(Condition<E> condition	) {
		if (elements == null || elements.length == 0 ) {
			return 0;
		}
		int result = 0;
		for (E element : elements) {
			if(condition.test(element)) {
				result += 1;
			}
		}
		
		return result;
	}
}
