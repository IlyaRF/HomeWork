package ru.GB.Gaitanov.I.HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    private Double leftOperand;
    private String operation;

    public Calculator() {

        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 500);
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
                String displayText = display.getText();

                if (".".equals(text) && display.getText().contains(".")) {
                    return;
                }
                if ("0".equals(displayText) && !".".equals(text)) {
                    displayText = "";
                }
                displayText += text;
                display.setText(displayText);
            }
        };

        ActionListener symbolListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                String action = source.getText();
                double rightOperand = Double.parseDouble(display.getText());

                if ("=".equals(action)) {
                    if (leftOperand != null) {
                        switch (operation) {
                            case "+":
                                display.setText(String.valueOf(leftOperand + rightOperand));
                                break;
                            case "-":
                                display.setText(String.valueOf(leftOperand - rightOperand));
                                break;
                            case "/":
                                display.setText(String.valueOf(leftOperand / rightOperand));
                                break;
                            case "*":
                                display.setText(String.valueOf(leftOperand * rightOperand));
                                break;
                            case "%":
                                display.setText(String.valueOf(leftOperand * rightOperand/ 100));
                                break;


                        }
                        leftOperand = Double.parseDouble(display.getText());
                        operation = null;
                    }
                    return;
                }
                leftOperand = Double.parseDouble(display.getText());
                operation = action;
                display.setText("0");
            }
        };

        JPanel numberPanel = new JPanel();
        GridLayout numberLayout = new GridLayout(4, 3, 10, 10);
        numberPanel.setLayout(numberLayout);

        for (int i = 0; i < 10; i++) {
            JButton jButtons = new JButton(String.valueOf(i));
            jButtons.addActionListener(numberListener);
            numberPanel.add(jButtons);
            jButtons.setFont(new Font("Arial", Font.BOLD, 50));
            jButtons.setBackground(Color.yellow);
            jButtons.setSize(50, 50);
        }

        JButton pointButton = new JButton(".");
        pointButton.addActionListener(numberListener);
        pointButton.setFont(new Font("Arial", Font.BOLD, 50));

        JPanel symbolPanel = new JPanel();
        GridLayout symbolLayout = new GridLayout(4, 2, 10, 10);
        symbolPanel.setLayout(symbolLayout);
        for (char c : "C+-*/%=".toCharArray()) {
            JButton jButtons = new JButton(String.valueOf(c));
            jButtons.addActionListener(symbolListener);
            symbolPanel.add(jButtons);
            jButtons.setFont(new Font("Arial", Font.BOLD, 50));
            jButtons.setBackground(Color.orange);
            jButtons.setSize(50, 50);

        }

        add(symbolPanel, BorderLayout.EAST);
        add(pointButton, BorderLayout.AFTER_LAST_LINE);
        add(numberPanel, BorderLayout.WEST);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Calculator();
    }
}


