package ru.GB.Gaitanov.I.secondquarter.HomeWork6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

    private ServerSocket serverSocket;
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    public EchoServer() {
        try {
            Scanner scanner = new Scanner(System.in);
            serverSocket = new ServerSocket(8189);
            System.out.println("Ожидается подключение");
            socket = serverSocket.accept();
            System.out.println("Соединение установлено");
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            Thread serverThread = new Thread(() -> {
                while (true) {
                    clientMessage(scanner.nextLine());
                }
            });
            serverThread.setDaemon(true);
            serverThread.start();
            while (true) {
                String text = in.readUTF();
                if (text.equals("/end")) {
                    clientMessage("/end");
                    break;
                }
                System.out.println("Клиент: " + text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                out.close();
                socket.close();
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Соединение прервано");
    }

    public static void main(String[] args) {
        new EchoServer();
    }

    public void clientMessage(String text) {
        try {
            out.writeUTF(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
