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
        add(button4, BorderLayout.NORTH);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button10.setText("0");
                button11.setText("1");
                button12.setText("2");
                button13.setText("3");
                button14.setText("4");
                button15.setText("5");
                button16.setText("6");
                button17.setText("7");
                button18.setText("8");
                button19.setText("9");
                setBounds(new Rectangle());
                setVisible(true);


            }

            public static void main(String[] args) {
                new Window();
            }

            class Buttons extends ActionListener {


                @Override
                public void actionPerformed(ActionEvent e) {

                }
            }
