package com.myapp.colorful;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Colorful extends ApplicationAdapter {

	Game game;
	SpriteBatch batch;

	@Override
	public void create () {
		this.game = new Game();
		this.batch = new SpriteBatch();
	}

	@Override
	public void render () {
		for(int i = 0; i < this.game.modules.size(); i++) {
			Module module = this.game.modules.get(i);
			if(module.visible) {
				module.render(this.batch);
			}
		}
	}

	@Override
	public void dispose () {
		this.batch.dispose();
	}

}