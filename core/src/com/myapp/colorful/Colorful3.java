package com.myapp.colorful;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Colorful3 extends ApplicationAdapter {
    Window window;

    @Override
    public void create () {
        window = new MenuWindow();
        window.create();
    }

    @Override
    public void render () {
        window.render();
        if(window.nextWindow != "noWindowChange") {
            if(window.nextWindow == "game") {
                window = new GameWindow();
                window.create();
            }
            else if(window.nextWindow == "settings") {
                window = new SettingsWindow();
                window.create();
            }
            else if(window.nextWindow == "howtoplay") {
                window = new HowToPlayWindow();
                window.create();
            }
            else if(window.nextWindow == "quit") {
                window = new QuitWindow();
                window.create();
            }
            window.nextWindow = "noWindowChange";
        }
    }

    @Override
    public void dispose () {
        window.dispose();
    }

}
