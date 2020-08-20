package com.myapp.colorful;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class MenuWindow extends Window {

    Button startButton;
    Button settingsButton;
    Button howToPlayButton;
    Button quitButton;

    SpriteBatch batch;

    public void create() {
        startButton = new Button(screenWidth * 1/3, screenHeight * 5/7, screenWidth * 1/3, screenHeight * 1/7);
        startButton.setImages(new Texture("startgamebutton.png"), new Texture("settingsbutton.png"));
        settingsButton = new Button(screenWidth * 1/3, screenHeight * 3/7, screenWidth * 1/3, screenHeight * 1/7);
        settingsButton.setImages(new Texture("settingsbutton.png"), new Texture("settingsbutton.png"));
        howToPlayButton = new Button(screenWidth * 1/3, screenHeight * 1/7, screenWidth * 1/3, screenHeight * 1/7);
        howToPlayButton.setImages(new Texture("howtoplaybutton.jpg"), new Texture("howtoplaybutton.jpg"));
        quitButton = new Button(0,0,100,100);
        quitButton.setImages(new Texture("startgamebutton.png"), new Texture("startgamebutton.png"));

        batch = new SpriteBatch();
    }

    public void render() {
        batch.begin();

        //Gdx.gl.glClearColor(0, 0, 0, 1);
        //Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        startButton.draw(batch);
        settingsButton.draw(batch);
        howToPlayButton.draw(batch);
        //quitButton.draw(batch);

        int lastX = 0;
        int lastY = 0;

        if(Gdx.input.isTouched()) {
            isTouched = true;
            int x = Gdx.input.getX();
            int y = Gdx.input.getY();
            lastX = x;
            lastY = y;
            if(startButton.isTouched(x,y)) {
                startButton.actualImg = startButton.downImg;
            }
            else {
                startButton.actualImg = startButton.upImg;
            }
        }

        if(!Gdx.input.isTouched() && isTouched) {
            isTouched = false;
            if(startButton.isTouched(lastX,lastY)) {
                this.nextWindow = "game";
            }
        }



        batch.end();
    }

    public void dispose() {
        batch.dispose();
    }



}
