package generic.cclass.iinterface;

import generic.Conditional;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.locks.Condition;

public class JavaList<E> implements Serializable {
    private int capacity ;
    private E[] elements ;


    private Class<E> classType ;

    public JavaList(){
        this.classType = classType;
        this.elements = (E[]) Array.newInstance(Object.class,0);
    }

    public E get (int index){
       if(index < 0 || index >= elements.length){
           throw new ArrayIndexOutOfBoundsException();

       }
       return this.elements[index];
    }

    public void set(int index, E element){
        if(index< 0 || index >= this.elements.length){
            throw new ArrayIndexOutOfBoundsException();

        }
        this.elements[index] = element;
    }


    public boolean add(E element){
        int size = this.elements.length ;
        E[] newElements = Arrays.copyOf(this.elements, size + 1);

        newElements[size] = element;
        this.elements = newElements;
        return true ;
    }


    //7 9 1

    // 7 9 1 0

    // 7 9 9 1

    //7 2 9 1





    public boolean add(int index , E element){
        int size = this.elements.length ;
        E[] newElements = Arrays.copyOf(this.elements, size + 1);

        for(int i = newElements.length-1; i<=index ; i--){
            newElements[i] = newElements[i-1];
        }
        newElements[index]  = element;

        this.elements = newElements;
        return true ;
    }


    public int getSize(){
        return this.elements.length;
    }

    @Override
    public String toString() {

        // CLOSURE IN JAVA

        StringBuilder result = new StringBuilder();

        for(E element : elements){
            result = result.append(element);
        }

//        Arrays.asList(this.elements).forEach(el -> result = result.append(el));



        return result.toString() ;

    }

    public int count(Conditional<E> condition){
        if(this.elements == null  || this.elements.length == 0  || condition == null ){
            return 0 ;
        }
        int result = 0 ;

        for(E el : this.elements){
            if(condition.test(el)){
                result ++ ;
            }
        }

        return result ;
    }

}
