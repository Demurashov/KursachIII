package ru.netology.javacore;

import java.util.Set;
import java.util.TreeSet;

public class Todos {
    private final int SIZE = 7;
    private Set<String> setTasks = new TreeSet<>();

    public void addTask(String task) {
        if (setTasks.size() < SIZE) {
            setTasks.add(task);
        }
    }

    public void removeTask(String task) {
        setTasks.remove(task);
    }

    public String getAllTasks() {
        StringBuilder sb = new StringBuilder();
        for (String item : setTasks) {
            sb.append(item);
            sb.append(" ");
        }
        return sb.toString();
    }

    public Set getSetTasks() {
        return setTasks;
    }

    protected void setSetTasks(Set oldSetTasks) {
        setTasks = oldSetTasks;
    }
}
