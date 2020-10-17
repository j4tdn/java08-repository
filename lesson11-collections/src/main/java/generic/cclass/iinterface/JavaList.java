package generic.cclass.iinterface;

import java.lang.reflect.Array;
import java.util.Arrays;

import generic.method.Condition;

public class JavaList<E> {
	private int capacity;

	private E[] elements;
	private Class<E> classType;

	// khong the new generic type, bat buoc phai integer hay string....
	// neu new o day thi tu hieu la object
	@SuppressWarnings("unchecked")
	public JavaList() {
		// this.classType = classType;
		this.elements = (E[]) Array.newInstance(Object.class, 0);
	}

	public E get(int index) {
		if (index < 0 || index > elements.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return elements[index];
	}

	public void set(int index, E element) {
		if (index < 0 || index > elements.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		this.elements[index] = element;
	}

	public boolean add(E element) {
		int size = elements.length;
		E[] newElements = Arrays.copyOf(elements, size + 1);
		newElements[size] = element;
		this.elements = newElements;

		return true;
	}

	public int getSize() {
		return elements.length;
	}

	public boolean add(int index, E element) {
		int size = elements.length;
		E[] newElements = Arrays.copyOf(elements, size + 1);

		// shift right, duyet tu phai sang trai
		for (int i = newElements.length - 1; i > index; i--) {
			newElements[i] = newElements[i - 1];
		}

		newElements[index] = element;
		this.elements = newElements;

		return true;
	}

	@Override
	public String toString() {
		// closure in JAVA
		StringBuilder result = new StringBuilder();
		for (E element : elements) {
			result = result.append(element).append(" ");
		}
		return result.toString();
	}

	public int count(Condition<E> condition) {
		int result = 0;
		if (elements == null || elements.length == 0 || condition == null) {
			return 0;
		}
		for (E element : elements) {
			if (condition.test(element)) {
				result += 1;
			}
		}
		return result;
	}

}