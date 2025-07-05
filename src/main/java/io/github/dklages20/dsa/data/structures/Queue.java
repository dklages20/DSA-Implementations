package io.github.dklages20.dsa.data.structures;

public interface Queue<T> {

    void enqueue(T element);

    T dequeue();

    T peek();

    boolean isEmpty();

    int size();
}
