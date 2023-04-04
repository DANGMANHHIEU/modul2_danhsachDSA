package ex1;

import java.util.Arrays;

public class myList<E> {
    private  int size =0;
    private static final int DEFAULT_CAPACITY =10;
    private Object elements[];
    public myList(){
        elements=new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapa(){
        int newSize = elements.length*2;
        elements= Arrays.copyOf(elements,newSize);
    }
    public void add(E e){
        if(size == elements.length){
            ensureCapa();
        }
        elements[size++]=e;
    }
   public E get(int i){
        if(i>=size || i<0){
            throw new IndexOutOfBoundsException("index"+i+"size"+i);
        }
        return (E) elements[i];
   }
}
