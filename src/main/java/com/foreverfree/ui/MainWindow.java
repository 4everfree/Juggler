package com.foreverfree.ui;

import javax.swing.*;

public class MainWindow {
    public MainWindow() {
        JFrame frame = new JFrame();
        JButton button = new JButton("Get distribution");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
