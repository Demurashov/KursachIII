package ru.netology.javacore;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;
import java.util.TreeSet;

public class Memory {
    private final int MEMORYSIZE = 7;
    Deque<Set> setArrayDeque = new ArrayDeque<>();

    public void addMemory(Set setIn) {
        if (setIn != null) {
            if (setArrayDeque.size() > MEMORYSIZE) {
                setArrayDeque.removeFirst();
            }
            Set<String> treeSet = new TreeSet<>(setIn);
            setArrayDeque.addLast(treeSet);
        }
    }

    public Set pollMemory() {
        return setArrayDeque.pollLast();

    }

}
