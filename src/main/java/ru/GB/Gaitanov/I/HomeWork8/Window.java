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
        final JButton[] jButtons= new JButton[19];
        final JButton button1 = new JButton("CE");
        final JButton button2 = new JButton("ROOT");
        final JButton button3 = new JButton("%");
        final JButton button4 = new JButton("/");
        final JButton button5 = new JButton("X");
        final JButton button6 = new JButton("-");
        final JButton button7 = new JButton("+");
        final JButton button8 = new JButton("=");
        final JButton button9 = new JButton(".");
        final JButton button10 = new JButton("0");
        final JButton button11 = new JButton("1");
        final JButton button12 = new JButton("2");
        final JButton button13 = new JButton("3");
        final JButton button14 = new JButton("4");
        final JButton button15 = new JButton("5");
        final JButton button16 = new JButton("6");
        final JButton button17 = new JButton("7");
        final JButton button18 = new JButton("8");
        final JButton button19 = new JButton("9");

        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);
        add(button3, BorderLayout.CENTER);
        add(button4, BorderLayout.WEST);
        setBounds(new Rectangle());

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setText("on");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button2.setText("root");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button3.setText("%");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button4.setText("/");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button5.setText("X");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button6.setText("-");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button7.setText("+");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button8.setText("=");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button9.setText(".");
            }
        });

        ActionListener btnListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final  JButton button = (JButton) e.getSource();
                final  String text = button.getText();
                String btnNumber = text.substring(text.length() - 1);
                button10.setText(btnNumber);

            }
        };
        button10.addActionListener(btnListener);
        button11.addActionListener(btnListener);
        button12.addActionListener(btnListener);
        button13.addActionListener(btnListener);
        button14.addActionListener(btnListener);
        button15.addActionListener(btnListener);
        button16.addActionListener(btnListener);
        button17.addActionListener(btnListener);
        button18.addActionListener(btnListener);
        button19.addActionListener(btnListener);


        setVisible(true);

    }

    public static void main(String[] args) {
        new Window();
    }
}

class Buttons implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
