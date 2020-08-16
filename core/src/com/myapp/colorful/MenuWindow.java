package com.myapp.colorful;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MenuWindow extends Window {

    Texture startButton;
    Texture settingsButton;
    Texture howToPlayButton;

    Texture img;

    public void create() {
        //startButton = new Texture("startgamebutton.png");
        //settingsButton = new Texture("settingsbutton.png");
        //howToPlayButton = new Texture("howtoplaybutton.jpg");
        img = new Texture("badlogic.png");
    }

    public void render(SpriteBatch batch) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        //batch.draw(startButton, 0, 0);
        //batch.draw(settingsButton, 0, 200);
        //batch.draw(howToPlayButton, 0, 400);
        batch.draw(img,0,0);
    }



}
