package com.km.sg.painters;

import com.km.sg.graphics.Painter;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SplashScreen extends Painter {
    @Override
    public void paint(Graphics g) {
        g.drawString("Splash screen", 100, 100);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
