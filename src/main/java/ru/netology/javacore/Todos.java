package ru.netology.javacore;

import java.util.ArrayList;
import java.util.Collections;

public class Todos {
    private int size = 7;
    private ArrayList<String> listTasks = new ArrayList<>();

    public void addTask(String task) {
        if (listTasks.size() < size) {
            listTasks.add(task);
        }
    }

    public void removeTask(String task) {
        listTasks.remove(task);
    }

    public String getAllTasks() {
        ArrayList<String> sortedList = sort(listTasks);
        String out = "";
        for (String item : sortedList) {
            out += item + " ";
        }
        return out;
    }

    public ArrayList sort(ArrayList listIn) {
        ArrayList<String> listOut = new ArrayList<>(listIn);
        Collections.sort(listOut);
        return listOut;
    }

    public ArrayList<String> getListTasks() {
        return listTasks;
    }

    protected void setListTasks(ArrayList oldListTasks) {
        listTasks = oldListTasks;
    }
}
