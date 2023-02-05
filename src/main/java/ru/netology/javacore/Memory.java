package ru.netology.javacore;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Memory {
    int memorySize = 7;
    Deque<ArrayList> arrayListArrayDeque = new ArrayDeque<>();

    public void addMemory(ArrayList arrayListIn) {
        if (arrayListIn != null) {
            if (arrayListArrayDeque.size() > memorySize) {
                arrayListArrayDeque.removeFirst();
            }
            ArrayList<String> arrayList = new ArrayList<>(arrayListIn);
            arrayListArrayDeque.addLast(arrayList);
        }
    }

    public ArrayList pollMemory() {
        return arrayListArrayDeque.pollLast();

    }

}
