package io.github.dklages20.dsa.data.structures;

public interface List<T> {

    void add(T element);

    void add(int index, T element);

    T get(int index);

    void remove(int index);

    int size();

    boolean isEmpty();
}
