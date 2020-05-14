package com.km.sg.graphics;

import java.awt.*;

public class Drawing extends Canvas implements Drawable {
    private Painter painter;

    public void setPainter(Painter painter) {
        if (this.painter != null) {
            removeKeyListener(this.painter);
        }
        this.painter = painter;
        addKeyListener(painter);
    }

    @Override
    public void refresh() {
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        if (painter != null)
            painter.paint(g);
    }
}
