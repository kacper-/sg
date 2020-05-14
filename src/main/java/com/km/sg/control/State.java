package com.km.sg.control;

import com.km.sg.control.painters.GameScreen;
import com.km.sg.control.painters.SplashScreen;
import com.km.sg.graphics.Drawable;

public class State {
    private Drawable drawable;

    public State(Drawable drawable) {
        this.drawable = drawable;
    }

    void initialize() {
        SplashScreen splashScreen = new SplashScreen();
        drawable.setPainter(splashScreen);
        drawable.refresh();
        splashScreen.waitForKey();
    }

    void game() {
        GameScreen gameScreen = new GameScreen();
        drawable.setPainter(gameScreen);
        drawable.refresh();
    }
}
