package com.km.sg.control;

import com.km.sg.graphics.Drawable;

public class Runner implements Runnable {
    private State state;

    public Runner(Drawable drawable) {
        state = new State(drawable);
    }

    @Override
    public void run() {
        state.initialize();
        state.game();
    }
}
