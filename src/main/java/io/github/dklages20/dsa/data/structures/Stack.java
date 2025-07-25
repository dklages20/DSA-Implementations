package io.github.dklages20.dsa.data.structures;

public interface Stack<T> {

    void push(T element);

    T pop();

    T peek();

    boolean isEmpty();

    int size();
}
