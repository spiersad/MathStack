package com.spiersad;

/**
 * Created with IntelliJ IDEA.
 * User: spiers
 * Date: 5/28/13
 * Time: 12:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class ArrayStack<T> {
    private T[] arrayStack;
    private final int DEFAULT_ARRAY_SIZE = 1;
    private int index;
    ArrayStack(){
        arrayStack = (T[]) new Object[DEFAULT_ARRAY_SIZE];
        index = 0;
    }
    ArrayStack(int arraySize){
        arrayStack = (T[]) new Object[arraySize];
        index = 0;
    }

    public void push(T inf){
        if (index == arrayStack.length) doubleArray();
        arrayStack[index] = inf;
        index++;
    }
    public T pop(){
        if (index == 0) throw new IndexOutOfBoundsException("Can't pop. Out of bounds");
        index--;
        return arrayStack[index];
    }
    public T peek(){
        if (index == 0) throw new IndexOutOfBoundsException("Can't peek. Out of bounds");
        int tempIndex = index - 1;
        return arrayStack[tempIndex];
    }
    public int length(){
        return index;
    }
    private void doubleArray(){
        T[] temp = (T[]) new Object[arrayStack.length*2];
        for(int i = 0; i < arrayStack.length; i++){
            temp[i] = arrayStack[i];
        }
        arrayStack = temp;
    }


}
