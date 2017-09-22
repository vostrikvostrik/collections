package tasks.structures.stack;

import java.lang.reflect.Array;
import java.util.EmptyStackException;

/**
 * User: User
 * Date: 19.09.17
 * Time: 13:56
 */
public class StackTuple<T> {
    private T[] elements;
    private int size = 0;

    public StackTuple(Class<T> clazz, int initialCapacity){
        this.elements = (T[]) Array.newInstance(clazz, initialCapacity);
    }

    public void push(T e){
        ensureCapacity();
        elements[size++] = e;
        System.out.println("push " +elements[size-1]);
    }

    public T pop(){
        if (size == 0)
            throw new EmptyStackException();
        T result = elements[--size];
        elements[size] = null; //Eliminate obsole reference
        System.out.println("pop "+result);
        return result;
    }

    //Ensure space for at least one more element
    private void ensureCapacity(){
        if (elements.length == size){
            T oldElements[] = elements;
            elements = (T[]) Array.newInstance(elements.getClass().getComponentType(),2 * elements.length + 1);
            System.arraycopy(oldElements, 0 , elements , 0 , size);
        }
    }

    public int size(){
        return size;
    }
}
