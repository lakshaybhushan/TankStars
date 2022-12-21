package com.mygdx.tankstars.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;


public class NewGame extends ScreenAbstract{
    private Texture Background;
    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;
    private OrthographicCamera camera;
    private Sprite tankSprite1;
    private Sprite tankSprite2;


    //private Texture leftSideTank;

    public NewGame(StatesLibrary sl) {
        super(sl);
        Background = new Texture("Background.png");
        map = new TmxMapLoader().load("NewTerrain.tmx");
        tankSprite1 = new Sprite(new Texture("GreenTankRight.png"));
        tankSprite1.setPosition(50, 120);
        tankSprite2 = new Sprite(new Texture("BrownTankLeft.png"));
        tankSprite2.setPosition(1100, 120);
        renderer = new OrthogonalTiledMapRenderer(map);
        camera = new OrthographicCamera();
        camera.viewportHeight = 720;
        camera.viewportWidth = 1280;
        camera.position.set(640,360,0);
        camera.update();
    }

    @Override
    protected void handleInput() {
        if (Gdx.input.isKeyPressed(Input.Keys.ESCAPE)) {
            sl.set(new PauseGame(sl));
            dispose();
        }
        if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            tankSprite1.setPosition(tankSprite1.getX() - 2, tankSprite1.getY());
        }
        if (Gdx.input.isKeyPressed(Input.Keys.D)) {
            tankSprite1.setPosition(tankSprite1.getX() + 2, tankSprite1.getY());
        }

        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            tankSprite2.setPosition(tankSprite2.getX() - 2, tankSprite2.getY());
        }
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            tankSprite2.setPosition(tankSprite2.getX() + 2, tankSprite2.getY());
        }

    }

    @Override
    public void update(float dt) {
        handleInput();
        if (tankSprite1.getX() < 0) {
            tankSprite1.setPosition(0, tankSprite1.getY());
        }
        if (tankSprite2.getX() > 1280 - tankSprite2.getWidth()) {
            tankSprite2.setPosition(1280 - tankSprite2.getWidth(), tankSprite2.getY());}
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(Background, 0, 0, 1280, 720);
        renderer.setView(camera);
        renderer.render();
        tankSprite2.draw(sb);
        tankSprite1.draw(sb);
        sb.end();

    }

    @Override
    public void dispose() {

    }
}
