package com.jvmfrog.nullgame.ui;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.jvmfrog.nullgame.Vars;

public class MainMenuScreenGroup extends Group {
    private Table table;
    private Table bottomTable;

    public MainMenuScreenGroup() {
        super();
        build();
    }

    public void build() {
        table = new Table().center().add().getTable();
        Table panel = new Table().center();
        panel.add(new Image(new Texture("main_menu_logo.png"))).row();
        panel.add(new TextButton("Single player", Vars.getSkin())).row();
        panel.add(new TextButton("multi player", Vars.getSkin()));
        table.add(panel);
        bottomTable = new Table().right().bottom().add(new Label("v0.1 by JVMFrog null-team", Vars.getSkin())).getTable();
        addActor(bottomTable);
        addActor(table);
    }

    @Override
    public void setSize(float width, float height) {
        super.setSize(width, height);
        table.setSize(width, height);
        bottomTable.setSize(width, height);
    }
}
