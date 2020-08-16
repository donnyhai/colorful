package com.myapp.colorful;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Colorful extends ApplicationAdapter {
	SpriteBatch batch;
	Window window;

	@Override
	public void create () {
		batch = new SpriteBatch();
		window = new MenuWindow();
	}

	@Override
	public void render () {
		batch.begin();
		window.render(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
