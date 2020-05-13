package com.km.sg;

import com.km.sg.control.Runner;
import com.km.sg.graphics.Drawing;

import javax.swing.*;

public class Main {
    private static final int HEIGHT = 600;
    private static final int WIDTH = 800;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Drawing drawing = new Drawing();
        new Thread(new Runner(drawing)).start();
        frame.add(drawing);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
    }
}
