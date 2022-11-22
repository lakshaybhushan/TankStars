package com.mygdx.tankstars.screens;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

public class StatesLibrary {
    private Stack<ScreenAbstract> screens;

    public StatesLibrary() {
        screens = new Stack<ScreenAbstract>();
    }
    public void push(ScreenAbstract state) {

        screens.push(state);
    }
    public void pop() {

        screens.pop();
    }
    public void set(ScreenAbstract state) {

        screens.pop();

        screens.push(state);
    }
    public void update(float dt) {

        screens.peek().update(dt);
    }
    public void render(SpriteBatch sb) {

        screens.peek().render(sb);
    }

}
