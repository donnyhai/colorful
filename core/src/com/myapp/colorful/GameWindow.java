package com.myapp.colorful;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameWindow extends Window {

    SpriteBatch batch;

    public void create() {
        batch = new SpriteBatch();
    }

    public void render() {
        batch.begin();
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.end();
    }

    public void dispose() {
        batch.dispose();
    }
}
