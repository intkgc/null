package com.jvmfrog.nullgame.screen;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.jvmfrog.nullgame.ui.MainMenuScreenGroup;

public class MainMenuScreen implements Screen {
    private OrthographicCamera camera;
    private Viewport viewport;
    private Stage stage;

    @Override
    public void show() {
        camera = new OrthographicCamera();
        viewport = new ScreenViewport(camera);
        stage = new Stage();
        stage.setViewport(viewport);
        stage.addActor(new MainMenuScreenGroup());
    }

    @Override
    public void render(float delta) {
        viewport.apply();
        stage.act();
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height);
        camera.position.set(new Vector3(width/2f, height/2f, 0));
        stage.getActors().get(0).setSize(width, height);
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
