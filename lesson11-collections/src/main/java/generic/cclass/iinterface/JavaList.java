package generic.cclass.iinterface;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;

import generic.method.Condition;

@SuppressWarnings("serial")
public class JavaList<E> implements Serializable {

	private E[] elements;
	@SuppressWarnings("unused")
	private Class<E> classtype;

	@SuppressWarnings("unchecked")
	public JavaList(Class<E> classtype) {
		this.elements = (E[]) Array.newInstance(classtype, 0);
	}

	public E get(int indext) {
		if (indext < 0 || indext >= elements.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return elements[indext];
	}
	public void set(int indext,E element) {
		if (indext < 0 || indext >= elements.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		 this.elements[indext]=element;
	}
	public boolean add(E element) {
		int size=elements.length;
		E[] newElements=(E[]) Arrays.copyOf(elements, size+1);
		newElements[size]=element;
		this.elements=newElements;
		
		return true;
	}
	public boolean add(int indext,E element) {
		int size=elements.length;
		E[] newElements=(E[]) Arrays.copyOf(elements, size+1);
		
		//shift right
		for(int i=newElements.length-1;i>=indext;i--) {
			newElements[i]=newElements[i-1];
		}
		newElements[indext]=element;
		this.elements=newElements;
		
		return true;
	}
	
	
	public int getSize() {
		return elements.length;
	} 
	@Override
	public String toString() {
		StringBuilder result=new StringBuilder();
		for(E element:elements) {
			result=result.append(element).append(" ");			
		}
		return result.toString();
	}
	
	public int count(Condition<E> condition) {
		
		if(elements==null||elements.length==0) {
			return 0;
		}
		int result=0;
		for(E element:elements) {
			if(condition.test(element)) {
				result +=1;
			}
		}
		return result;
	}

}
