package ru.netology.javacore;

public class LogicManager {
    private static final String RESTORE = "RESTORE";
    private static final String ADD = "ADD";
    private static final String REMOVE = "REMOVE";
    Memory memory = new Memory();

    public void convertCommand(Todos todos, Operation operation) {
        if (operation.getType().equals(RESTORE)) {
            todos.setSetTasks(memory.pollMemory());
            return;
        }
        memory.addMemory(todos.getSetTasks());
        if (operation.getType().equals(ADD)) {
            todos.addTask(operation.getTask());
        }
        if (operation.getType().equals(REMOVE)) {
            todos.removeTask(operation.getTask());
        }
    }
}



