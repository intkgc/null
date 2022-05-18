package com.jvmfrog.nullgame.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.jvmfrog.nullgame.Main;
import com.jvmfrog.nullgame.util.Values;

public class MainMenuScreen implements Screen {

    private final Stage stage;

    public MainMenuScreen(){
        stage = new Stage();
    }

    @Override
    public void show() {
        Values.getMusicHandler().play("main_menu", true);
        stage.setViewport(new ScreenViewport());
        stage.addActor(new MainMenuGroup());
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render(float delta) {
        stage.getViewport().apply();
        stage.act();
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        stage.getActors().get(0).setSize(width, height);
        stage.getViewport().update(width, height);
        stage.getCamera().position.set(new Vector3(width/2f, height/2f, 0));
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
