package io.github.dklages20.dsa.data.structures;

public interface Set<T> {

    void add(T element);

    void remove(T element);

    boolean contains(T element);

    int size();

    boolean isEmpty();

}
