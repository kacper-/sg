package com.km.sg.painters;

import com.km.sg.graphics.Painter;

import java.awt.*;

public class SplashScreen implements Painter {
    @Override
    public void paint(Graphics g) {
        g.drawRect(100, 100, 100, 100);
    }
}
