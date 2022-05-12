package com.jvmfrog.nullgame.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.jvmfrog.nullgame.Main;

public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

        config.title = "null";
        config.addIcon("logo.png", Files.FileType.Internal);

        new LwjglApplication(new Main(), config);
    }
}
