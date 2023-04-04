package bai1;

import java.util.ArrayList;
import java.util.Arrays;

public class myList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public myList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public myList(int capacity) {
        element = new Object[capacity];
    }

    // tăng dung lượng lên 2 lần
    public void ensureCaPacity() {
        int newcapacity = element.length * 2;
        element = Arrays.copyOf(element, newcapacity);
    }
    public void add(E e){
        if(size == element.length){
            ensureCaPacity();
        }
        element[size++]=e;
    }

    public void add(int index, E elements) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == element.length) {
            ensureCaPacity();
        }

        for (int i = size; i > index; i--) {
            element[i] = element[i - 1];
        }
        element[index] = elements;
        size++;
    }
    public E get(int i){
        if(i>=size || i<0){
            throw new IndexOutOfBoundsException("index"+i+"size"+i);
        }
        return (E) element[i];
    }
    public E remove(int index){
        checkIndex(index);
        E elements = (E) element[index];
        for(int i = index; i < size - 1; i++){
            element[i] = element[i + 1];
        }
        element[size - 1] = null;
        size--;
        return elements;
    }
    private void checkIndex(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException( "Index: " + index + ", Size: " + size);
        }
    }
// chay thu
        public static void main(String[] args) {
        myList<Integer> arr= new myList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);


        arr.add(2,10);
        for (int i = 0; i < arr.size; i++) {
            System.out.println(arr.get(i));
        }
    }
}
