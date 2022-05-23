package ru.GB.Gaitanov.I.HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    public Calculator() {

        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 600);
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

        JPanel numberPanel = new JPanel();
        GridLayout numberLayout = new GridLayout(4, 3, 10, 10);
        numberPanel.setLayout(numberLayout);

        for (int i = 0; i < 10; i++) {
            final JButton jButtons = new JButton(String.valueOf(i));
            jButtons.addActionListener(numberListener);
            numberPanel.add(jButtons);
            jButtons.setFont(new Font("Arial", Font.BOLD, 50));
        }

        JButton pointButton = new JButton(".");
        pointButton.addActionListener(numberListener);
        pointButton.setFont(new Font("Arial", Font.BOLD, 50));

        JPanel symbolPanel = new JPanel();
        GridLayout symbolLayout = new GridLayout(4, 2, 10, 10);
        symbolPanel.setLayout(symbolLayout);
        for (char c : "C+-*/%=".toCharArray()) {
            JButton jButtons = new JButton(String.valueOf(c));
            symbolPanel.add(jButtons);
            jButtons.setFont(new Font("Arial", Font.BOLD, 50));

        }

        /*plusOrMinus.setFont(new Font("Arial", Font.BOLD, 50));
        multiply.setFont(new Font("Arial", Font.BOLD, 50));
        divide.setFont(new Font("Arial", Font.BOLD, 50));
        percent.setFont(new Font("Arial", Font.BOLD, 50));
        result.setFont(new Font("Arial", Font.BOLD, 50));
        root.setFont(new Font("Arial", Font.BOLD, 50));
        reset.setFont(new Font("Arial", Font.BOLD, 50));


        numberPanel.add(pointButton);
        numberPanel.add(plusOrMinus);
        numberPanel.add(multiply);
        numberPanel.add(divide);
        numberPanel.add(percent);
        numberPanel.add(result);
        numberPanel.add(root);
        numberPanel.add(reset);*/

        add(symbolPanel, BorderLayout.EAST);
        add(pointButton, BorderLayout.AFTER_LAST_LINE);
        add(numberPanel, BorderLayout.WEST);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Calculator();
    }
}


