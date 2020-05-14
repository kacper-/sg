package com.km.sg.graphics;

import java.awt.*;
import java.awt.event.KeyListener;

public abstract class Painter implements KeyListener {
    public abstract void paint(Graphics g);
}
