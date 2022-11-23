package com.mygdx.tankstars.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class InGame extends ScreenAbstract{
    private Texture InGamebg;
    protected InGame(StatesLibrary sl) {
        super(sl);
        InGamebg = new Texture("InGameUI.png");
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(InGamebg, 0, 0, 1280, 720);
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
