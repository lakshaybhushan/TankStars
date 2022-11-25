package com.mygdx.tankstars.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class NewGame extends ScreenAbstract{
    private Texture NewGameStatic;
    protected NewGame(StatesLibrary sl) {
        super(sl);

        NewGameStatic = new Texture("NewGameStatic.png");
    }

    @Override
    protected void handleInput() {
        if (Gdx.input.isKeyPressed(Input.Keys.ESCAPE)) {
            sl.set(new PauseGame(sl));
            dispose();
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(NewGameStatic, 0, 0, 1280, 720);
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
