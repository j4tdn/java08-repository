package generic.cclass.iinterface;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;

import generic.method.Condition;

public class JavaList<E> implements Serializable {
	private int capacity; // suc chua

	private E[] elements; // ko the new ra, phu thuoc cai truyen vao, can khoi tao cai moi

	private Class<E> classType;

	@SuppressWarnings("unchecked")
	public JavaList(Class<E> classType) {
		// this.elements = new E[0];
		this.classType = classType;
		this.elements = (E[]) Array.newInstance(classType, 0);
	}

	private E get(int index) {
		if (index < 0 || index >= elements.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return elements[index];
	}

	private void get(int index, E element) {
		if (index < 0 || index >= elements.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		this.elements[index] = element;
	}

	public boolean add(E element) {
		int size = elements.length;
		// E[] newElements = (E[]) Array.newInstance(classType, size + 1);
		E[] newElements = Arrays.copyOf(elements, size + 1);
		newElements[size] = element;
		this.elements = newElements;

		return true;
	}

	public int getSize() {
		return elements.length;
	}

	// 7 9 1 -> 7 2 9 1
	public boolean add(int index, E element) {
		int size = elements.length;
		// E[] newElements = (E[]) Array.newInstance(classType, size + 1);
		E[] newElements = Arrays.copyOf(elements, size + 1);

		// shift right
		for (int i = elements.length - 1; i >= index; i--) {
			newElements[i] = newElements[i - 1];
		}
		newElements[index] = element;

		this.elements = newElements;

		return true;
	}

	@Override
	public String toString() {
		//Closure in JAVA
		StringBuilder result = new StringBuilder();
		for (E element: elements) {
			result = result.append(element).append(" ");
		}
		
		return result.toString();
	}

	public int count(Condition<E> condition) {
		if (elements == null || elements.length == 0 ) {
			return 0;
		}
		
		int result = 0;
		for (E elelement: elements) {
			if (condition.test(elelement)) {
			//if (elelement.compareTo(o)) {
				result += 1;
			}
		}
		
		return result;
	}
	
}
