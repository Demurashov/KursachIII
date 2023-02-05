package ru.netology.javacore;

import java.io.Serializable;

public class Operation implements Serializable {
    private String type;
    private String task;

    public Operation(String type) {
        this.type = type;

    }

    public void setTask(String title) {
        this.task = title;
    }

    public String getTask() {
        return task;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Операция: " + type + " Задача: " + task;
    }
}
