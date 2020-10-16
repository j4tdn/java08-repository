package generic.cclass.iinterface;

import java.lang.reflect.Array;
import java.util.Arrays;

import generic.method.Condition;

public class JavaList<E> {
	private int capacity;

	private E[] elements;

	public JavaList() {
		this.elements = (E[]) Array.newInstance(Object.class, 0);
	}

	public E get(int index) {
		if (index < 0 || index >= elements.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return elements[index];
	}

	public void set(int index, E element) {
		if (index < 0 || index >= elements.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		this.elements[index] = element;
	}

	public boolean add(E element) {
		int size = elements.length;
		E[] newElement = Arrays.copyOf(elements, size + 1);

		newElement[size] = element;
		this.elements = newElement;

		return true;
	}

	public boolean add(int index, E element) {
		int size = elements.length;

		E[] newElement = Arrays.copyOf(elements, size + 1);
//
//		// shift right
//		for (int i = index; i < newElement.length - 1; i++) {
//			newElement[i] = newElement[i - 1];
//		}

		for (int i = 0; i < newElement.length; i++) {
			if (i < index) {
				newElement[i] = this.elements[i];
			} else if (i == index) {
				newElement[i] = element;
			} else {
				newElement[i] = this.elements[i - 1];
			}
		}

//		newElement[index] = element;
		this.elements = newElement;

		return true;
	}

	public int getSize() {
		return this.elements.length;
	}

	@Override
	public String toString() {

		StringBuilder result = new StringBuilder();
		for (E element : this.elements) {
			result = result.append(element).append(" ");
		}
		return result.toString();
	}

	public int count(Condition<E> condition) {
		if (elements == null || elements.length == 0 || condition == null) {
			return 0;
		}
		int result = 0;
		for (E element : elements) {
			if (condition.test(element)) {
				result++;
			}
		}

		return result;
	}
}
