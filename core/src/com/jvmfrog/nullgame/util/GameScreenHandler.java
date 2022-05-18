package com.jvmfrog.nullgame.util;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

public class GameScreenHandler {
    private final Game game;

    public GameScreenHandler(Game game) {
        this.game = game;
    }

    public void setScreen(Screen screen) {
        game.setScreen(screen);
    }

    public Screen getScreen() {
        return game.getScreen();
    }
}
