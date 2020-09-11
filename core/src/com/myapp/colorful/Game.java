package com.myapp.colorful;

import java.util.ArrayList;

public class Game {

    ArrayList<Module> modules;
    MenuModule menuModule;
    GameModule gameModule;
    SettingsModule settingsModule;

    public void Game() {
        this.menuModule = new MenuModule();
        this.gameModule = new GameModule();
        this.settingsModule = new SettingsModule();

        this.modules.add(menuModule);
        this.modules.add(gameModule);
        this.modules.add(settingsModule);
    }

}
