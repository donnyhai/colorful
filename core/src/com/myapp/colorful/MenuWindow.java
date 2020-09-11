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

import java.util.ArrayList;

public class MenuWindow extends Window {

    Button startButton;
    Button settingsButton;
    Button howToPlayButton;
    Button quitButton;
    ArrayList<Button> buttons = new ArrayList<Button>();

    int lastX = 0;
    int lastY = 0;

    public void create() {
        //create buttons
        startButton = new Button(screenWidth * 1/3, screenHeight * 7/9, screenWidth * 1/3, screenHeight * 1/9);
        startButton.setImages(new Texture("startgamebutton.png"), new Texture("settingsbutton.png"));
        settingsButton = new Button(screenWidth * 1/3, screenHeight * 5/9, screenWidth * 1/3, screenHeight * 1/9);
        settingsButton.setImages(new Texture("settingsbutton.png"), new Texture("settingsbutton.png"));
        howToPlayButton = new Button(screenWidth * 1/3, screenHeight * 3/9, screenWidth * 1/3, screenHeight * 1/9);
        howToPlayButton.setImages(new Texture("howtoplaybutton.jpg"), new Texture("howtoplaybutton.jpg"));
        quitButton = new Button(screenWidth * 1/3,screenHeight * 1/9,screenWidth * 1/3,screenHeight * 1/9);
        quitButton.setImages(new Texture("startgamebutton.png"), new Texture("startgamebutton.png"));

        buttons.add(startButton);
        buttons.add(settingsButton);
        buttons.add(howToPlayButton);
        buttons.add(quitButton);

        batch = new SpriteBatch();
    }

    public void render() {
        batch.begin();

        //Gdx.gl.glClearColor(0, 0, 0, 1);
        //Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        //draw buttons
        for(int i = 0; i < buttons.size(); i++) {
            buttons.get(i).draw(batch);
        }

        if(Gdx.input.isTouched()) {
            isTouched = true;
            int x = Gdx.input.getX();
            int y = screenHeight - Gdx.input.getY();
            lastX = x;
            lastY = y;

            for(int i = 0; i < buttons.size(); i++) {
                Button button = buttons.get(i);
                if(button.isTouched(x,y)) {
                    button.actualImg = button.downImg;
                }
                else {
                    button.actualImg = button.upImg;
                }
            }
        }

        if(!Gdx.input.isTouched() && isTouched) {
            isTouched = false;
            for(int i = 0; i < buttons.size(); i++ ) {
                if(buttons.get(i).isTouched(lastX, lastY)) {
                    this.nextWindow = windowTypes.get(i);
                    break;
                }
            }
        }

        batch.end();
    }

}
