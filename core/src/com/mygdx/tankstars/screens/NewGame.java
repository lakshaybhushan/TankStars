package com.mygdx.tankstars.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.mygdx.tankstars.Tank;


public class NewGame extends ScreenAbstract{
    private Texture Background;
    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;
    private OrthographicCamera camera;
    //private Texture leftSideTank;
    private Tank tank;

    public NewGame(StatesLibrary sl) {
        super(sl);
        tank = new Tank(50, 100);
        Background = new Texture("Background.png");
        map = new TmxMapLoader().load("NewTerrain.tmx");
        //leftSideTank = new Texture("GreenTankRight.png");

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

        if (Gdx.input.isKeyJustPressed(Input.Keys.D)) {
            tank.MoveRight();
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
        tank.update(dt);
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(Background, 0, 0, 1280, 720);
        sb.draw(tank.getTank(),tank.getPosition().x,tank.getPosition().y);
        renderer.setView(camera);
        renderer.render();
        sb.end();

    }

    @Override
    public void dispose() {

    }
}
