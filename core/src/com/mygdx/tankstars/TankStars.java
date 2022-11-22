package com.mygdx.tankstars;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.tankstars.screens.StatesLibrary;
import com.mygdx.tankstars.screens.StartPage;

public class TankStars extends ApplicationAdapter {
	private SpriteBatch batch;
	private StatesLibrary sl;

	@Override
	public void create () {
		batch = new SpriteBatch();
		sl = new StatesLibrary();
		Gdx.gl.glClearColor(0, 0, 0, 1);
		sl.push(new StartPage(sl));
	}

	@Override
	public void render () {
	 Gdx.gl.glClear(Gdx.gl.GL_COLOR_BUFFER_BIT);
	 sl.update(Gdx.graphics.getDeltaTime());
	 sl.render(batch);
	}

}
