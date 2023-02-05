package ru.netology.javacore;

public class LogicManager {
    private String RESTORE = "RESTORE";
    private String ADD = "ADD";
    private String REMOVE = "REMOVE";
    Memory memory = new Memory();

    public void convertCommand(Todos todos, Operation operation) {
        if (operation.getType().equals(RESTORE)) {
            todos.setListTasks(memory.pollMemory());
            return;
        }
        memory.addMemory(todos.getListTasks());
        if (operation.getType().equals(ADD)) {
            todos.addTask(operation.getTask());
        }
        if (operation.getType().equals(REMOVE)) {
            todos.removeTask(operation.getTask());
        }
    }
}



