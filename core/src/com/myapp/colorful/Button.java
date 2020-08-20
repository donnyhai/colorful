package com.myapp.colorful;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import javax.swing.plaf.TextUI;

public class Button {

    int xpos;
    int ypos;
    int width;
    int height;

    Texture upImg;
    Texture downImg;
    Texture actualImg;

    public Button(int xpos, int ypos, int width, int height) {
        this.xpos = xpos;
        this.ypos = ypos;
        this.width = width;
        this.height = height;
    }

    public void setImages(Texture upImg, Texture downImg) {
        this.upImg = upImg;
        this.downImg = downImg;
        this.actualImg = upImg;
    }

    public boolean isTouched(int xtouch, int ytouch) {
        if(xpos < xtouch && xtouch < (xpos + width) && ypos < ytouch && ytouch < (ypos + height)) {
            return true;
        }
        return false;
    }

    public void draw(SpriteBatch batch) {
        batch.draw(actualImg, xpos, ypos, width, height);
    }


}
