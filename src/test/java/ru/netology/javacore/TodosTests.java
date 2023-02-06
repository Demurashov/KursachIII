package ru.netology.javacore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TodosTests {

    Todos todosTest = new Todos();
    String[] arrTest = {"Б", "А", "Г", "В", "Д", "Е", "Ж", "И", "З"};
    Set<String> expectedAdd = new TreeSet<>(Arrays.asList("А", "Б", "В", "Г", "Д", "Е", "Ж"));
    String expectedStr = "А Б В Г Д Е Ж ";

    @Test
    public void addTaskTest() {
        for (String task : arrTest) {
            todosTest.addTask(task);
        }
        Assertions.assertEquals(expectedAdd, todosTest.getSetTasks());
    }

    @Test
    public void getAllTasksTest() {
        Todos todos = new Todos();
        for (String in : arrTest) {
            todos.addTask(in);
        }
        String result = todos.getAllTasks();
        Assertions.assertEquals(expectedStr, result);
    }
}

