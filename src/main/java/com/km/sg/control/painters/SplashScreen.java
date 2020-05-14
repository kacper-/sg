package com.km.sg.control.painters;

import com.km.sg.graphics.Painter;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SplashScreen extends Painter {
    private static final long DELAY = 250;
    private boolean wait = true;

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
        wait = false;
    }

    public void waitForKey() {
        try {
            while (wait)
                Thread.sleep(DELAY);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
