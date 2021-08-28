package _10_array_list_linked_list.bai_tap.trien_khai_phuong_thuc_array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        ensureCapacity();
        for (int i = size - 1; i >= index; i++) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    private void ensureCapacity() {
        if (size >= elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

  
}