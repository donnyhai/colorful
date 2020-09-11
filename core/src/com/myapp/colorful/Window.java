package com.myapp.colorful;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.badlogic.gdx.scenes.scene2d.Stage;

import java.util.ArrayList;

//NOTE: Gdx.input.getX/getY considers top left (0,0), batch.draw considers bottom left (0,0)

public class Window {

    int screenWidth = Gdx.graphics.getWidth();
    int screenHeight = Gdx.graphics.getHeight();
    boolean isTouched = false;

    String nextWindow = "noWindowChange";
    ArrayList<String> windowTypes = new ArrayList<String>();

    SpriteBatch batch;

    public void addWindowTypes() {
        windowTypes.add("game");
        windowTypes.add("settings");
        windowTypes.add("howtoplay");
        windowTypes.add("quit");
    }

    public void create() {
        batch = new SpriteBatch();
    }

    public void render() {}

    public void dispose() {}

}
