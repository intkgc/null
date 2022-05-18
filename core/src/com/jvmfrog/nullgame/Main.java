package com.jvmfrog.nullgame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.jvmfrog.nullgame.ui.MainMenuScreen;
import com.jvmfrog.nullgame.util.GameScreenHandler;
import com.jvmfrog.nullgame.util.Values;

public class Main extends Game {
	@Override
	public void create () {
		Values.setGameScreenHandler(new GameScreenHandler(this));
		setScreen(new MainMenuScreen());
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		super.render();
	}
}
