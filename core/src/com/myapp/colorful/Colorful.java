package com.myapp.colorful;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Colorful extends ApplicationAdapter {
	Window window;

	@Override
	public void create () {
		window = new MenuWindow();
		window.create();
	}

	@Override
	public void render () {
		window.render();
	}
	
	@Override
	public void dispose () {
		window.dispose();
	}

}
