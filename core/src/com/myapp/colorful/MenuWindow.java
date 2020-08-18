package com.myapp.colorful;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class MenuWindow extends Window {

    Texture startButton;
    Texture settingsButton;
    Texture howToPlayButton;

    SpriteBatch batch;

    public void create() {
        startButton = new Texture("startgamebutton.png");
        settingsButton = new Texture("settingsbutton.png");
        howToPlayButton = new Texture("howtoplaybutton.jpg");

        batch = new SpriteBatch();
    }

    public void render() {
        batch.begin();

        //Gdx.gl.glClearColor(0, 0, 0, 1);
        //Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.draw(startButton, screenWidth * 1/3, screenHeight * 5/7, screenWidth * 1/3, screenHeight * 1/7);
        batch.draw(settingsButton, screenWidth * 1/3, screenHeight * 3/7, screenWidth * 1/3, screenHeight * 1/7);
        batch.draw(howToPlayButton, screenWidth * 1/3, screenHeight * 1/7, screenWidth * 1/3, screenHeight * 1/7);

        batch.end();
    }

    public void dispose() {
        batch.dispose();
    }



}
