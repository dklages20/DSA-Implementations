package io.github.dklages20.dsa.data.structures;

public interface Map<J, K> {

    void put(J key, K value);

    K get(J key);

    void remove(J key);

    boolean containsKey(J key);

    int size();

    boolean isEmpty();
}
