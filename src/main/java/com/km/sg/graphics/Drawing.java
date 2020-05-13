package com.km.sg.graphics;

import java.awt.*;

public class Drawing extends Canvas implements Drawable {
    private Painter painter;

    public void setPainter(Painter painter) {
        this.painter = painter;
    }

    @Override
    public void paint(Graphics g) {
        if (painter != null)
            painter.paint(g);
    }
}
