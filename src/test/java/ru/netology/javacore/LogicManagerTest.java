package ru.netology.javacore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogicManagerTest {
    Todos todos = new Todos();
    LogicManager lm = new LogicManager();
    Operation[] arrOpera = {new Operation("ADD"), new Operation("ADD"), new Operation("REMOVE"), new Operation("RESTORE")};

    {
        arrOpera[0].setTask("A");
        arrOpera[1].setTask("B");
        arrOpera[2].setTask("A");
    }

    String[] arrExpected = {"A ", "A B ", "B ", "A B "};

    @Test
    public void convertCommandTest() {
        for (int i = 0; i < arrOpera.length; i++) {
            lm.convertCommand(todos, arrOpera[i]);
            Assertions.assertEquals(arrExpected[i], todos.getAllTasks());
        }
    }

}
