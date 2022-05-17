package com.jvmfrog.nullgame.ui;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.jvmfrog.nullgame.Main;
import com.jvmfrog.nullgame.world.SinglePlayerWorld;
import com.jvmfrog.nullgame.world.WorldScreen;
import com.jvmfrog.nullgame.util.Values;

public class MainMenuGroup extends Group {


    private Table table;
    private Table bottomTable;

    public MainMenuGroup(Main main) {
        super();
        build(main);
    }

    public void build(Main main) {
        Button button = new TextButton("Single player", Values.getSkin());

        table = new Table().center().add().getTable();
        Table panel = new Table().center();
        panel.add(new Image(new Texture("main_menu_logo.png"))).row();
        panel.add(button).row();
        panel.add(new TextButton("multi player", Values.getSkin()));
        table.add(panel);
        bottomTable = new Table().right().bottom().add(new Label("v0.1 by JVMFrog null-team", Values.getSkin())).getTable();
        addActor(bottomTable);
        addActor(table);

        button.addListener(new InputListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                main.setScreen(new WorldScreen(new SinglePlayerWorld()));
                return true;
            }
        });
    }

    @Override
    public void setSize(float width, float height) {
        super.setSize(width, height);
        table.setSize(width, height);
        bottomTable.setSize(width, height);
    }
}
