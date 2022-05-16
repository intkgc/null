package com.jvmfrog.nullgame.audio;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.files.FileHandle;

import java.util.HashMap;

public class MusicHandler {
    private float volume = 1f;

    private final HashMap<String, Music> musicMap = new HashMap<>();

    public MusicHandler() {
        load();
    }

    private void load() {
        musicMap.clear();
        String[] audios = Gdx.files.internal("audio/music.list")
                .readString().split("\\r?\\n");

        for (String audio : audios) {
            FileHandle audioFile = Gdx.files.internal("audio/" + audio + ".mp3");
            musicMap.put(audio, Gdx.audio.newMusic(audioFile));
        }
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public Music get(String name) {
        return musicMap.get(name);
    }

    public void play(Music music, boolean loop) {
        music.setVolume(volume);
        music.setLooping(loop);
        music.play();
    }

    public void play(String name, boolean loop) {
        play(get(name), loop);
    }
}
