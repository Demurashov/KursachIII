package ru.netology.javacore;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TodoServer {
    int port;
    Todos todos;

    public TodoServer(int port, Todos todos) {
        this.port = port;
        this.todos = todos;
    }

    private Gson gsn = new Gson();
    private LogicManager logicManager = new LogicManager();

    public void start() throws IOException {
        System.out.println("Starting server at " + port + "...");
        ServerSocket serverSocket = new ServerSocket(port);
        while (true) {
            try (Socket clientSocket = serverSocket.accept();
                 PrintWriter printWriter = new PrintWriter(clientSocket.getOutputStream(), true);
                 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            ) {
                System.out.println("Подключен клиент:" + clientSocket.getPort());
                String in = bufferedReader.readLine();
                if (in != null && in.equals("Q")) {
                    System.out.println("Получена команда на отключение!");
                    break;
                } else if (in == null) {
                    System.out.println("Получен от клиента null!!!");
                    continue;
                }
                System.out.println("Получено сообщение от клиента: " + in);
                Operation operation = gsn.fromJson(in, Operation.class);
                logicManager.convertCommand(todos, operation);
                System.out.println(todos.getAllTasks());
                String out = "План, много плана: " + todos.getAllTasks();
                System.out.println("Отправлено:" + out);
                printWriter.println(out);
            }
        }
    }
}


