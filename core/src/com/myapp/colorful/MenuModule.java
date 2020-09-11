package com.myapp.colorful;

import com.badlogic.gdx.graphics.Texture;

import java.util.ArrayList;

public class MenuModule extends Module {

    public void MenuModule() {

        //create buttons
        ButtonModule startButton = new ButtonModule(this.screenWidth * 1/3, this.screenHeight * 7/9, this.screenWidth * 1/3, this.screenHeight * 1/9);
        startButton.setImages(new Texture("startgamebutton.png"), new Texture("settingsbutton.png"));
        ButtonModule settingsButton = new ButtonModule(this.screenWidth * 1/3, this.screenHeight * 5/9, this.screenWidth * 1/3, this.screenHeight * 1/9);
        settingsButton.setImages(new Texture("settingsbutton.png"), new Texture("settingsbutton.png"));
        ButtonModule howToPlayButton = new ButtonModule(this.screenWidth * 1/3, this.screenHeight * 3/9, this.screenWidth * 1/3, this.screenHeight * 1/9);
        howToPlayButton.setImages(new Texture("howtoplaybutton.jpg"), new Texture("howtoplaybutton.jpg"));
        ButtonModule quitButton = new ButtonModule(this.screenWidth * 1/3,this.screenHeight * 1/9,this.screenWidth * 1/3,this.screenHeight * 1/9);
        quitButton.setImages(new Texture("startgamebutton.png"), new Texture("startgamebutton.png"));

        this.subModules.add(startButton);
        this.subModules.add(settingsButton);
        this.subModules.add(howToPlayButton);
        this.subModules.add(quitButton);

        for(int i = 0; i < this.subModules.size(); i++) {
            this.subModules.get(i).setParentModule(this);
        }

        this.turnVisible();
    }

}
