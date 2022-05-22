package ru.GB.Gaitanov.I.HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    public Calculator() {

        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setLayout(new BorderLayout());
        JPanel numberPanel = new JPanel();
        GridLayout numberLayout = new GridLayout(5, 4, 10, 10);
        numberPanel.setLayout(numberLayout);

        for (int i = 0; i < 10; i++) {
            final JButton jButtons = new JButton(String.valueOf(i));
            numberPanel.add(jButtons);
            JLabel display = new JLabel("0");
            display.setHorizontalAlignment(SwingConstants.RIGHT);
            display.setFont(new Font("Arial", Font.BOLD, 25));
            add(display, BorderLayout.NORTH);
            add(numberPanel, BorderLayout.CENTER);
        }

        setVisible(true);

    }

    public static void main(String[] args) {
        new Calculator();
    }
}


