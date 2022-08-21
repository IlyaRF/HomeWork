package ru.GB.Gaitanov.I.secondquarter.HomeWork7.server;

import java.util.ArrayList;
import java.util.List;

public interface AuthService {
    void start();
    String getNickByLoginPass(String login, String pass);
    void stop();
}
