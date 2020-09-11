package com.myapp.colorful;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

public class Module {

    int screenWidth = Gdx.graphics.getWidth();
    int screenHeight = Gdx.graphics.getHeight();

    boolean visible = false;
    ArrayList<Module> subModules = new ArrayList<Module>();

    Module parentModule;

    public void render(SpriteBatch batch) {
        batch.begin();
        //render
        batch.end();
    }

    public void addSubModule(Module module) {
        this.subModules.add(module);
    }

    public void setParentModule(Module module) {
        this.parentModule = module;
    }

    public void turnVisible() {
        this.visible = true;
        for(int i = 0; i < this.subModules.size(); i++) {
            this.subModules.get(i).turnVisible();
        }
    }

    public void turnInvisible() {
        this.visible = false;
        for(int i = 0; i < this.subModules.size(); i++) {
            this.subModules.get(i).turnInvisible();
        }
    }




}
