package ru.GB.Gaitanov.I.HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {

    public Window() {

        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        final JButton[] jButtons = new JButton[20];

        jButtons[0] = new JButton("");
        jButtons[1] = new JButton("CE");
        jButtons[2] = new JButton("ROOT");
        jButtons[3] = new JButton("%");
        jButtons[4] = new JButton("7");
        jButtons[5] = new JButton("8");
        jButtons[6] = new JButton("9");
        jButtons[7] = new JButton("/");
        jButtons[8] = new JButton("4");
        jButtons[9] = new JButton("5");
        jButtons[10] = new JButton("6");
        jButtons[11] = new JButton("X");
        jButtons[12] = new JButton("1");
        jButtons[13] = new JButton("2");
        jButtons[14] = new JButton("3");
        jButtons[15] = new JButton("-");
        jButtons[16] = new JButton("0");
        jButtons[17] = new JButton(".");
        jButtons[18] = new JButton("=");
        jButtons[19] = new JButton("+");





        final LayoutManager boxLayout = new GridLayout(5,4);
        setLayout(boxLayout);
        add(jButtons[1], BorderLayout.NORTH);
        add(jButtons[2], BorderLayout.SOUTH);
        add(jButtons[3], BorderLayout.CENTER);
        add(jButtons[4], BorderLayout.WEST);
        setBounds(new Rectangle());

        jButtons[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButtons[1].setText("on");
            }
        });
        jButtons[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButtons[2].setText("root");
            }
        });
        jButtons[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButtons[3].setText("%");
            }
        });
        jButtons[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButtons[4].setText("/");
            }
        });
        jButtons[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButtons[5].setText("X");
            }
        });
        jButtons[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButtons[6].setText("-");
            }
        });
        jButtons[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButtons[7].setText("+");
            }
        });
        jButtons[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButtons[8].setText("=");
            }
        });
        jButtons[9].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButtons[9].setText(".");
            }
        });

        ActionListener btnListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final JButton button = (JButton) e.getSource();
                final String text = button.getText();
                String btnNumber = text.substring(text.length() - 1);
                jButtons[10].setText(btnNumber);

            }
        };
        for (JButton jButton : jButtons) {
            add(jButton);
            jButton.addActionListener(btnListener);
        }

        setVisible(true);

    }

    public static void main(String[] args) {
        new Window();
    }
}


