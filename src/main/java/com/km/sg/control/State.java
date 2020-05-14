package com.km.sg.control;

import com.km.sg.graphics.Drawable;
import com.km.sg.graphics.Painter;
import com.km.sg.painters.SplashScreen;

public class State {
    private Drawable drawable;

    public State(Drawable drawable) {
        this.drawable = drawable;
    }

    void initialize() {
        SplashScreen splashScreen = new SplashScreen();
        drawable.setPainter(splashScreen);

    }
}
