package com.mygdx.tankstars.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.*;

public class MainMenu extends ScreenAbstract {
    private Texture Menubg;
    private Texture NewGameButton;
    private Texture LoadGameButton;
    private Texture ExitButton;
    private Rectangle constraintNGBtn;
    private Rectangle constraintLGBtn;
    private Rectangle constraintExitBtn;


    protected MainMenu(StatesLibrary sl) {
        super(sl);
        Menubg = new Texture("MainMenu.png");
        NewGameButton = new Texture("NewGamebutton.png");
        LoadGameButton = new Texture("LoadGamebutton.png");
        ExitButton = new Texture("Exitbutton.png");
        constraintNGBtn = new Rectangle(490,436,300,67);
        constraintLGBtn = new Rectangle(465, 302, 300, 67);
        constraintExitBtn = new Rectangle(465, 193, 300, 67);


    }

    @Override
    protected void handleInput() {
        if (Gdx.input.justTouched()) {
            if (constraintNGBtn.contains(Gdx.input.getX(),720-Gdx.input.getY())) { //Height of window = 720p
                sl.set(new ChooseATank(sl));
                dispose();
            }
        }

    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(Menubg, 0, 0, 1280, 720);
        sb.draw(NewGameButton, 490, 435.6f, NewGameButton.getWidth(), NewGameButton.getHeight());
        sb.draw(LoadGameButton, 490, 326.6f, LoadGameButton.getWidth(), LoadGameButton.getHeight());
        sb.draw(ExitButton, 490, 217.6f, ExitButton.getWidth(), ExitButton.getHeight());
        sb.end();

    }

    @Override
    public void dispose() {

    }
}
