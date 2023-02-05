package ru.netology.javacore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodosTests {

    Todos todosTest = new Todos();
    ArrayList<String> expectedAdd= new ArrayList<>(Arrays.asList("Б","А","З","Г","В","Д","Ж"));
    String[] arrTest = {"Б","А","З","Г","В","Д","Ж","Е","И"};
    ArrayList<String> expectedlistSort=new ArrayList<>(Arrays.asList("А","Б","В","Г","Д","Е","Ж","З","И"));
    ArrayList<String> listInSort=new ArrayList<>(Arrays.asList(arrTest));

    String expectedStr="А Б В Г Д Ж З ";


    @Test
    public void addTaskTest() {
        for (String task : arrTest) {
            todosTest.addTask(task);
            //System.out.println("Тест: ");
            //todosTest.getListTasks().forEach(s -> System.out.println(s));
        }
       Assertions.assertEquals(todosTest.getListTasks(),expectedAdd);
    }
    @Test
    public void sortTest(){
       Assertions.assertIterableEquals(todosTest.sort(listInSort),expectedlistSort);

    }
    @Test
    public void getAllTasksTest(){
       Todos todos=new Todos();
        for (String in:arrTest) {
            todos.addTask(in);
        }
        String result=todos.getAllTasks();
        Assertions.assertEquals(expectedStr,result);
    }
}

