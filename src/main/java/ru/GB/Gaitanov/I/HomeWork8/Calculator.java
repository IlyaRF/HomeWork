package ru.GB.Gaitanov.I.HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    public Calculator() {

        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 600, 600);
        setLayout(new BorderLayout());

        JLabel display = new JLabel("0");
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 70));
        add(display, BorderLayout.NORTH);

        ActionListener numberListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JButton jButtons = (JButton) e.getSource();
                String text = jButtons.getText();
                if (".".equals(text) && display.getText().contains(".")) {
                    return;
                }
                String displayText = display.getText();
                displayText += text;
                display.setText(displayText);
            }
        };

        JPanel numberPanel = new JPanel();
        add(numberPanel, BorderLayout.CENTER);
        GridLayout numberLayout = new GridLayout(5, 4, 10, 10);
        numberPanel.setLayout(numberLayout);

        for (int i = 0; i < 10; i++) {
            final JButton jButtons = new JButton(String.valueOf(i));
            jButtons.addActionListener(numberListener);
            numberPanel.add(jButtons);

            jButtons.setFont(new Font("Arial", Font.BOLD, 50));
        }
        JButton pointButton = new JButton(".");
        JButton plusOrMinus = new JButton("+/-");
        JButton multiply = new JButton("*");
        JButton divide = new JButton("/");
        JButton percent = new JButton("%");
        JButton result = new JButton("=");
        JButton root = new JButton("root");
        JButton reset = new JButton("CE");

numberPanel.add(pointButton);
        numberPanel.add(plusOrMinus);
        numberPanel.add(multiply);
        numberPanel.add(divide);
        numberPanel.add(percent);
        numberPanel.add(result);
        numberPanel.add(root);
        numberPanel.add(reset);

        setVisible(true);

    }

    public static void main(String[] args) {
        new Calculator();
    }
}


