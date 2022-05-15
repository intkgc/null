package com.jvmfrog.nullgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

/*Class for constants and static resources =)*/
public class Vars {
    private static Skin skin;

    public static Skin getSkin() {
        return skin == null ? skin = new Skin(Gdx.files.internal("skin/sgx-ui.json")) : skin;
    }
}
