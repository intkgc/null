package com.jvmfrog.nullgame.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.jvmfrog.nullgame.audio.MusicHandler;

/*Class for constants and static resources =)*/
public class Values {
    private static Skin skin;
    private static MusicHandler musicHandler;

    public static Skin getSkin() {
        return skin == null ? skin = new Skin(Gdx.files.internal("skin/sgx-ui.json")) : skin;
    }

    public static MusicHandler getMusicHandler() {
        return musicHandler == null ? musicHandler = new MusicHandler() : musicHandler;
    }
}
