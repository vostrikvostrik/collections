package tasks.structures.stack;

import java.util.EmptyStackException;

/**
 * User: User
 * Date: 18.09.17
 * Time: 16:36
 */
public class Stack {
    private Object[] elements;
    private int size = 0;

    public Stack(int initialCapacity){
        this.elements = new Object[initialCapacity];
    }

    public void push(Object e){
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop(){
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null; //Eliminate obsole reference
        return result;
    }

    //Ensure space for at least one more element
    private void ensureCapacity(){
        if (elements.length == size){
            Object oldElements[] = elements;
            elements = new Object[2 * elements.length + 1];
            System.arraycopy(oldElements, 0 , elements , 0 , size);
        }
    }

    public int size(){
        return size;
    }
}
