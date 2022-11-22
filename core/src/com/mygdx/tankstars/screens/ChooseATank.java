package com.mygdx.tankstars.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ChooseATank extends ScreenAbstract{

    private Texture ChooseATankbg;
    private Texture RedTank;
    private Texture GreenTank;
    private Texture BrownTank;

    protected ChooseATank(StatesLibrary sl) {
        super(sl);
        ChooseATankbg = new Texture("ChooseATank.png");
        RedTank = new Texture("RedFrmTank.png");
        GreenTank = new Texture("GreenFrmTank.png");
        BrownTank = new Texture("BrownFrmTank.png");
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
        sb.draw(ChooseATankbg, 0, 0, 1280, 720);
        sb.draw(RedTank, 76, 172.93f, RedTank.getWidth(), RedTank.getHeight());
        sb.draw(GreenTank, 463, 172.93f, GreenTank.getWidth(), GreenTank.getHeight());
        sb.draw(BrownTank, 850, 172.93f, BrownTank.getWidth(), BrownTank.getHeight());
        sb.end();

    }

    @Override
    public void dispose() {

    }
}
